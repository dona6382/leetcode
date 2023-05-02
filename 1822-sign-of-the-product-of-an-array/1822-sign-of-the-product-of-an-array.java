class Solution {
    public int arraySign(int[] nums) {
        int output = 0;
        int isOdd = 0;

        for(int i : nums) {

          if(i == 0) return 0;
          else if(i < 0) isOdd++;

        }

        if(isOdd % 2 != 0) output = -1;
        else output = 1;

        return output;
    }
}