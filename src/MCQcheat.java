import java.util.ArrayList;

public class MCQcheat {
    public static void main(String[] args) {
        ArrayList<Integer> oldList = new ArrayList();

        oldList.add(100);

        oldList.add(200);

        oldList.add(300);

        oldList.add(400);

        ArrayList<Integer> newList = new ArrayList();

        newList.add(oldList.remove(1));

        newList.add(oldList.get(2));

        System.out.println(newList);

        int arr[][] = {{9, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        System.out.println( findZero(arr));
        //will have exception
    }

    public static boolean findZero(int[][] arr)

    {

        for (int row = 0; row <= arr.length; row++)

        {

            for (int col = 0; col < arr[0].length; col++)

            {

                if (arr[row][col] == 0)

                {

                    return true;

                }

            }

        }

        return false;

    }
}
