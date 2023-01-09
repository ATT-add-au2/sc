
package binmethod;

import java.util.List;


public class SquareRootChoiceFormula extends BinFormulae {
    
    public int calcNumOfBins() {
        int result = (int) Math.pow(getData().size(), 0.5);
        setNumberOfBins(result);
        return result;
    }
    
    public SquareRootChoiceFormula(List<Double> _exampleData) {
        super(_exampleData);
    }
}
