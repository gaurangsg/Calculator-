import java.util.Scanner;
public class Calculator {
    public static void main(String[]args) {
        int operator,num1,num2;
        System.out.println("1 - Add \n 2 - Substract \n 3 - Multiply \n 4 - Divide ");
        System.out.println("Choose the Operator : ");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("Enter the first number : ");
        num1 = sc.nextInt();
        System.out.println("Enter the Second number : ");
        num2 = sc.nextInt();

        int result = 0;
        switch(operator) {
        case 1 :
        result =  num1+num2;
        break;

        case 2 :
        result =  num1 - num2;
        break;

        case 3 :
        result =  num1 * num2;
        break;

        case 4 :
        result =  num1 / num2;
        break;

        default : 
        System.out.println("You entered a wrong number :");

        }
        System.out.println("The result is  :"+result);
       sc.close();
    }
}
