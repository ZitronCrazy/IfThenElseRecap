package IfThenElseRecap;

public class SecondTest {

    public static void main(String []args) {

        int score = 800;
        // 1. expression result is false
        if (score >= 5000) {
            System.out.println("Your score was >= to 5000");
            // 2. true && true; result is true
        } else if (score < 1000 && score >= 500) {
            // 3. execute line (code block)
            System.out.println("Your score was < 1000 but >= 500");
        } else {
            System.out.println("Your score was < 500");
        }
        // 4. jump here
    }
}
