package calculator;

public class SeparatorHandler {
    private String customSeparator = "";

    public String[] splitInputValue(String input){
        // 만약 custom Separator를 추출해야 하는 상황이라면
        if(input.startsWith("//")){
            extractCustomSeparator(input);
            input = removeCustomSeparator(input);
        }

        return splitBySeparator(input);
    }

}
