package Advent2021.DayOne;

import java.util.List;

public class DayOnePartOne
{
    private final List<Integer> depthList;

    public DayOnePartOne(List<Integer> depthList)
    {

        this.depthList = depthList;
    }

    public int increases()
    {
        int totalIncreases = 0;
        if(depthList.size() ==1)
        {
            return 0;
        }
        int lastNumber = depthList.get(0);
        for (int currentIndex = 1; currentIndex < depthList.size(); currentIndex++)
        {
            final Integer currentDepth = depthList.get(currentIndex);
            if(currentDepth >lastNumber){
                totalIncreases++;
            }
            lastNumber = currentDepth;
        }
        return totalIncreases;
    }
}
