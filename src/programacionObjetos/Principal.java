package programacionObjetos;

import tutorialJava.capitulo4_OO.ejercicios.bloque03.ejercicio06_Restaurante.Menu;
import tutorialJava.capitulo4_OO.ejercicios.bloque03.ejercicio06_Restaurante.Plato;

public class Principal {

	public static void main(String[] args) {
		// Primeros platos
				alimento macarrones = new Plato("Macarrones con tomate", 5f);
				alimento tortilla = new Plato("Tortilla", 3f);
				alimento solomillo = new Plato("Solomillo", 10f);
				alimento pizza = new Plato("Pizza", 7.5f);
				alimento flamenquin = new Plato("Flamenqu�n", 9f);
				alimento sanJacobo = new Plato("San Jacobo", 11f);
				alimento habicholones = new Plato("Habicholones", 4f);
				
				
				// Construimos los men�s
				Menu menus[] = new Menu[3];
				menus[0] = new Menu(lenguado, pulpo, fruta);
				menus[1] = new Menu(flamenquin, ensalada, natillas);
				menus[2] = new Menu(flamenquin, solomilloRoquefort, tarta3Chocolates);
				
				// Imprimo articulo
				for (int i = 0; i < menus.length; i++) {
					System.out.println(menus[i].toString());
				}
				
	}

}
