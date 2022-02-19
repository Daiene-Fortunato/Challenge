package challenge;

import java.util.Arrays;
import java.util.Scanner;

public class Question3 {

	public static String word;
	public static Integer result = 0;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Bem vindo ao Programa!");
		System.out.print("Digite a palavra para verificar: ");
		word = sc.nextLine();
		sc.close();

		getWordAnagram(word);

		System.out.println(result);
		System.out.println("Programa Encerrado");
	}

	public static void getWordAnagram(String word) {

		int wordSize = word.length();

		for (int j = 1; j < wordSize; j++) {

			for (int i = 0; i < (wordSize - j); i++) {

				String wordAnagram = word.substring(i, i + j);

				change(word, wordAnagram, i);
			}
		}
	}

	public static void change(String word, String wordAnagram, int i) {
		char[] wordAnagramChar = wordAnagram.toCharArray();
		Arrays.sort(wordAnagramChar);

		for (int position = (i + 1); position <= (word.length() - wordAnagram.length()); position++) {

			char[] wordChar = word.substring(position, position + wordAnagram.length()).toCharArray();
			Arrays.sort(wordChar);

			if (Arrays.equals(wordAnagramChar, wordChar)) {
				result++;
			}
		}
	}
}
