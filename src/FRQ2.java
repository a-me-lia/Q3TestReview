import java.util.ArrayList;

public class FRQ2 {
    private ArrayList<Integer> digitList = new ArrayList<>();

    public FRQ2(int num){
        int var;
        while(num > 0){
            var = num % 10;
            digitList.add(0, var);
            num /= 10;
        }
    }

    public boolean isStrictlyIncreasing(){
        int prev = 0;
        for(int i = 0; i < digitList.size(); i++){
            if(digitList.get(i) <= prev){return false;}
            prev = digitList.get(i);
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new FRQ2(245).isStrictlyIncreasing());
    }
}
