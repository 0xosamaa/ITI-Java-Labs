public class Main{
    public static void main(String args[]){
        String song1 = "123 123 Drink";
        String song2 = "Youknowhowthiswillgo";

        Alphabet alphabet = a -> a.matches("[a-zA-Z]+");

        System.out.println(checkAlphabet(song1, alphabet));
        System.out.println(checkAlphabet(song2, alphabet));
    }

    public static Boolean checkAlphabet(String a, Alphabet alphabet){
        return alphabet.apply(a);
    }
}

interface Alphabet{
    public Boolean apply(String a);
}
