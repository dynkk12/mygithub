package com.dyk.test;

public class StarEx {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (j == 5) {
					System.out.print("[" + i + "]"+ "[" + j + "]");
				} else {
					System.out.print("[" + i + "]"+ "[" + j + "]" + ",");
				}
			}
			System.out.println();
		}
	}
}
