package src.util;

public class complex {
    public Float real;
    public Power image;

    public complex(Float real, Power image) {
        this.real = real;
        this.image = image;
    }

    public complex(Integer real, Power image) {
        this.real = real.floatValue();
        this.image = image;
    }

    public complex(Power image) {
        this.real = Integer.valueOf(1).floatValue();
        this.image = image;
    }

    public String toString() {
        if (this.real.intValue() == this.real){
            return Integer.valueOf(this.real.intValue()).toString() + this.image.toString();
        }
        return this.real.toString() + this.image.toString();
    };

    complex numMul(Float LHS, complex RHS) {
        Float compR = LHS * RHS.real;
        return new complex(compR, RHS.image);
    }

    complex varMul(Power LHS, complex RHS) {
        Power compL = LHS.mul(RHS.image);
        return new complex(this.real, compL);
    }

    public complex mul(complex RHS) {
        return this.numMul(this.real, RHS).varMul(this.image, RHS);
    }

    complex numDiv(Float LHS, complex RHS) {
        Float compR = LHS / RHS.real;
        return new complex(compR, RHS.image);
    }

    complex varDiv(Power LHS, complex RHS) {
        Power compL = LHS.div(RHS.image);
        return new complex(this.real, compL);
    }

    public complex div(complex RHS) {
        return this.numDiv(this.real, RHS).varDiv(this.image, RHS);
    }

    public complex add(complex RHS) throws IllegalArgumentException {
        if (this.image == RHS.image) {
            return new complex(this.real + RHS.real, this.image);
        }
        throw new IllegalArgumentException("different images are not supported");
    }

    public complex sub(complex RHS) throws IllegalArgumentException {
        if (this.image == RHS.image) {
            return new complex(this.real - RHS.real, this.image);
        }
        throw new IllegalArgumentException("different images are not supported");
    }
}