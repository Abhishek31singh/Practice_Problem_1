
import java.util.Random;

public class Randomnum {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] values = new int[5];

        
        for (int i = 0; i < 5; i++) {
            values[i] = rand.nextInt(900) + 100;  
        }

        
        int minValue = values[0];
        int maxValue = values[0];

        for (int i = 1; i < values.length; i++) {
            if (values[i] < minValue) {
                minValue = values[i];
            }
            if (values[i] > maxValue) {
                maxValue = values[i];
            }
        }

        
        System.out.println("Generated values: ");
        for (int value : values) {
            System.out.println(value);
        }

        System.out.println("\nMinimum value: " + minValue);
        System.out.println("Maximum value: " + maxValue);
    }
}
