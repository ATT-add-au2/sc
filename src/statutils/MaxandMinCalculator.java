
package statutils;

import java.util.*;

public class MaxandMinCalculator {

    private List<Double> exampleData;

    public MaxandMinCalculator(List<Double> _exampleData) {
        setData(_exampleData);
    }

    public void setData(List<Double> _exampleData) {
        exampleData = _exampleData;
    }

    public List<Double> getData() {
        return exampleData;
    }

    // calculate max
    public double max() {
        return Collections.max(exampleData);
    }

    // calculate min
    public double min() {
        return Collections.min(exampleData);
    }

}
