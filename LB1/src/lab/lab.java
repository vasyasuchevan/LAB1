package lab;

import java.util.Scanner;

public class lab {
	public static void main(String[] str) {
		int m = 0;
		do {
		Scanner in = new Scanner(System.in);
		System.out.println("\n1. switch.\n2. ����� \n 3. �����");
		System.out.println("������� ���� � ������ ����:");
		try {
		m = in.nextInt();
		switch(m) {
		case 1: zavd1();break;
		case 2: zavd2();break;
	
		default:System.out.println("����� ��������");
		}
}
		catch(Exception r) {System.out.println("������� �����!");}
}
		while(m!=3);
		
}
public static void zavd1() {
	Scanner in = new Scanner(System.in);
	try {
	System.out.println("������ ����� ������� - ");
	int n = in.nextInt();
	switch(n) {
	case 1:System.out.print("�� - ��������");break;
	case 2:System.out.print("�� - ������������");break;
	case 3:System.out.print("�� - ������");break;
	case 4:System.out.print("�� - �������");break;
	case 5: System.out.print("�� - ���������");break;
	case 6:System.out.print("�� - ����");break;
	case 7:System.out.print("�� - Գ��������");break;
	default:System.out.println("������� �� ����!");
	}}
	catch(Exception e) {System.out.println("������� ��� "+e.toString());}

}
public static void zavd2() {
	double x1 = 0;
	double x2 = 6,y=0;
	double h = 0.5;
	System.out.println("while\nx\t|\ty\n__________________");
	while(x1<=x2) {
		y=1/(1-Math.sqrt(x1));
		System.out.printf("\n"+x1+"\t|\t" +"%.2f", y);
		System.out.printf("\n");
		x1 += h;
	}
	x1 = 0;
	x2 = 6;
	y=0;
	h = 0.5;
	System.out.println("do while\nx\t|\ty\n__________________");
	do {
		y=1/(1-Math.sqrt(x1));
		System.out.printf("\n"+x1+"\t|\t" +"%.2f", y);
		System.out.printf("\n");
		x1 += h;
	}
	while(x1<=x2);
	
}}