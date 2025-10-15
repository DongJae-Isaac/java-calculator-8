package calculator;

public class CalculateHandler {
    public int[] parseToInt(String[] input) {
        int[] numArray = new int[input.length];

        for(int i=0; i < input.length; i++) {
            numArray[i] = Integer.parseInt(input[i]);
        }

        return numArray;
    }
}
