import java.util.ArrayList;

/**
 * Created by young on 6/24/17.
 */
public class SubsetSum {

    ArrayList<Integer> numbers;

    public SubsetSum(ArrayList<Integer> numbers) {
        this.numbers = numbers;
    }

    private boolean addsZero() {
        if (this.numbers.contains(0)) {
            return true;
        }
        for (int i = 0; i < this.numbers.size()/2; i++) {
            int temp = this.numbers.get(i);
            if (this.numbers.contains(-temp)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        SubsetSum a = new SubsetSum(numbers);
        System.out.println(a.addsZero());
    }
}
