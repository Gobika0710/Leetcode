/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
            int left=1;
            int right=n;

            while(left<=right){
                int m=left+(right-left)/2;
                int r=guess(m);
                if(r==0){
                    return m;

                }
                else if(r<0){
                    right= m-1;
                }
                else{
                left= m+1;
                }
            }
            return -1;
    }
}