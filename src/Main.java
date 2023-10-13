public class Main {
    public static void main(String[] args) {
        Float f1 = 1023f;
        Float f2 = 1023f;

        if (Float.compare(f1, f2) == 0) {
            System.out.println("f1=f2");
        }
        else if (Float.compare(f1, f2) < 0) {
            System.out.println("f1<f2");
        }
        else {
            System.out.println("f1>f2");
        }


        Float float_digit = 10f;
        Float float_digit2 = 1023f;

        if (Float.compare(float_digit, float_digit2) == 0) {

            System.out.println("f1=f2");
        }
        else if (Float.compare(float_digit, float_digit2) < 0) {

            System.out.println("f1<f2");
        }
        else {
            System.out.println("f1>f2");
        }


        Float float_d1 = 1023f;
        Float float_d2 = 10f;

        if (Float.compare(float_d1, float_d2) == 0) {
            System.out.println("f1=f2");
        }
        else if (Float.compare(float_d1, float_d2) < 0) {
            System.out.println("f1<f2");
        }
        else {
            System.out.println("f1>f2");
        }
    }
}