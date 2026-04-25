package day1;

public class AlgoWarmup1 {
    public static void main(String[] args) {
        System.out.println("isEven(4): " + isEven(4));
        System.out.println("isEven(7): " + isEven(7));

        System.out.println("fizzBuzz(9): " + fizzBuzz(9));
        System.out.println("fizzBuzz(10): " + fizzBuzz(10));
        System.out.println("fizzBuzz(15): " + fizzBuzz(15));
        System.out.println("fizzBuzz(7): " + fizzBuzz(7));

        System.out.println("isVowel('A'): " + isVowel('A'));
        System.out.println("isVowel('b'): " + isVowel('b'));
        System.out.println("isVowel('E'): " + isVowel('E'));
        System.out.println("isVowel('u'): " + isVowel('u'));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static String fizzBuzz(int n) {
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(n);
        }
    }

    public static boolean isVowel(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                return true;
            default:
                return false;
        }
    }
}

