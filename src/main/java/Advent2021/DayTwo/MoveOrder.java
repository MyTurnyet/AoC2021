package Advent2021.DayTwo;

import java.util.Objects;

public class MoveOrder
{
    private final String commandName;
    private final int movementValue;

    public MoveOrder(String commandString)
    {
        final String[] split = commandString.split(" ");
        this.commandName = split[0];
        this.movementValue = Integer.parseInt(split[1]);
    }

    public int addHorizontal(int currentHorizontalValue)
    {
        if (!Objects.equals(commandName, "forward"))
        {
            return currentHorizontalValue;
        }
        return currentHorizontalValue + movementValue;
    }

    public int addVertical(int currentVerticalValue)
    {
        if (commandName.equals("down"))
        {
            return currentVerticalValue + movementValue;
        }
        if (commandName.equals("up"))
        {
            return currentVerticalValue - movementValue;
        }
        return currentVerticalValue;
    }

    public int addDepthWithAim(int currentDepth, int currentAim)
    {
        if (!commandName.equals("forward"))
        {
            return currentDepth;
        }
        int moveWithAim = movementValue * currentAim;
        return currentDepth + moveWithAim;
    }

    public int updateAim(int currentAim)
    {
        if (commandName.equals("up"))
        {
            return currentAim - movementValue;
        }
        if (commandName.equals("down"))
        {
            return currentAim + movementValue;
        }
        return currentAim;
    }
}
