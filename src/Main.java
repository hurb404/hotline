import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String user_input = "";
        user_input = sc.next();
        user_input = user_input.toLowerCase();
        char[] b = user_input.toCharArray();

        String newStr = "";

        if (b.length > 7) {
            for (int a = 0; a < 7; a++) {
                newStr += b[a];
            }
        } else if (b.length < 7) {
            for (int c = 0; c < b.length; c++) {
                newStr += b[c];
            }

            int num_of_zeroes = 7 - b.length;
            for (int d = 0; d < num_of_zeroes; d++) {
                newStr += "0";
            }
        } else if (b.length == 7) {
            for (int e = 0; e < b.length; e++) {
                newStr += b[e];
            }
        }

        char[] ch = newStr.toCharArray();
        String final_number_temp = "1-800-";
        String final_number = "";

        for (int i = 0; i < b.length; i++) {
            if (b[i] == 'a' || b[i] == 'b' || b[i] == 'c') {
                final_number_temp = final_number_temp + "2";
            } else if (b[i] == 'd' || b[i] == 'e' || b[i] == 'f') {
                final_number_temp = final_number_temp + "3";
            } else if (b[i] == 'g' || b[i] == 'h' || b[i] == 'i') {
                final_number_temp = final_number_temp + "4";
            } else if (b[i] == 'j' || b[i] == 'k' || b[i] == 'l') {
                final_number_temp = final_number_temp + "5";
            } else if (b[i] == 'm' || b[i] == 'n' || b[i] == 'o') {
                final_number_temp = final_number_temp + "6";
            } else if (b[i] == 'p' || b[i] == 'q' || b[i] == 'r' || b[i] == 's') {
                final_number_temp = final_number_temp + "7";
            } else if (b[i] == 't' || b[i] == 'u' || b[i] == 'v') {
                final_number_temp = final_number_temp + "8";
            } else if (b[i] == 'w' || b[i] == 'x' || b[i] == 'y' || b[i] == 'z') {
                final_number_temp = final_number_temp + "9";
            } else if (b[i] == ' ') {
                continue;
            } else {
                System.out.println("Invalid input, try again");
            }
        }

        if (final_number_temp.length() > 14) {
            char[] fn = final_number_temp.toCharArray();
            for (int j = 0; j < 13; j++) {
                String temp_var = Character.toString(fn[j]);
                final_number = final_number + fn[j];
            }
        }

        System.out.println(final_number);

    }
}
