package statutils;

import java.util.Collections;
import java.util.List;

public class MedianCalculator {
    private List<Double> exampleData;

    public MedianCalculator(List<Double> exampleData) {
        this.exampleData = exampleData;
    }

    public Double getMedian() {
        Collections.sort(exampleData);
        int size = exampleData.size();
        if (size % 2 != 1) {
            return (exampleData.get(size / 2 - 1) + exampleData.get(size / 2) + 0.) / 2;
        } else {
            return exampleData.get((size - 1) / 2);
        }
    }


}
