import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input");
        String userInput = sc.nextLine();
        System.out.print("Your entered: ");
        System.out.println(userInput);

        if(StringUtils.isNumeric(userInput)){
            System.out.println("Input is a number");
        } else {
            System.out.println("Input is not a number");
        }

        System.out.println("Flipped case: " + StringUtils.swapCase(userInput));
    }
}
