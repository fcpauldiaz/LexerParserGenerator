/**
 * Nombre del archivo: LexerAnalyzerParser.java
 * Universidad del Valle de Guatemala
 * Pablo Diaz 13203 
 * Descripción: Tercer proyecto. Generador de ParserMain
**/

import java.util.Scanner;

public class LexerAnalyzerParserMain {

/**
* @param args the command line arguments
 */
	public static void main(String[] args) {
		// TODO code application logic here
		String input;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Ingrese text a parsear");
		input = keyboard.next();
		LexerAnalyzerParser objParser = new LexerAnalyzerParser(input);
		objParser.procesoParseo(input);
	}
}
