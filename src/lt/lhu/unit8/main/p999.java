package lt.lhu.unit8.main;

import java.util.Scanner;

public class p999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 0;
		double y;
		double dev;
		double res;
		double sum;

		x = inputDoubleFromConsole("Введите значение x: ");

		dev = devision(x);
		res = result(x);
		sum = addition(x);

		y = res - Math.abs(Math.sin(dev)) + sum;

		simplePrint(y);

	}

	public static double inputDoubleFromConsole(String message) {
		double x;
		Scanner sc = new Scanner(System.in);
		System.out.print(message);
		while (!sc.hasNextDouble()) {
			sc.nextLine();
			System.out.print("Неверный ввод. " + message);
		}
		x = sc.nextDouble();
		return x;
	}

	public static double devision(double x) {
		double dev;
		dev = Math.PI * x / (x + 2.0 / 3.0);
		return dev;
	}

	public static double result(double x) {
		double res;
		res = Math.sqrt(Math.pow(Math.E, 2.2 * x));
		return res;
	}

	public static double addition(double x) {
		double sum;
		sum = 1.7;
		return sum;
	}

	public static void simplePrint(double y) {
		System.out.println(y);
	}

}
