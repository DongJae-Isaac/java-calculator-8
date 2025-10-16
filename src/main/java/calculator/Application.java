package calculator;


public class Application {
    public static void main(String[] args) {
        // 사용자로부터 입력값 받기
        InputHandler inputHandler = new InputHandler();
        String input = inputHandler.getInput();

        // 빈 문자열 반환 시 0 출력
        if (input.isEmpty()) {
            System.out.println("0");
        } else {
            // input 받아서 구분자 처리
            SeparatorHandler separatorHandler = new SeparatorHandler();
            String[] splitString = separatorHandler.splitInputValue(input);

            // 문자열 출력 확인 테스트
//            for (String splitStr : splitString) {
//                System.out.println(splitStr);
//            }
            ParseHandler parseHandler = new ParseHandler();
            int[] parsedArr = parseHandler.parseToInt(splitString);
            for (int i : parsedArr) {
                System.out.println(i);
            }

//            ResultPrinter resultPrinter = new ResultPrinter();
            // 최종 결과 출력 위한 숫자 전달


        }
    }
}
