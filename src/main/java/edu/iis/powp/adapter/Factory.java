package edu.iis.powp.adapter;

public class Factory {
	public ComplexCommand drawRectangle(int a, int b)
	{
		ComplexCommand complex = new ComplexCommand();
		complex.addCommand(new CommandSetPosition(0,0));
		complex.addCommand(new CommandDrawLineToPosition(0,a));
		complex.addCommand(new CommandDrawLineToPosition(b,a));
		complex.addCommand(new CommandDrawLineToPosition(b,0));
		complex.addCommand(new CommandDrawLineToPosition(0,0));
		return complex;
	}
	public ComplexCommand drawTriangle(int a1, int b1, int c1,int a2, int b2, int c2)
	{
		ComplexCommand complex = new ComplexCommand();
		complex.addCommand(new CommandSetPosition(a1,a2));
		complex.addCommand(new CommandDrawLineToPosition(b1,b2));
		complex.addCommand(new CommandDrawLineToPosition(c1,c2));
		complex.addCommand(new CommandDrawLineToPosition(a1,a2));
		return complex;
	}
	public ComplexCommand drawQuadrangle(int a1, int b1, int c1, int d1,int a2, int b2, int c2, int d2)
	{
		ComplexCommand complex = new ComplexCommand();
		complex.addCommand(new CommandSetPosition(a1,a2));
		complex.addCommand(new CommandDrawLineToPosition(b1,b2));
		complex.addCommand(new CommandDrawLineToPosition(c1,c2));
		complex.addCommand(new CommandDrawLineToPosition(d1,d2));
		complex.addCommand(new CommandDrawLineToPosition(a1,a2));
		return complex;
	}
}
