package IfThenElseRecap;

public class FirstTest {

    public static void main(String []args) {

        int score = 6000;
        // 1. expression result is true: score >= 5000
        if (score >= 5000) {
            // 2. execute line (code block): { }
            System.out.println("Your score was >= to 5000");
        } else if (score < 1000 && score >= 500) {
            System.out.println("Your score was < 1000 but >= 500");
        } else {
            System.out.println("Your score was < 500");
        }
        // 3. jump here
    }
}
