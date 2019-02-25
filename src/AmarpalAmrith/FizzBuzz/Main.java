package AmarpalAmrith.FizzBuzz;

import com.sun.tools.corba.se.idl.constExpr.Not;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i <= 300; i++) {
            boolean Fizz = false;
            boolean Buzz = false;
            boolean Bong = false;
            boolean Bang = false;
            boolean Fezz = false;
            boolean iReverse = false;
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
            if (i % 17 == 0) {
                iReverse = true;
            }
            StringBuilder S = new StringBuilder();
            List <String> MyList = new ArrayList<>();

            if (Fizz) {
                MyList.add("Fizz");
            }
            if (Fezz) {
                MyList.add("Fezz");
            }
            if (Buzz) {
                MyList.add("Buzz");
            }
            if (Bang) {
                MyList.add("Bang");
            }
            if (Bong) {
                MyList.clear();
                if (Fezz) {
                    MyList.add("Fezz");
                }
                MyList.add("Bong");
            }
            if (iReverse) {
                for (int k = MyList.size() - 1; k >= 0; k--){
                    S.append(MyList.get(k));
                }
            } else {
                for (int k = 0; k <= MyList.size() - 1; k++){
                    S.append(MyList.get(k));
                }
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

