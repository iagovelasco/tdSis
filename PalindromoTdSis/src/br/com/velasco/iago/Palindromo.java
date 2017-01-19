package br.com.velasco.iago;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Palindromo {

	private static Scanner scanner;

	public static void main(String args[]) {

		scanner = new Scanner(System.in);
		System.out.print("Digite a string de entrada : ");
		String s = scanner.next();

		temNumero(s);
		verificaTamanho(s);
		revert(s);

		System.out.print("Digite a quantidade de verificações: ");
		int verificacoes = scanner.nextInt();

		verificaNumeros(verificacoes);

		List<int[]> indexes = new ArrayList<>();
		for (int x = 1; x <= verificacoes; x++) {
			scanner = new Scanner(System.in);
			System.out.print("Digite os indices da verificação " + x
					+ " separados por espaço: ");
			String indexLine = scanner.nextLine();
			int[] idxArray = parseIndexes(indexLine);
			int i = idxArray[0];
			int j = idxArray[1];
			int k = idxArray[2];
			int l = idxArray[3];
			if (i < 1 || i > j || j > s.length() || k < 1 || k > l
					|| l > s.length()) {
				System.out.print("Indice de verificação " + x
						+ " inválido, tente novamente");
				System.exit(1);
			}
			indexes.add(idxArray);
		}
		for (int[] indexArray : indexes) {
			StringBuilder builder = new StringBuilder();
			for (int index : indexArray) {
				builder.append(revert(s).charAt(index - 1));
			}
			String wrd = builder.toString();
			String rev = builder.reverse().toString();
			if (wrd.equals(rev))
				System.out.println("YES");
			else
				System.out.println("NO");
		}

	}

	public static boolean temNumero(String texto) {
		// cria um array de char
		char[] c = texto.toCharArray();
		boolean soTexto = true;
		for (int i = 0; i < c.length; i++)
			// verifica se o char não é um inteiro
			if (Character.isDigit(c[i])) {
				// Verificou que a String contem inteiro
				soTexto = false;
				System.out.print("A String digitada contem número");
				System.exit(1);
			}
		// Verificou que a String só tem texto
		return soTexto;
	}

	public static boolean verificaTamanho(String texto) {
		boolean tamanho = true;
		// verifica se o texto tem tamanho maior que 2 ou maior que 1000000
		if (texto.length() < 2 || texto.length() > 1000000) {
			tamanho = false;
			System.out
					.print("A String digitada possui um tamanho não permitido");
			System.exit(1);
		}
		return tamanho;
	}

	public static String revert(String texto) {
		new StringBuilder(texto).reverse().toString();
		return texto;
	}

	public static Integer verificaNumeros(Integer checks) {
		if (checks < 1 || checks > 333333) {
			System.out.print("Quantidade de verificações não permitida");
			System.exit(1);
		}
		return checks;
	}

	/**
	 * 
	 * @param sizes
	 * @return
	 */
	public static int[] parseIndexes(String texto) throws NumberFormatException {
		return Arrays.asList(texto.split("\\s+")).stream()
				.mapToInt(Integer::parseInt).toArray();
	}

}