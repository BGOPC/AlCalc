package src.util;

public class Power {
    public String base;
    public Integer pow;

    public Power(String base, int power) {
        this.base = base;
        this.pow = power;
    }

    public String toString() {
        if (this.pow == 0){
            return "";
        } else if (this.pow == 1){
            return this.base;
        }
        return this.base + "^" + this.pow.toString();
    }

    public Power mul(Power num) throws IllegalArgumentException {
        if (this.base == num.base) {
            return new Power(num.base, num.pow + this.pow);
        } else if (this.pow == num.pow){
            return new Power(this.base+"*"+num.base, this.pow);
        }
        throw new IllegalArgumentException("different bases and powers aren't supported");
    }
    public Power div(Power num) throws IllegalArgumentException {
        if (this.base == num.base) {
            return new Power(num.base, this.pow - num.pow);
        } else if (this.pow == num.pow){
            return new Power(String.format("(%s/",this.base)+num.base+")", this.pow);
        }
        throw new IllegalArgumentException("Different bases and powers aren't supported");
    }
}
