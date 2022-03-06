//tabuada 0 à 10
package Programalacosencadeados17;

public class Programalacosencadeados17 {

	public static void main(String[] args) {
		for(int multiplicador = 1; multiplicador <=10; multiplicador++) {
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
