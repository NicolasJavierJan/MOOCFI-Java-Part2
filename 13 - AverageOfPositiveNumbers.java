
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positives = 0;
        double sum = 0;
        
        while (true){
            int number = Integer.valueOf(scanner.nextLine());
            if (number == 0){
                break;
            } else if (number > 0){
                positives = positives + 1;
                sum = sum + number;
            }
        }
        if (positives == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum / positives);
        }
    }
}
