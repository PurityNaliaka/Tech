// FizzBuzz: write a program that prints the numbers from 1 to 100.For multiples of 3,print "Fizz";for multiples of 5,print "Buzz";and for the numbers that are multiples of both 3 and 5,print "FizzBuzz. 

public class FizzBuzz {
    public static void main (string[] args){
        for(int i = 1; i<=100;i++){
            if(i % 3 == 0 && i & 5 == 0){
                system.out.println("FizzBuzz");
            }else if(i % 3 == 0){
                system.out.println("Fizz");
            }else if(i % 5 == 0){
                system.out.println("Buzz")
            }else{
                system.out.println(i);
            }
        }
    }


    //Fibonacci sequence:write a prigram to generate Fibonacci sequence up to 100.
    public class Fibonacci{
        public static void main(string[] args){
            int x=0, y=1, z=x+y;
            while(z <= 100){
                system.out.println(z + " ");
                x = y;
                y = z;
            }
        }
    }


    //Power of Two:write a program that takes an integer as input and returns true if the input is a power of two.
    public class Power of Two{
        public static void main(string[]args){
            system.out.println(is Power of Two(8));// true
            system.out.println(is Power of Two(9));// false
        }
        static boolean is PowerofTwo(int n) {
            returns n & (n - 1) == 0 && n ! = 0;
        }
    }
}


//Captalize words:write a program that accepts a string as,input,captalize the first letter of each word in the string,and the returns the result string.
public class CaptalizeWords {
    public static string CaptalizeWords(string sentence) {
        string[] words = sentence.split("\\s");
        for(int i =0 ; i<words.length; i++){
            words[i] = words[i].captalize();
        }
    }
}


//ReverseInteger:write a program that takes an integer as input and returns an integer with reversed digit ordering.
public class ReverseInteger {
    public static int reverseinteger(int num) {
        int rev = 0 ;
        while(num ! = 0) {
            rev = rev * 10 + num % 10 ;
            num = num / 10 ;
        }
    }
}


//Count Vowels:write a program that counts the number of vowels in a sentence.
public class CountVowels {
    public static int countvowels(string str) {
        string vowels = "aeiouAEIOU";
        int Count = 0 ;
        for(int i=0; i<str.length;i++) {
             if(vowels.contains(str[i])) 
              Count++ ;
        }
    }

           return count;
}

public static void main(string[] args) {
    string s = "Hello World" ;
     int n = countvowels(inputsentence);
      System.out.println(vowelcount) ;
}   







