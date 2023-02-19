public class FRQ1 {


    private static int[] scores = {1 , 3 ,6 ,6 };

    private static double average(int first, int last) {
        double sum = 0;
        for (int i = first; i <= last; i++) {
            sum += scores[i];
        }
        return sum / (last - first + 1);
    }

    private static boolean hasImproved() {
        int prev = 0;
        for (int i = 0; i < scores.length ; i++) {
            if (scores[i] <= prev) {
                //System.out.println(("naur"));
                return false;
            }
            prev = scores[i];
        }
        return true;
    }

    private static double finalAverage() {
        if (hasImproved()) {
            int firstAboveAvgIndex = 0;
            for (int i = 0; i < scores.length ; i++) {
                if (scores[i] > average(0, scores.length - 1)) {firstAboveAvgIndex = i; break;}
                //System.out.println("yea");
            }
            return average(firstAboveAvgIndex, scores.length -1);
        }
        return average(0, scores.length - 1);

    }

    public static void main(String[] args) {
        System.out.println(finalAverage());
    }
}
