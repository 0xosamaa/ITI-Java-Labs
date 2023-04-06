import java.math.BigDecimal;

public class Main{
    public static void main(String args[]){
        Complex<BigDecimal> c1 = new Complex<BigDecimal>(new BigDecimal(10), new BigDecimal(2));
        Complex<BigDecimal> c2 = new Complex<BigDecimal>(new BigDecimal(10), new BigDecimal(2));
        
        Complex<BigDecimal> c = c1.Add(c2);
        
        System.out.println(c.real);
        System.out.println(c.imaginary);
    }
}

class Complex<T extends BigDecimal>{
    public T real;
    public T imaginary;

    public Complex(){
        
    }
    
    public Complex(T real, T imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex<T> Add(Complex<T> c2){
        Complex<T> c = new Complex<T>();
        c.real = (T)this.real.add(c2.real);
        c.imaginary = (T)this.imaginary.add(c2.imaginary);

        return c;
    }
}
