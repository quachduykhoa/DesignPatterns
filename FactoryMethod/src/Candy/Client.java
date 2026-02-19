package Candy;

import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		AbstractCandy candyGummy = new CandyGummyFactory();
//		System.out.println(candyGummy.getCandy().getCandyName());
		CandyStore candyStore1 = new CandyStore(candyGummy);
		candyStore1.orderCandy();


		AbstractCandy candyHard = new CandyHardFactory();
//		System.out.println(candyHard.getCandy().getCandyName());
		CandyStore candyStore2 = new CandyStore(candyHard);
		candyStore2.orderCandy();
	}
}
