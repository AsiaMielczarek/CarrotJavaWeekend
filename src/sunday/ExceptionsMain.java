package sunday;

public class ExceptionsMain {

    public static void main(String[] args) {

        try {
            System.out.println(divideThrow(2, 0));
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

    }

    public static double divideThrow(double a, double b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Nie dziel przez 0.");
        }
        return a / b;
    }


}
