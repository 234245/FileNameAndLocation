import java.util.Scanner;
public class DigitSeparation
{
    public static void main(String[] args) {
        int number;
        int num1;
        int num2;
        int num3;
        int num4;
        int num5;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Five-digit number: ");
        number = input.nextInt();
        input.close();
        num1 = number % 10;
        number /= 10;
        num2 = number % 10;
        number /= 10;
        num3 = number % 10;
        number /= 10;
        num4 = number % 10;
        num5 = number /  10;
        System.out.printf("%d %d %d %d %d", num5, num4, num3, num2, num1);
    }
}

