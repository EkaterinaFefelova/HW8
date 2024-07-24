import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //todo код программы писать тут
        double[] weights = new double[10];
        Random rand = new Random();
        double totalWeight = 0;
        int number = 0;

        for (int i=0; i<weights.length; i++) {
            weights[i] = rand.nextDouble() * 60 + 40;
            totalWeight += weights[i];
            if (weights[i]>=60 && weights[i]<=80)
                number++;

        }

        for (double value : weights) System.out.println(value);
        double averageWeight = totalWeight/weights.length;
        System.out.println("\nСредний вес: " + averageWeight);
        System.out.println("\nКоличество людей с весом в диапазоне от 60 до 80 кг: " + number);
    }
}
