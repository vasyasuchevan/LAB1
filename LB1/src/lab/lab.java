package lab;

import java.util.Scanner;

public class lab {
	public static void main(String[] str) {
		int m = 0;
		do {
		Scanner in = new Scanner(System.in);
		System.out.println("\n1. switch.\n2. Цикли \n 3. Вихід");
		System.out.println("Виберіть один з пунктів меню:");
		try {
		m = in.nextInt();
		switch(m) {
		case 1: zavd1();break;
		case 2: zavd2();break;
	
		default:System.out.println("Вихід схвалено");
		}
}
		catch(Exception r) {System.out.println("Помилка вводу!");}
}
		while(m!=3);
		
}
public static void zavd1() {
	Scanner in = new Scanner(System.in);
	try {
	System.out.println("Введіть номер кольору - ");
	int n = in.nextInt();
	switch(n) {
	case 1:System.out.print("Це - Червоний");break;
	case 2:System.out.print("Це - Помаранчивий");break;
	case 3:System.out.print("Це - Жовтий");break;
	case 4:System.out.print("Це - Зелений");break;
	case 5: System.out.print("Це - Блакитний");break;
	case 6:System.out.print("Це - Синій");break;
	case 7:System.out.print("Це - Фіолетовий");break;
	default:System.out.println("Кольору не існує!");
	}}
	catch(Exception e) {System.out.println("Невірний ввід "+e.toString());}

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