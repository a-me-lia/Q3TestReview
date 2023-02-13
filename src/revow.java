import java.util.Arrays;

public class revow{
    public static void main(String[] args) {
        System.out.println(contains("kagami-chan","kagami"));
        //System.out.println(Integer.parseInt("100.01"));
        int[] nums = {420, 69};
        System.out.println(Arrays.toString(swapNums(nums)));
    }

    public static boolean contains(String str, String sub)	{
        for(int i = 0; i < str.length() - sub.length() + 1; i++){
            if((str.toLowerCase().substring(i, i+ sub.length())).equals(sub.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static int[] swapNums(int[] nums)	{
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        return nums;
    }


}
