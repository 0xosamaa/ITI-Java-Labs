import java.util.StringTokenizer;
import java.util.regex.*;
import java.util.Random;

class CountWordsV1{
	public static void main(String args[]){
		if(args.length==2){
			int count = 0;
			String words[] = args[0].split(args[1]);
			for(int i = 0; i < words.length; i++){
				count++;
			}
			System.out.println(count);
		}
	}
}

class CountWordsV2{
	public static void main(String args[]){
		if(args.length==2){
			int count = 0;
			StringTokenizer st = new StringTokenizer(args[0]," ");
 			while (st.hasMoreTokens()) {
				String word = st.nextToken();
				if(word.equals(args[1])){
					count++;
				}
				else System.out.println(word);
 			}
			System.out.println(count);
		}
	}
}

class CheckIfIPAddress{
	public static void main(String args[]){
		if(args.length==1){
			boolean validIp = true;
			if(Pattern.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}", args[0])){
				String nums[] = args[0].split("\\.");
				for(int i = 0; i < nums.length; i++){
					int number = Integer.parseInt(nums[i]);
					if(number>255||number<0){
						validIp = false;
						break;
					}
				}
			}else{
				validIp = false;
			}
			System.out.println(validIp);
  		}
	}
}

class MinMax{
	public static void main(String args[]){
		int arr[] = new int[1000];
		int min, max;
		
		long time = System.nanoTime();
		for(int i = 0; i < 1000; i++){
			Random rand = new Random();
			arr[i] = rand.nextInt(1000);
		}

		min = arr[0];
		max = arr[0];

		for(int i = 1; i < 1000; i++){
			if(arr[i]>max){
				max=arr[i];
			}
			if(arr[i]<min){
				min=arr[i];
			}
		}
		time = System.nanoTime() - time;
		System.out.println("Time taken to run in nano seconds: " + time);
		System.out.println("Min: " + min + " Max: " + max);
	}
}
