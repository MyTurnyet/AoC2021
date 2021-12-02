package Advent2021.DayTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DayTwoPartOne
{

    public ArrayList<MoveOrder> splitInputToMoveOrders(String inputString)
    {

        return Arrays.stream(inputString.split("\n")).map(MoveOrder::new).collect(Collectors.toCollection(ArrayList::new));
    }

    public  int sumMovements(List<MoveOrder> moveOrders)
    {
        int depth = 0;
        int movement = 0;
        for (MoveOrder moveOrder : moveOrders)
        {
            depth = moveOrder.addVertical(depth);
            movement = moveOrder.addHorizontal(movement);
        }
        return depth * movement;
    }

    public int processInput(String inputString)
    {
        final ArrayList<MoveOrder> moveOrders = splitInputToMoveOrders(inputString);
        return sumMovements(moveOrders);
    }
}
