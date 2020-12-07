package FuramaResort2.Models;

import FuramaResort2.Controllers.MainController;

public class CheckFormat {

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


