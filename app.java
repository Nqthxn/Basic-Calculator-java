import java.util.Scanner;

class app{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float num1, num2;
        char operator;

        System.out.println("----------[ CALCULATOR ]----------");

        System.out.print("Enter First Number : ");
        num1 = input.nextFloat();

        System.out.print("Enter Operator (+-*/) : ");
        operator = input.next().charAt(0);

        System.out.print("Enter Second Number : ");
        num2 = input.nextFloat();

        float total = calculate(operator, num1, num2);

        if(total != -1){
            System.out.println("Result : " + String.format("%.2f", total));
        }else{
            System.out.println("Try Again");
        }
    }
    public static float calculate(char op, float n1, float n2){
        float result = 0;

        switch(op){
            case '+':
                result = n1 + n2;
                break;
            case '-':
                result = n1 - n2;
                break;
            case '*':
                result = n1 * n2;
                break;
            case '/':
                result = n1 / n2;
                break;
            default:
                System.out.println("Invalid Operator");
                return -1;
        }
        return result;
    }
}