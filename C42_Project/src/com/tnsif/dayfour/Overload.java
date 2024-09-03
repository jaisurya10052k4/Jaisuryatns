package com.tnsif.dayfour;

class Number{
	int num1;
	int num2;
	int Result;
	
	void sum(int a, int b) {
		num1=a;
		num2=b;
		Result=a+b;
		System.out.println("The Result is: "+Result);
	}
    void sum(int a, double b) {
    	num1=a;
		num2=(int)b;
		Result=a+(int)b;
		System.out.println("The Result is: "+Result);
		
	}
    void sum(double a, double b) {
    	num1=(int)a;
		num2=(int)b;
		Result=(int)a+(int)b;
		System.out.println("The Result is: "+Result);
	}
}

public class Overload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number n = new Number();
		n.sum(10, 20);
		n.sum(15, 20.5);
		n.sum(25.6, 38.5);
	}
}
