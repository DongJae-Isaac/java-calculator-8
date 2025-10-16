package calculator;

public class CalculateHandler {
    public int getSum(int[] input) {
        int sum = 0;
        for (int i : input) {
            sum += i;
        }
        return sum;
    }
}
