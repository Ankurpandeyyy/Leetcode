import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums)
    {
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0 ; i< nums.length - 2 ; i++)
        {
            int l = i+1 ;
            int r = nums.length-1 ;
            while(l < r)
            {
                int sum = nums[i]+nums[l]+nums[r];
                if(sum == 0)
                    result.add(Arrays.asList(nums[i],nums[l++],nums[r--]));
                  else if(sum > 0)
                     r--;
                  else
                    l++;
            }
        }
        return new ArrayList<>(result);
    }

     public static void main(String[] args) {
        ThreeSum sol = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> triplets = sol.threeSum(nums);

        System.out.println("Triplets that sum to 0:");
        for (List<Integer> triplet : triplets) {
            System.out.println(triplet);
        }
    }
}