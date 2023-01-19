package src;

import java.util.Scanner;
import src.calc.Tokenizer;

public class calculator {
    public static Scanner input = new Scanner(System.in);
    public static String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String varName;
    public static void main(String[] args) {
        String eq = input.nextLine();
        for (String letter : eq.split("")){
            if (letters.contains(letter)){
                varName = letter;
                break;
            }
        }
    }
}
