package strategy;

import java.util.List;

public class QuickSort implements SortStrategy{
    @Override
    public void sort(List<Integer> list) {
        System.out.println("Быстрая сортировка");
    }
}
