class Hello{
	public static void main(String args[]){
		System.out.println("Hello, World!");
	}
}

class PrintArgs{
	public static void main(String args[]){
		if(args.length==2){
			System.out.println(args[0]);
			System.out.println(args[1]);
		}else{
			System.out.println("No Arguments Found");
		}
	}
}

class MultiplyByTwo{
	public static void main(String args[]){
		if(args.length==1){
			System.out.print(args[0] + " * 2 = ");
			System.out.println(Integer.parseInt(args[0])*2);
		}else{
			System.out.println("Enter a number to multiply by 2");
		}
	}
}
