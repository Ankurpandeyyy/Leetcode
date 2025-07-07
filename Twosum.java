import java.util.*;
class Twosum {
    public int[] twoSum(int[] nums, int target) 
    {
        // int a[] = new int[2]; 
        // int k=0;
        // for(int i=0 ; i<nums.length ; i++){
        //     for(int j=0 ; j<nums.length ; j++){
        //         if(i!=j && nums[i]+nums[j]==target)
        //         {
        //           a[k] = i ;
        //           a[k+1] = j;
        //           break ;
        //         }
        //     }
        // }

        // int b = 0 , e = nums.length-1 , flag = 0;
        // int[] original = nums.clone();
        // Arrays.sort(nums);
        // while(flag != 1)
        // {
        //     if(nums[b] + nums[e] < target)
        //            b++;
        //     if(nums[b] + nums[e] > target)
        //            e--;
        //       else{
        //         flag = 1 ;
        //       }        
        // }

        // if(flag == 1)
        // {
        //     while(k != 2)
        //     {
        //         for(int i=0 ; i<original.length ; i++)
        //         {
        //             if(original[i] == nums[b])
        //               a[k++] = i ;
        //             else if(original[i] == nums[e])
        //               a[k++] = i ;
        //         }
        //     }
        // }
        // return a ;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0 ; i<nums.length ; i++)
        {
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff) , i} ;
            }

            map.put(nums[i] , i);
        }

         return new int[]{};
    }
    

     public static void main(String[] args) {
        Twosum sol = new Twosum();

        
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        
        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
            System.out.println("Values: " + nums[result[0]] + " + " + nums[result[1]] + " = " + target);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}