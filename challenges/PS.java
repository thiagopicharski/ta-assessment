package test;

import java.util.*;

//PS de Processo Seletivo
public class PS {
	// Quantidade de Teclas Numericas e limite de Letras
	public static final int TAMTECLADO = 9;
	public static final int TAMLETRAS = 50;

	// args[0] cont�m a palavra. Como n�o foi especificado como seria a entrada
	// (Programa, interface, funcionalidade etc) optei por deixar pr�tico para implementa��o
	// Utilizei da IDE Eclipse para testar o c�digo, nele h� possibilidade de alterar 'args[]'
	public static void main(String[] args) {
		// Optei por colocar o resultado num vetor caso houvesse necessidade de exportar e
		// torna-se mais pr�tico para agrupar os resultados
		Vector<String> resultado = new Vector<String>(TAMLETRAS);

		// Criei um HashMap para padronizar quais teclas possuem quais digitos
		HashMap<Integer, String> teclado = new HashMap<Integer, String>();
		teclado.put(2, "abc");
		teclado.put(3, "def");
		teclado.put(4, "ghi");
		teclado.put(5, "jkl");
		teclado.put(6, "mno");
		teclado.put(7, "pqrs");
		teclado.put(8, "tuv");
		teclado.put(9, "wxyz");


		try {
			// Como n�o gosto de trabalhar comn o argumento em si resolvi coloca-lo numa variavel
			String palavra = args[0];
			
			// Caso o usu�rio n�o coloque nenhuma palavra no args[0] ele retorna este alerta
			if (palavra.length() < 1 || palavra.length() > 50) {
				System.out.println("Usage: java handlerNumeroLetra <input 1-50>");
				System.exit(1);
			}
			
			// Testa se o argumento � uma palavra do alfabeto
			if (!palavra.matches("[a-zA-Z]+")) {
				System.out.println("Usage: java handlerNumeroLetra <input a-z/A-Z>");
				System.exit(1);
			}

			// Roda de acordo com o tamanho da palavra
			for (int i = 0; i < palavra.length(); i++)
				// Segmenta um caracter para obter o numero e a quantiadde de pressionamentos
				resultado.add(handleParserNumeroLetra(palavra.substring(i, i + 1), teclado));

			// Um teste para ver o resultado em um vector
			//System.out.println(resultado);
			
			// Print exatamente como est� no github
			for(int i=0; i<palavra.length(); i++)
				System.out.println(resultado.get(i));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}

	public static String handleParserNumeroLetra(String letra, HashMap<Integer, String> teclado) {

		// Percorre as telcas de 2-9
		for (int i = 2; i <= TAMTECLADO; i++) {
			// Preenche auxiliar com o valor da posi��o, caso n�o encontre retorna -1 
			int auxiliar = teclado.get(i).indexOf(letra);

			// Caso encontre preenche com valor da posi��o de acordo com a String do HashMap (0-2 ou 0-3)
			if (auxiliar != -1)
				
				// Retorna uma String contendo a tecla do teclado e quantas vezes sera necess�rio precionar
				return "#" + i + "=" + (auxiliar + 1);
		}
		
		// Esse 'return' tem funcionalidade de tornar o metodo Parser v�lido;
		// N�o h� chance de erro se for uma palavra, pois no try/catch j� h� o tratamento
		// (Caracter especial, espa�o, ponto etc)
		return "";
	}
}