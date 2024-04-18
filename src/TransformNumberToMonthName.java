import java.util.Scanner;
public class TransformNumberToMonthName{
    public static void main(String[] args){
        String[] months = {"January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 12:");
        int number = scanner.nextInt();
        if (number<1 || number>12){
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }
        else
        {
            String monthName = months[number - 1];
            System.out.println("The corresponding month name is:" + monthName);
        }
        scanner.close();
    }
}