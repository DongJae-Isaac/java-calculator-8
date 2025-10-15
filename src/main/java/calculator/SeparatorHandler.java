package calculator;

public class SeparatorHandler {
    private String customSeparator = "";

    /**
     * 입력 문자열을 구분자 기준으로 분리한다.
     * @param input 사용자 입력 문자열
     * @return 분리된 문자열 배열
     */
    public String[] splitInputValue(String input){
        // 만약 custom Separator를 추출해야 하는 상황이라면
        if(!input.startsWith("//")){
            return splitBySeparator(input);
        }
        extractCustomSeparator(input);
        input = removeCustomSeparator(input);
        return splitBySeparator(input);
    }

    private void extractCustomSeparator(String input) {
        // "//"로 시작해서 "\n" 사이에 있는 customSeparator 추출
        int start = 2;
        int end = input.indexOf("\\n");

        if (end == -1) {
            throw new IllegalArgumentException("잘못된 형식입니다.");
        }
        customSeparator = input.substring(start, end);
    }

    private String removeCustomSeparator(String input){
        // \n 다음에 있는 문자열만 추출
        return input.substring(input.indexOf("\\n") + 2);
    }

    private String[] splitBySeparator(String input) {
        // 기본 구분자와 커스텀 구분자로 문자열 처리
        String regex = "[,:" + customSeparator + "]";
        String[] filteredNumber = input.split(regex);

        return filteredNumber;
    }
}
