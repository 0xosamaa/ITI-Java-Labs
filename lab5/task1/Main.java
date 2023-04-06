public class Main{
    public static void main(String args[]){
        String sentence1 = "To tell you I'm sorry"; 
        String sentence2 = "I must have called a thousand times"; 

        CompareStrings compareLengths = (a,b)->a.length()>b.length()?a:b;
        CompareStrings compareFirst = (a,b)->a.charAt(0)>b.charAt(0)?a:b;
        CompareStrings compareLast = (a,b)->a.charAt(a.length()-1)>b.charAt(b.length()-1)?a:b;

        System.out.println(betterString(sentence1, sentence2, compareLengths));
        System.out.println(betterString(sentence1, sentence2, compareFirst));
        System.out.println(betterString(sentence1, sentence2, compareLast));

    }
    
    public static String betterString(String a,String b,CompareStrings compare){
        return compare.apply(a, b);
    }
}

interface CompareStrings{
    public String apply(String a, String b);
}
