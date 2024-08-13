import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome To Calculator");
        System.out.println("Choose Operator");
        System.out.println("1 Addition");
        System.out.println("2 Subtraction");
        System.out.println("3 Multiplication");
        System.out.println("4 Division");
        int choice=scanner.nextInt();
        System.out.println("Enter First Number");
        double num1=scanner.nextDouble();
        System.out.println("Enter Second Number");
        double num2=scanner.nextDouble();
        double result=0;
        switch(choice){
            case 1:
                result=num1+num2;
                System.out.println("Addition is" +result);
                break;
            case 2:
                result=num1-num2;
                System.out.println("Subtraction is" +result);
                break;
            case 3:
                result=num1*num2;
                System.out.println("Multiplication is" +result);
                break;
            case 4:
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Result: " + result);
            } else {
                System.out.println("Error: Division by zero is not allowed.");
            }
            break;
        default:
            System.out.println("Invalid choice.");
            break;
            }
}

}
