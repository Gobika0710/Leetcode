class TaskManager {
    private static class Task {
        int userId, taskId, priority;
        Task(int u, int t, int p) {
            userId = u; taskId = t; priority = p;
        }
    }

    private final Map<Integer, int[]> taskMap;
   
    private final PriorityQueue<Task> pq;

    public TaskManager(List<List<Integer>> tasks) {
        taskMap = new HashMap<>();
        pq = new PriorityQueue<>((a, b) -> {
            if (b.priority != a.priority) return b.priority - a.priority;
            return b.taskId - a.taskId;
        });

        for (List<Integer> t : tasks) {
            int userId = t.get(0), taskId = t.get(1), priority = t.get(2);
            taskMap.put(taskId, new int[]{userId, priority});
            pq.offer(new Task(userId, taskId, priority));
        }
    }

    public void add(int userId, int taskId, int priority) {
        taskMap.put(taskId, new int[]{userId, priority});
        pq.offer(new Task(userId, taskId, priority));
    }

    public void edit(int taskId, int newPriority) {
        int[] cur = taskMap.get(taskId);
        if (cur == null) return;
        cur[1] = newPriority;
        pq.offer(new Task(cur[0], taskId, newPriority));
    }

    public void rmv(int taskId) {
        taskMap.remove(taskId); 
    }

    public int execTop() {
        while (!pq.isEmpty()) {
            Task top = pq.peek();
            int[] cur = taskMap.get(top.taskId);

            if (cur == null || cur[0] != top.userId || cur[1] != top.priority) {
                pq.poll();
                continue;
            }
            pq.poll();
            taskMap.remove(top.taskId);
            return top.userId;
        }
        return -1;
    }
}
