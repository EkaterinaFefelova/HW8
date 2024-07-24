import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //#1 Создать массив из 10 целых чисел. Значения могут быть любыми
        //todo
        int[] myArray = new int [10];
        for (int i=0; i<myArray.length; i++)
           myArray[i] = new Random().nextInt(75);
        //#2 Распечатать все значения массива начиная с 0 до последнего индексов.
        //todo
        System.out.println("Печатаю массив с начала");
        for (int j : myArray) System.out.println(j);

        //#3 Распечатать все значения массива с конца (начиная с последнего до 0 индексов).
        //todo
        System.out.println("\nПечатаю массив с конца");
        for (int i = myArray.length-1; i>=0; i--)
            System.out.println(myArray[i]);

        //#4 *** Задание особой сложности. Развернуть массив(см конец урока).
        //todo
        int[] myArray1 = new int[myArray.length];
        int j= myArray1.length-1;
        for (int value : myArray) {
            myArray1[j] = value;
            j--;
        }
        System.out.println("\nПечатаю развернутый массив");
        for (int k : myArray1)
            System.out.println(k);
        // Разворот массива без создания дополнительного массива

        for (int i=0; i<myArray.length/2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[myArray.length-1-i];
            myArray[myArray.length-1-i] = temp;
        }
        System.out.println("\nПечатаю развернутый вторым способом массив");
        for(int value : myArray) System.out.println(value);

    }
}
