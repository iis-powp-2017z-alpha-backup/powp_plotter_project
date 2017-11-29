package edu.iss.powp.command;

import java.util.ArrayList;
import java.util.List;

public class FigureFactory {
	
	private static List<PlotterCommand> list;

	public static ComplexCommand drawRectangle(int x, int y, int width, int height) {
		list = new ArrayList<>();
		list.add(new CommandSetPosition(x, y));
		list.add(new CommandDrawLineToPosition(x + width, y));
		list.add(new CommandDrawLineToPosition(x + width, y + height));
		list.add(new CommandDrawLineToPosition(x, y + height));
		list.add(new CommandDrawLineToPosition(x, y));

		return new ComplexCommand(list);
	}

	public static ComplexCommand drawTrapeze(int x, int y, int smallSide, int bigSide, int height) {
		list = new ArrayList<>();
		list.add(new CommandSetPosition(x, y));
		list.add(new CommandDrawLineToPosition(x + bigSide, y));
		list.add(new CommandDrawLineToPosition(x + smallSide + ((bigSide-smallSide)/2), y - height));
		list.add(new CommandDrawLineToPosition(x + ((bigSide-smallSide)/2), y - height));
		list.add(new CommandDrawLineToPosition(x, y));

		return new ComplexCommand(list);
	}
	
}