
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numbers = 0;
        double sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            } else {
                numbers = numbers + 1;
                sum = sum + (number);
            }
        }
        double average = sum / numbers ;
        System.out.println("Average of the numbers: " + average);
        System.out.println(sum);
        System.out.println(numbers);
    }
}
