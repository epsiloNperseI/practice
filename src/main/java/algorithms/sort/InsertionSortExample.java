package algorithms.sort;

public class InsertionSortExample {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            // Перемещаем элементы, которые больше current, на одну позицию вправо
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j];
                j--;
            }

            // Вставляем current на правильное место
            array[j + 1] = current;
        }
    }

}
