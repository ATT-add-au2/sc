
package binmethod;

import java.util.List;

public class RiceRuleFormula extends BinFormulae {

    public RiceRuleFormula(List<Double> _exampleData) {
        super(_exampleData);
    }

    
    public int calcNumOfBins() {
        int result = (int) (2 * Math.pow(getData().size(), 1 / 3.));
        setNumberOfBins(result);
        return result;
    }
    
}
