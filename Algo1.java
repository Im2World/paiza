package javaOh;

import java.util.Scanner;

//word + word
//2022.06.09.13:27.

public class Algo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int wordNum = sc.nextInt();
		String inputWord;
		String[] words = new String[wordNum];
				
		for (int i = 0; i < wordNum; i++) {
//			System.out.println("text");
			inputWord = sc.next();		//don't use nextLine
			words[i] = inputWord;
		}
		
//		print result
		System.out.print("Hello ");

		for (int i = 0; i < words.length; i++) {
			if (i == words.length - 1 ) {
				System.out.print(words[i] + ".");
			} else {
				System.out.print(words[i] + ",");
			}
		}
		sc.close();
		
	}
}

/*
입력
5
Alice
Bob
Carol
Dave
Ellen

출력
Hello Alice,Bob,Carol,Dave,Ellen.
*/
