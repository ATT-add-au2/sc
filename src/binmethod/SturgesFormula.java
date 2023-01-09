
package binmethod;

import java.util.List;

public class SturgesFormula extends BinFormulae {

    public int calcNumOfBins() {
        int result = (int) Math.rint(3.3 * Math.log10(getData().size()) + 1);
        setNumberOfBins(result);
        return result;
    }
  
    public SturgesFormula(List<Double> _exampleData) {
        super(_exampleData);
    }

}
