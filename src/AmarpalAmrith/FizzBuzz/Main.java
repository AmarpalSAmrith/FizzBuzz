package AmarpalAmrith.FizzBuzz;

import com.sun.tools.corba.se.idl.constExpr.Not;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 300; i++) {
            boolean Fizz = false;
            boolean Buzz = false;
            boolean Bong = false;
            boolean Bang = false;
            boolean Fezz = false;
            if (i % 11 == 0) {
                Bong = true;
            }
            if (i % 3 == 0){
                Fizz = true;
                }
            if (i % 7 ==0){
                Bang = true;
            }
            if (i % 5 == 0){
                Buzz = true;
            }
            if (i % 13 == 0) {
                Fezz = true;
            }
            StringBuilder S = new StringBuilder();

            if (Fizz) {
                S.append("Fizz");
            }
            if (Buzz) {
                S.append("Buzz");
            }
            if (Bang) {
                S.append("Bang");
            }
            if (Bong) {
                S.replace(0, S.length(), "Bong");
            }
            if (Fezz) {
                S.insert(S.indexOf("B") == -1 ? 0 : S.indexOf("B"), "Fezz");
            }
            if (S.length() != 0){
                System.out.println(S);
            }
            else if (S.length() == 0){
                System.out.println(i);
            }

        }
    }
}

