class Solution {
    public int countLargestGroup(int n) {
                Map<Integer, Integer> map=new HashMap<>();
        for(int i=1;i<=n;i++){
            int num=i;
            int ele=0;
            if(num>=10){
                while(num!=0){
                     ele=ele+(num%10);
                     num=num/10;
                }
                if(map.containsKey(ele)){
                    map.put(ele, map.get(ele)+1);
                }
                else{
                    map.put(ele,1);
                }
            }
            else{
                 if(map.containsKey(num)){
                    map.put(num, map.get(num)+1);
                }
                else{
                    map.put(num,1);
                }
            }
        }
        int result=Collections.max(map.values());
        System.out.println(map);
        int tot=0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            int a=(int)entry.getValue();
            if(result==a){
                tot++;
            }

        }
        return tot;

    }
}