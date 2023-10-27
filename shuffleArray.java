import java.util.Arrays;
import java.util.Random;
public class shuffleArray{
    public static void main(String[] args) {
        
        int[] array = {1, 2, 3, 4, 5, 6, 7};

       
        shuffle(array);

    
        System.out.println(Arrays.toString(array));
    }

    private static void shuffle(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {
            
            int randIndex = random.nextInt(i + 1);

            
            int temp = array[i];
            array[i] = array[randIndex];
            array[randIndex] = temp;
        }
    }
}
