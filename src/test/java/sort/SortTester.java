package sort;

import algorithms.sort.SelectionSortExample;
import algorithms.sort.ShellSortExample;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class SortTester {

    int size = 100000;
    int[] invertedArray = generateInvertedArray(size);
    int[] randomArray = generateRandomArray(size);
    int[] partiallySortedArray = generatePartiallySortedArray(size);


    @Test
    public void testSelectionSortOnInvertedArray() {

        testSelectionSort("Инверсированный массив", invertedArray);
        assertTrue(isSorted(invertedArray));

    }

    @Test
    public void testShellSortOnInvertedArray() {

        testShellSort("Инверсированный массив", invertedArray);
        assertTrue(isSorted(invertedArray));

    }

    @Test
    public void testShellSortOnRandomArray() {

        testShellSort("Неупорядоченный массив", randomArray);
        assertTrue(isSorted(randomArray));

    }

    @Test
    public void testShellSortOnPartiallySortedArray() {

        testSelectionSort("Частично упорядоченный массив", partiallySortedArray);
        assertTrue(isSorted(partiallySortedArray));

    }


    private boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    private int[] generateInvertedArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = size - i;
        }
        return array;
    }

    private int[] generateRandomArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * size);
        }
        return array;
    }

    private int[] generatePartiallySortedArray(int size) {
        int[] array = generateRandomArray(size);
        ShellSortExample.shellSort(array); // частично отсортировать
        // Внесение случайных изменений
        for (int i = 0; i < size / 10; i++) {
            array[(int) (Math.random() * size)] = (int) (Math.random() * size);
        }
        return array;
    }

    public void testShellSort(String description, int[] array) {
        long startTime = System.currentTimeMillis();
        ShellSortExample.shellSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println(description);
        System.out.println("Время выполнения (мс): " + (endTime - startTime) + "\n");
    }

    public void testSelectionSort(String description, int[] array) {
        long startTime = System.currentTimeMillis();
        SelectionSortExample.selectionSort(array);
        long endTime = System.currentTimeMillis();

        System.out.println(description);
        System.out.println("Время выполнения (мс): " + (endTime - startTime) + "\n");

    }


}
