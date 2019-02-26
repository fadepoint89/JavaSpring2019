public class FunWithNumbers {

    public void run() {
        int num1 = 5;
        int num2 = 10;
        int num3 = 3;
        int num4 = 25;
        int results = 0;
        double results2 = 0.0;

        results = num1 + num2 + num3 + num4;

        System.out.println("int results: " + results);

        results2 = (double)(num1 * num2 * num4) / (double) num3;

        System.out.println("double results: " + results2);
    }

}
