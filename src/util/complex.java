package src.util;

public class complex {
    public Integer real;
    public Power image;

    public complex(Integer real, Power image) {
        this.real = real;
        this.image = image;
    }

    public String toString() {
        return this.real.toString() + this.image.toString();
    };

    complex numMul(Integer LHS, complex RHS) {
        int compR = LHS * RHS.real;
        return new complex(compR, RHS.image);
    }

    complex varMul(Power LHS, complex RHS) {
        Power compL = LHS.mul(RHS.image);
        return new complex(this.real, compL);
    }

    public void mul(complex RHS) { // complex
        System.out.println(this.numMul(this.real, RHS).varMul(this.image, RHS).toString());
    }
}

class Power {
    public String base;
    public Integer pow;

    public Power(String base, int power) {
        this.base = base;
        this.pow = power;
    }

    public String toString() {
        return this.base + "^" + this.pow.toString();
    }

    public Power mul(Power num) throws IllegalArgumentException {
        if (this.base == num.base) {
            return new Power(num.base, num.pow + this.pow);
        }
        throw new IllegalArgumentException("different bases aren't supported");
    }
}