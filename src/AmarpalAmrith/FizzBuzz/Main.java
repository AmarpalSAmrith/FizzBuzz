package AmarpalAmrith.FizzBuzz;

public class Main {

    public static void main(String[] args) {
        for(int i=1; i <= 105; i++){
            if (i % 11 == 0) {
                System.out.println("Bong");
            } else if (i % 3 == 0 && i % 5 == 0) {
                if (i % 7 == 0){
                    System.out.println("FizzBuzzBang");
                } else {
                    System.out.println("FizzBuzz");
                }

            } else if (i % 5 == 0){
                if (i % 7 == 0){
                    System.out.println("FizzBang");
                }else {
                    System.out.println("Buzz");
                }

            } else if (i % 3 == 0){
                if (i % 7 == 0){
                    System.out.println("FizzBang");
                }else {
                    System.out.println("Fizz");
                }
            } else if (i % 7 ==0){
                System.out.println("Bang");
            }
            else {
                System.out.println(i);
            }

        }

    }
}
