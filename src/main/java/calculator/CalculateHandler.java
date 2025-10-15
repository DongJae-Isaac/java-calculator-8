package calculator;

public class CalculateHandler {
    public int[] parseToInt(String[] input) {
        int[] NumArray = new int[input.length];

        for(int i=0; i < input.length; i++) {
            NumArray[i] = Integer.parseInt(input[i]);
        }

        return NumArray;
    }
}
