package src.calc;

import src.util.complex;
import src.util.Power;
import java.util.ArrayList;
import java.util.HashMap;

public class Tokenizer {
    public String[] toks;
    public String varName;
    public HashMap<complex, String> Output = new HashMap<complex, String>();
    public ArrayList<complex> Complexes = new ArrayList<>();
    public ArrayList<String> Operators = new ArrayList<>();
    public static String ops = "+-*/";

    public Tokenizer(String toks, String varName) {
        this.toks = toks.split(" ");
        this.varName = varName;
    }

    public String toString() {
        return String.join(" ", this.toks);
    }

    public String calcNumPow(String eq) {
        if (!eq.contains("^")) {
            return eq;
        } else {
            Integer num = Integer.valueOf(eq.split("\\^")[0]);
            Integer pow = Integer.valueOf(eq.split("\\^")[1]);
            return String.valueOf(Math.pow(num, pow));
        }
    }

    public HashMap<complex, String> Tokenize() {
        for (String tok : this.toks) {
            if (!ops.contains(tok)) {
                Float real;
                String strImage = "";
                Power image;
                if (tok.contains(varName)) {
                    real = Float.valueOf(calcNumPow(tok.split(this.varName)[0]));
                    strImage = "x" + tok.split(this.varName)[1];
                    image = new Power(varName, Integer.parseInt(strImage.split("^")[0]));
                } else {
                    real = Float.valueOf(calcNumPow(tok));
                    image = new Power(varName, 0);
                }
                this.Complexes.add(new complex(real, image));
            } else {
                this.Operators.add(tok);
            }
        }
        for (int i = 0; i < this.Complexes.size(); i++) {
            String op = "";
            complex Complex = this.Complexes.get(i);
            if (i < this.Operators.size()) {
                op = this.Operators.get(i);
            }
            Output.put(Complex, op);
        }
        return this.Output;

    }
}
