package strategy;

import java.util.List;

public class BubbleSort implements SortStrategy{
    @Override
    public void sort(List<Integer> list) {
        System.out.println("Сортировка пузырьком");
    }
}
