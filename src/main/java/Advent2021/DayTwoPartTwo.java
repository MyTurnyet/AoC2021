package Advent2021;

import java.util.List;

public class DayTwoPartTwo extends DayTwoPartOne
{
    @Override
    public int sumMovements(List<MoveOrder> moveOrders)
    {
        int currentAim = 0;
        int depth = 0;
        int movement = 0;
        for (MoveOrder moveOrder : moveOrders)
        {
            currentAim = moveOrder.updateAim(currentAim);
            depth = moveOrder.addDepthWithAim(depth,currentAim);
            movement = moveOrder.addHorizontal(movement);
        }
        return depth * movement;
    }
}
