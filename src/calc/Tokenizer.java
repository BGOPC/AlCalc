package src.calc;

import java.util.HashMap;

// import src.util.*;

public class Tokenizer {
    public String[] toks;

    public static String ops = "+-*/";
    public Tokenizer(String toks) {
        this.toks = toks.split(" ");
    }

    public String toString() {
        return String.join(" ", this.toks);
    }

    public void Tokenize() {
        for (String tok : this.toks) {
            if (!ops.contains(tok)){
                System.out.println(tok);
            }
        }

    }
}
