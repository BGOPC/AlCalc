package src;

import java.util.Scanner;
import java.util.HashMap;
import src.calc.Tokenizer;
import src.util.*;

public class calculator {
    public static Scanner input = new Scanner(System.in);
    public static String letters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String varName;
    public static HashMap<complex,String> Tokenized = new HashMap<complex,String>();

    public static void main(String[] args) {
        String eq = input.nextLine();
        for (String letter : eq.split("")){
            if (letters.contains(letter)){
                varName = letter;
                break;
            }
        }
        Tokenizer Tokens = new Tokenizer(eq, varName);
        Tokenized = Tokens.Tokenize();
        // System.out.println(Tokenized);
    }
}
