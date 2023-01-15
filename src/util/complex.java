package src.util;

public class complex{
    public Integer real;
    public String image;
    public complex(Integer real, String image){
        this.real = real;
        this.image = image;
    }
    public String toString(){
        return this.real.toString() + this.image;
    };
    complex numMul(Integer LHS, complex RHS){
        int compR = LHS * RHS.real;

        return new complex(compR, RHS.image);
    }
    complex varMul(String LHS, complex RHS){


        return new complex(compR, RHS.image);
    }
    public void mul(complex RHS){ //complex
        
    }
}

class Power{
    public Integer base;
    public Integer pow;
    public Power(int base, int power){
        this.base = base;
        this.pow = power;
    }
    public String toString(){
        return this.base.toString() + "^" + this.pow.toString();
    }
    public Power mul(Power num) throws IllegalArgumentException{
        if (this.base == num.base){
            return new Power(num.base, num.pow + this.pow);
        }
        throw new IllegalArgumentException("different bases aren't supported");
    }
}