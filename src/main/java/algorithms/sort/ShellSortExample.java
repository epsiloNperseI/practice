package algorithms.sort;


public class ShellSortExample {

    public static void shellSort(int[] array) {
        int n = array.length;

        // Уменьшаем интервал между сравниваемыми элементами
        for (int interval = n / 2; interval > 0; interval /= 2) {
            // Выполняем сортировку вставками для этого интервала
            for (int i = interval; i < n; i++) {

                int temp = array[i];

                int j;

                // Сдвигаем элементы, которые больше temp, на интервал вправо
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];

                }

                // Вставляем temp на правильное место
                array[j] = temp;
            }
        }
    }


}
