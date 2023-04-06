import java.util.function.Function;

class CentigradeConverter{
	public static void main(String args[]){
		if(args.length!=1){
			System.out.println("Enter 1 arguement");
			return;
		}
		Function<Integer,Double> centigradeToFahrenheit = c -> (c*9.0/5)+32;
		System.out.println("Centigrade to Fahrenheit: " + Convert(Integer.parseInt(args[0]),centigradeToFahrenheit));

		Function<Integer,Double> centigradeToFahrenheit2 = c -> (0.7);
		System.out.println("Centigrade to Fahrenheit: " + Convert(Integer.parseInt(args[0]),centigradeToFahrenheit2));
	}

	public static Double Convert(Integer c, Function<Integer,Double> centigradeToFahrenheit){
		return centigradeToFahrenheit.apply(c);
	}
}
