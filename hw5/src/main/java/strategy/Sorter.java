package strategy;

import java.util.List;

public class Sorter {
    SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sort(List<Integer> list){
        strategy.sort(list);
    }
}
