import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String user_input = "";

        try {
            user_input = sc.nextLine();
            user_input = user_input.toLowerCase();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input, try again");
            System.exit(0);
        }

        String final_number_temp = "1-800-";
        char[] ch = user_input.toCharArray();

        String final_number = "";

        for (int i = 0; i < ch.length; i ++) {
            if (ch[i] == 'a' || ch[i] == 'b' || ch[i] == 'c') {
                final_number_temp = final_number_temp + "2";
            } else if (ch[i] == 'd' || ch[i] == 'e' || ch[i] == 'f') {
                final_number_temp = final_number_temp + "3";
            } else if (ch[i] == 'g' || ch[i] == 'h' || ch[i] == 'i') {
                final_number_temp = final_number_temp + "4";
            } else if (ch[i] == 'j' || ch[i] == 'k' || ch[i] == 'l') {
                final_number_temp = final_number_temp + "5";
            } else if (ch[i] == 'm' || ch[i] == 'n' || ch[i] == 'o') {
                final_number_temp = final_number_temp + "6";
            } else if (ch[i] == 'p' || ch[i] == 'q' || ch[i] == 'r' || ch[i] == 's') {
                final_number_temp = final_number_temp + "7";
            } else if (ch[i] == 't' || ch[i] == 'u' || ch[i] == 'v') {
                final_number_temp = final_number_temp + "8";
            } else if (ch[i] == 'w' || ch[i] == 'x' || ch[i] == 'y' || ch[i] == 'z') {
                final_number_temp = final_number_temp + "9";
            } else if (ch[i] == ' ') {
                continue;
            } else {
                System.out.println("Invalid input, try again");
            }

        }

        if (final_number_temp.length() > 14) {
            char[] fn = final_number_temp.toCharArray();
            for (int j = 0; j < 13; j ++) {
                String temp_var = Character.toString(fn[j]);
                final_number = final_number + fn[j];
            }
        }

        System.out.println(final_number);

    }
}
