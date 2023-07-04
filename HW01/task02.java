import java.util.Arrays;

// 2) Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
// и возвращающий новый массив, каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
// Если длины массивов не равны, необходимо как-то оповестить пользователя.

public class task02 {
    public static void main(String[] args) {
        int[] arrayOne = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int[] arrayTwo = { 1, 2, 3, 4, 5, 6, 7, 8 };

        buildArray(arrayOne, arrayTwo);
    }

    public static void buildArray(int[] arrayOne, int[] arrayTwo) {
        int[] arrayThree = new int[arrayOne.length];
        if (arrayOne.length == arrayTwo.length) {
            for (int i = 0; i < arrayTwo.length; i++) {
                arrayThree[i] = arrayOne[i] - arrayTwo[i];
            }
            System.out.println(Arrays.toString(arrayThree));

        } else

        {
            throw new RuntimeException("Разная длинна массивов");
        }
    }
}