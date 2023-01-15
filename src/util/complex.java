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
    public void mul(complex LHS, complex RHS){ //complex
        
    }
}

class Power{
    
}