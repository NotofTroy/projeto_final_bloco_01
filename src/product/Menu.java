package product;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import product.model.Armor;
import product.model.Product;
import product.model.Weapon;
import product.util.Colors;

public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int option;
		
		//testing Product Class
		Product vorpalSword = new Product(1, 1, "Espada Vorpal", "Decapita em um golpe crítico", 100000, true);
		Product adamantineArmor = new Product(1, 2, "Armadura de Adamantina", "Torna qualquer golpe crítico um golpe normal", 200000, false);
		vorpalSword.show();
		adamantineArmor.show();
		
		//testing Weapon Class
		Product weaponVorpalSword = new Weapon(1, 1, "Espada Vorpal", "Decapita em um golpe crítico", 100000, true, "2d6");
		weaponVorpalSword.show();
		
		//testing Armor Class
		Product armorAdamantineArmor = new Armor(1, 2, "Armadura de Adamantina", "Torna qualquer golpe crítico um golpe normal", 200000, false, 14);
		armorAdamantineArmor.show();
		
		while(true) {
			
			System.out.println(Colors.TEXT_WHITE + Colors.ANSI_BLUE_BACKGROUND_BRIGHT
					+ "*****************************************************");
			System.out.println("                                                     ");
			System.out.println("                ITENS MÁGICOS STRANGE                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar item                       ");
			System.out.println("            2 - Listar todos os itens                ");
			System.out.println("            3 - Buscar item por código	             ");
			System.out.println("            4 - Atualizar item      	             ");
			System.out.println("            5 - Remover item	                     ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Insira a opção desejada:                             ");
			System.out.println("                                                     " + Colors.TEXT_RESET);
			
			try {
				option = input.nextInt();
				
			} catch(InputMismatchException e) {
				
				System.out.println(Colors.TEXT_RED_BOLD + "\nDigite números inteiros!\n" + Colors.TEXT_RESET);
				input.nextLine();
				
				// in the cookbook, there was no call for keyPress() or continue, 
				// it just assigned 0 to option (option = 0).
				// I chose to call keyPress() and continue to the next iteration of while,
				// to avoid the processing of the switch case and its triggering of default.
				keyPress();
				continue;
				
			}
			
			switch(option) {
			
			case 1:
				System.out.println(Colors.TEXT_WHITE + "Cadastrar item\n\n");
				
				keyPress();
        		break;
        		
			case 2:
				System.out.println(Colors.TEXT_WHITE + "Listar todos os itens\n\n");
				
				keyPress();
        		break;
        		
			case 3:
				System.out.println(Colors.TEXT_WHITE + "Buscar item por código\n\n");
				
				keyPress();
        		break;
				
			case 4:
				System.out.println(Colors.TEXT_WHITE + "Atualizar item\n\n");
				
				keyPress();
        		break;
        		
			case 5:
				System.out.println(Colors.TEXT_WHITE + "Remover item\n\n");
				
				keyPress();
        		break;
        		
			case 6:
				System.out.println(Colors.TEXT_WHITE_BOLD + "\nItens mágicos Strange: Facilitando aventuras!");
				about();
				input.close();
				System.exit(0);
				
				break;
				
			default:
				System.out.println(Colors.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Colors.TEXT_RESET);
				
				keyPress();
				break;
			}
		}
	}
	


	public static void about() {
		
		System.out.println("\n*****************************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Helena Cristina Souto Fonseca - helenacsfonseca@hotmail.com");
		System.out.println("https://github.com/NotofTroy");
		System.out.println("*****************************************************************");
	}
	
	private static void keyPress() {
		
		try {

			System.out.println(Colors.TEXT_RESET + "\nPressione Enter para Continuar.");
			System.in.read();

		} catch (IOException e) {

			System.out.println(Colors.TEXT_RED_BOLD + "\nPressione somente enter" + Colors.TEXT_RESET);
		}
	}
}
