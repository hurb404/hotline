import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String user_input = "";
        user_input = sc.nextLine();

        user_input = user_input.toLowerCase();
        char[] b = user_input.toCharArray();

        String temp = "";

        for (int f = 0; f < b.length; f++) {
            if (b[f] != ' ') {
                temp = temp + b[f];
            }
        }

        char[] b_new = temp.toCharArray();
        String newStr = "";

        if (b_new.length > 7) {
            for (int a = 0; a < 7; a++) {
                newStr += b[a];
            }
        } else if (b_new.length < 7) {
            for (int c = 0; c < b_new.length; c++) {
                newStr += b[c];
            }

            int num_of_zeroes = 7 - b_new.length;
            for (int d = 0; d < num_of_zeroes; d++) {
                newStr += "0";
            }
        } else if (b_new.length == 7) {
            for (int e = 0; e < b_new.length; e++) {
                newStr += b_new[e];
            }
        }

        char[] ch = newStr.toCharArray();
        String final_number_temp = "1-800-";
        String final_number = "";

        for (int i = 0; i < ch.length; i++) {
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
            } else if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '5' || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9') {
                final_number_temp = final_number_temp + ch[i];
            }
        }

        System.out.println(final_number_temp);

    }
}
