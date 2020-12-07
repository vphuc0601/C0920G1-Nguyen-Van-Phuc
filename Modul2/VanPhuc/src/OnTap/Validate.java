package OnTap;

import FuramaResort2.Controllers.MainController;

public class Validate {
    public static String check(String input, String regex) {
        boolean check = false;
        do {
            if (input.matches(regex)) {
                check = true;
            } else {
                System.err.println("Loi");
                input = MainController.input.nextLine();
            }
        } while (!check);
        return input;
    }
}
