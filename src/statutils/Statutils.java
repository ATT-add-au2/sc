package statutils;

import statutils.MaxandMinCalculator;
import statutils.MeanCalculator;
import statutils.Scatter;
import statutils.SumCalculator;

import java.util.List;

public class Statutils {
    private final List<Double> exampleData;

    private final SumCalculator sumCalculator;
    private final MeanCalculator meanCalculator;
    private final Scatter scatter;
    private final MaxandMinCalculator maxandMinCalculator;
    private final NormalisedFreqCalculator normalisedFreqCalculator;
    private final MedianCalculator medianCalculator;

    public Statutils(List<Double> exampleData) {
        this.exampleData = exampleData;
        sumCalculator = new SumCalculator(exampleData);
        meanCalculator = new MeanCalculator(sumCalculator.sum());
        scatter = new Scatter(meanCalculator.mean(exampleData.size()), exampleData);
        maxandMinCalculator = new MaxandMinCalculator(exampleData);
        normalisedFreqCalculator = new NormalisedFreqCalculator(exampleData);
        medianCalculator = new MedianCalculator(exampleData);
    }

    public Double mean() {
        return meanCalculator.mean(exampleData.size());
    }

    public Double sum() {
        return sumCalculator.sum();
    }

    public Double variance() {
        return scatter.variance();
    }

    public Double standardDeviation() {
        return scatter.standardDeviation();
    }

    public Double max() { return maxandMinCalculator.max(); }

    public Double min() {
        return maxandMinCalculator.min();
    }

    public int getTypeOfEle() {
        return normalisedFreqCalculator.getTypeOfEle();
    }

    public double[] getEleTypeCollect() {
        return normalisedFreqCalculator.getEleTypeCollect();
    }

    public double[] getEleNumCollect() {
        return normalisedFreqCalculator.getEleNumCollect();
    }

    public double[] getNormalisedFreq() {
        return normalisedFreqCalculator.getNormalisedFreq();
    }

    public double getMedian() {
        return medianCalculator.getMedian();
    }

}
