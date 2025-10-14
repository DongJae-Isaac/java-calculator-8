package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputHandler {
    public String getInput() {
        System.out.println("문자열을 입력하세요.");
        return Console.readLine();
    }
}
