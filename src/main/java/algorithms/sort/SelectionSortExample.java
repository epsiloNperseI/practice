package algorithms.sort;

public class SelectionSortExample {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Находим индекс минимального элемента
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Меняем местами найденный минимальный элемент с первым элементом
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

}
