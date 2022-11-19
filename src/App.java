import java.util.Scanner;
public class App {
    static Scanner in = new Scanner(System.in);
    //static int firstNumberIndex = 0;
    //static int secondNumberIndex = 2;
    //static int operationIndex = 1;
    static boolean isRoman = false;
    public static void main(String[] args) throws Exception {
        while (true){
            System.out.println("Type operation:");
            String op = in.nextLine();
            String[] arr = analysLine(op);
            if (isRoman){
                romaneCalculate(arr[0], arr[2], arr[1]);
            }else{
                arabCalculate(Integer.parseInt(arr[0]), Integer.parseInt(arr[2]), arr[1]);
            }
        }
    }
    private static void romaneCalculate(String a, String b, String op) throws Exception {
        switch (op) {
            case "+" -> System.out.println(Calculator.plus(a,b));
            case "-" -> System.out.println(Calculator.minus(a,b));
            case "*" -> System.out.println(Calculator.multiply(a,b));
            case "/" -> System.out.println(Calculator.divide(a,b));
        }
    }
    private static void arabCalculate(int a, int b, String op){
        switch (op) {
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "*" -> System.out.println(a * b);
            case "/" -> System.out.println(a / b);
        }
    }
    private static String[] analysLine(String op) throws Exception {
        String[] arr = op.split(" ");
        if (arr.length != 3){
            throw new Exception("Wrong operation.");
        }else if (!Translate.ROMAN_NUMERALS.containsKey(arr[0]) && !Translate.ROMAN_NUMERALS.containsKey(arr[2])){
            try {
                int a = Integer.parseInt(arr[0]);
                int b = Integer.parseInt(arr[2]);
                if (a > 10 || b > 10 || a <= 0 || b <= 0){
                    throw new Exception();
                }
            } catch (Exception e) {
                throw new Exception("Incorrect input!");
            }

        }else{
            isRoman = true;
        }
        return arr;
    }

}
