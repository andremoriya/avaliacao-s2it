package me.moriya.exercicio8;

/**
 * Exercicio 8: <br/>
 * Dados dois numeros inteiros A e B, crie um terceiro inteiro C seguindo as seguintes regras: <br/> 
 * - O primeiro n�mero de C � o primeiro n�mero de A; <br/> 
 * - O segundo n�mero de C � o primeiro n�mero de B; <br/> 
 * - O terceiro n�mero de C � o segundo n�mero de A; <br/>
 * - O quarto n�mero de C � o segundo n�mero de B; Assim sucessivamente� <br/> 
 * - Caso os n�meros de A ou B sejam de tamanhos diferentes, completar C com o restante dos n�meros do inteiro maior.<br/> 
 * Ex: A = 10256, B = 512, C deve ser 15012256. <br/>
 * - Caso C seja maior que 1.000.000, retornar -1 <br/>
 * Desenvolva um algoritmo que atenda a todos os requisitos acima.
 * 
 * @author andremoriya@gmail.com
 *
 */
public class GenerateLetter {
	
	private Integer a;
	private Integer b;

	private GenerateLetter(Integer a, Integer b) {
		this.a = a;
		this.b = b;
	}
	
	public static GenerateLetter of(Integer a, Integer b) {
		return new GenerateLetter(a, b);
	}

	public int create() {
		char[] first = a.toString().toCharArray();
		char[] second = b.toString().toCharArray();
		
		int larger = first.length > second.length ? first.length : second.length;
		String letterC = define(larger, first, second);

		Integer c = Integer.valueOf(letterC);

		return c > 1000000 ? -1 : c;
	}
	
	private String define(int larger, char[] first, char[] second) {
		String c = "";

		for (int index = 0; index < larger; index++) {
			if (first.length > index)
				c += String.valueOf(first[index]);
			if (second.length > index)
				c += String.valueOf(second[index]);
		}
		return c;
	}
	
}
