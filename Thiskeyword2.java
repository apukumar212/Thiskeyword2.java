package com.pack1;

public class Thiskeyword2 
{
void meth1()
{
	System.out.println("meth1() called");
	meth2();
	this.meth3();
}
static void meth2()
{
	System.out.println("meth2() called");
	//this.meth3();//C.E bcz we cant use "this" keyword inside a static context/area.
}
void meth3()
{
	System.out.println("meth3() called");
}
public static void main(String[] args) 
{
	new Thiskeyword2().meth1();
	//this.meth1(); //C.E
}
}
