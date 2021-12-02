package Advent2021.DayOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DayOnePartTwo
{

    public DayOnePartTwo()
    {
    }

    public int sum(List<Integer> integerList)
    {
        int totalSum = integerList.stream().mapToInt(integer -> integer).sum();
        return totalSum;
    }
//
//    public Integer[] splitToArrays(List<Integer> integerList)
//    {
//        final int numberOfSets = integerList.size() % 3;
//        for (int currentIndex = 0; currentIndex < numberOfSets; currentIndex += 3)
//        {
//            integerList.get(currentIndex);
//        }
//        return new Integer[0];
//    }


    public List<List<Integer>> splitIntoSets(List<Integer> integerList)
    {
        List<List<Integer>> sets = new ArrayList<>();
        int numberOfSets = integerList.size() - 2;
        for (int setIndex = 0; setIndex < numberOfSets; setIndex++)
        {
            final List<Integer> integers = integerList.subList(setIndex, setIndex + 3);
            sets.add(integers);
        }
        return sets;
    }

    public int countHigherSets(List<List<Integer>> setList)
    {
        int lastSum = 0;
        int totalHigherSets = 0;
        for (List<Integer> integers : setList)
        {
            final int setSum = sum(integers);
            if (lastSum != 0 && setSum > lastSum)
            {
                totalHigherSets++;
            }
            lastSum = setSum;

        }
        return totalHigherSets;
    }

    public int processList(List<Integer> integerList)
    {
        final List<List<Integer>> intoSets = splitIntoSets(integerList);
        final int higherSets = countHigherSets(intoSets);
        return higherSets;
    }
}
