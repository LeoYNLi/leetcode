package org.example.app;

public class Medium55 {
    public boolean canJump(int[] nums) {

        if (nums.length == 1){
            return true;
        }
        boolean canJump = true;
        
        for(int i = 0; i < nums.length ; i++){
            if (nums[i] >= nums.length - i - 1) {
                break;
            } else {
                int maxStep = 0;
                int target = 0;
                for (int j = 1 ; j <= nums[i] ; j++ ) {
                    if (nums[i+j] >= maxStep) {
                        maxStep = nums[i+j];
                        target = i + j -1;
                    }
                }
                
                if (maxStep == 0 ) {
                    canJump = false;
                    break;
                } else {

                    i = target;
                }


            }
        }
                return canJump;   
    }
}
