import java.util.function.Function;
public class Main{
	public static Roots getRoots(Coefficients coeffs, Function<Coefficients, Roots> QuadraticEquation){
			return QuadraticEquation.apply(coeffs);
	}

    public static void main(String args[]){
		Coefficients coeffs = new Coefficients(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
		QuadraticEquation qe = new QuadraticEquation();
		System.out.println(getRoots(coeffs, qe).getRoot1());
		System.out.println(getRoots(coeffs, qe).getRoot2());
	}
}

class Coefficients{
	private int a;
	private int b;
	private int c;

	public void setA(int a){
		this.a=a;
	}
	public void setB(int b){
		this.b=b;
	}
	public void setC(int c){
		this.c=c;
	}

	public int getA(){
		return this.a;
	}
	public int getB(){
		return this.b;
	}
	public int getC(){
		return this.c;
	}

	Coefficients(int a, int b, int c){
		this.a=a;
		this.b=b;
		this.c=c;
	}
}

class Roots{
	private double root1;
	private double root2;

	public void setRoot1(double root1){
		this.root1=root1;
	}
	public void setRoot2(double root2){
		this.root2=root2;
	}

	public double getRoot1(){
		return this.root1;
	}
	public double getRoot2(){
		return this.root2;
	}

	Roots(double root1, double root2){
		this.root1=root1;
		this.root2=root2;
	}
}

class QuadraticEquation implements Function<Coefficients, Roots>{
	@Override
	public Roots apply(Coefficients coeffs){
        double d = Math.pow(Math.pow(coeffs.getB(),2)-4*coeffs.getA()*coeffs.getC(),0.5);
        double root1 = 0.0;
        double root2 = 0.0;
        if(d>=0){
            root1 = (-coeffs.getB()+Math.pow(Math.pow(coeffs.getB(),2)-4*coeffs.getA()*coeffs.getC(),0.5))/(2*coeffs.getA());
            root2 = (-coeffs.getB()-Math.pow(Math.pow(coeffs.getB(),2)-4*coeffs.getA()*coeffs.getC(),0.5))/(2*coeffs.getA());
        }else if(d<0){
            Roots roots = new Roots(root1,root2);
            return roots;
        }
        Roots roots = new Roots(root1,root2);
		return roots;
	}
}
