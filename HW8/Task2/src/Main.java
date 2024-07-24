import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        int[] weights = new int[10];
        Random rand = new Random();
        for (int i=0; i<weights.length; i++) weights[i] = rand.nextInt(100-40+1) + 40;
        for (int value: weights) System.out.println(value);

        int totalWeight = 0;
        for (int value: weights) totalWeight += value;
        int averageWeight = totalWeight/weights.length;
        System.out.println("\nСредний вес: " + averageWeight);

        int number = 0;
        for (int value: weights) {
            if (value>=60 && value<=80)
                number++;
        }
        System.out.println("\nКоличество людей с весом в диапазоне от 60 до 80 кг: " + number);
    }
}
