package IfThenElseRecap;

public class ThirdTest {

    public static void main(String []args) {

        int score = 200;
        // 1. expression result is false
        if (score >= 5000) {
            System.out.println("Your score was >= to 5000");
            // 2. expression result is false
        } else if (score < 1000 && score >= 500) {
            System.out.println("Your score was < 1000 but >= 500");
        } else {
        // 3. execute line (code block)
            System.out.println("Your score was < 500");
        }
        // 4. jump here
    }
}
