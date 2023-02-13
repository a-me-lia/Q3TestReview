import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.ArrayList;

public class revow{
    public static void main(String[] args) {
        System.out.println(contains("kagami-chan","kagami"));
        //System.out.println(Integer.parseInt("100.01"));
        int[] nums = {420, 69};
        System.out.println(Arrays.toString(swapNums(nums)));
        ArrayList<String> list = new ArrayList<>();

        int n = 5;
        int[][] m = new int[n][n];
        for(int j = 0; j < n; j++)	{
            for(int k = j; k < n; k++)	{
                m[j][k] = k + 1;
                m[k][j] = k - 1;
            }
        }

        System.out.println(Arrays.deepToString(m));


        ArrayList<String> animals = new ArrayList<>();
        animals.add("fox");
        animals.add(0, "squirrel");
        //pushes fox to index 1
        animals.add("deer");
        String byeBye = animals.set(2, "groundhog");
        //replaces 2 to groundhog and sets byeBye to deer
        animals.add(1, "mouse");
        System.out.println(animals.get(2) + " and " + animals.get(3) + " are better than " +  byeBye);


    }
    /**
     * Returns true if sub is in str, false otherwise. Works
     * regardless of capitalization.
     */
    public static boolean contains(String str, String sub)	{
        for(int i = 0; i < str.length() - sub.length() + 1; i++){
            if((str.toLowerCase().substring(i, i+ sub.length())).equals(sub.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Examine the following array:
     * int[] nums = {5, 7};
     * In the space below, write a method called public int[] swapNums that takes
     * nums as a parameter, swaps the order of those two numbers and then returns the int array with the swapped values.
     * @param nums
     * @return
     */
    public static int[] swapNums(int[] nums)	{
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;

        return nums;
    }

    /**
     * On a Sunday night, a meteorologist records predicted daily high temperatures, in degrees Fahrenheit,
     * for the next seven days. At the end of each day, the meteorologist records the actual daily high temperature,
     * in degrees Fahrenheit. At the end of the seven-day period, the meteorologist would like to find the greatest
     * absolute difference between a predicted temperature and a corresponding actual temperature.
     *
     * Consider the following method, which is intended to return the greatest absolute difference between
     * any pair of corresponding elements in the int arrays pred and act.
     * @param pred
     * @param act
     * @return
     */
    public static int diff(int[] pred, int[] act)	{
        int num = Math.abs(pred[0]-act[0]);
        for (int i = 1; i < pred.length; i++)	{
            num = Math.max(num,  Math.abs(pred[i] - act[i]));
        }
        return num;
    }


}
