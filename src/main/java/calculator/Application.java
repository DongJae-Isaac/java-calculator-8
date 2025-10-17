package calculator;


public class Application {
    public static void main(String[] args) {
        // 사용자로부터 입력값 받기
        InputHandler inputHandler = new InputHandler();
        String input = inputHandler.getInput();

        // 입력값이 공백이면 0 출력
        if(input.isEmpty()){
            ResultPrinter resultPrinter = new ResultPrinter();
            resultPrinter.printer(0);
            return;
        }

        // input 받아서 구분자 처리
        SeparatorHandler separatorHandler = new SeparatorHandler();
        String[] splitString = separatorHandler.splitInputValue(input);

        ParseHandler parseHandler = new ParseHandler();
        int[] parsedArr = parseHandler.parseToInt(splitString);


        CalculateHandler calculateHandler = new CalculateHandler();
        int result = calculateHandler.getSum(parsedArr);

        ResultPrinter resultPrinter = new ResultPrinter();
        resultPrinter.printer(result);
    }
}
