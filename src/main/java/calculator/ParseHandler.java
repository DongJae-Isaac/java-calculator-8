package calculator;

public class ParseHandler {

    /**
     * 입력 문자열을 숫자 배열으로 분리한다.
     * @param input 분리 된 입력 문자열
     * @return 숫자 배열
     */
    public int[] parseToInt(String[] input) {
        int[] numArray = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numArray[i] = convertToInt(input[i]);
        }

        return numArray;
    }


    private int convertToInt(String str){
        try {
            int num = Integer.parseInt(str);
            return num;
        } catch (NumberFormatException e){
            throw new IllegalArgumentException("숫자가 아닙니다.");
        }
    }
}
