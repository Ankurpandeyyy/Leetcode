import java.util.*;

class Longest_Consecutive_Seq {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            set.add(i);
        }

        int longest = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int count = 1;
                int curr = num;

                while (set.contains(curr + 1)) {
                    curr++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Longest_Consecutive_Seq sol = new Longest_Consecutive_Seq();

        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sol.longestConsecutive(nums);
        System.out.println("Length of the longest consecutive sequence: " + result);

        sc.close();
    }
}
