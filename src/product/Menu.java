package product;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import product.controller.ProductController;
import product.model.Armor;
import product.model.Product;
import product.model.Weapon;
import product.util.Colors;

public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int option, itemCode, itemType, itemBaseArmorClass;
		String itemName, itemDescription, itemBaseDamage;
		float itemPrice;
		boolean itemAttunementRequired;
		
		ProductController products = new ProductController();
		
		
		Product weaponVorpalSword = new Weapon(1, 1, "Espada Vorpal", "Decapita em um golpe crítico", 100000, true, "2d6");
		products.create(weaponVorpalSword);
		
		Product armorAdamantineArmor = new Armor(2, 2, "Armadura de Adamantina", "Torna qualquer golpe crítico um golpe normal", 200000, false, 14);
		products.create(armorAdamantineArmor);
		
		products.listAll();
		
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
				
				keyPress();
				continue;
				
			}
			
			switch(option) {
			
			case 1:
				itemCode = products.generateCode();
				
				System.out.println(Colors.TEXT_WHITE + "\nCadastrar item");
				
				do {
					System.out.println(Colors.TEXT_WHITE + "\nDigite o tipo do item a ser cadastrado (1 - Arma | 2 - Armadura):");
					itemType = input.nextInt();
					
				} while (itemType < 1 && itemType > 2);
				
				System.out.println(Colors.TEXT_WHITE + "\nDigite o nome do item a ser cadastrado:");
				input.nextLine();
				itemName = input.nextLine();
				
				System.out.println(Colors.TEXT_WHITE + "\nDescreva o efeito mágico do item a ser cadastrado: ");
				itemDescription = input.nextLine();
				
				System.out.println(Colors.TEXT_WHITE + "\nDigite o preço em Peças de Ouro do item a ser cadastrado: ");
				itemPrice = input.nextFloat();
				input.nextLine();
				
				System.out.println(Colors.TEXT_WHITE + "\nInforme se o item precisa de sintonização: ");
				itemAttunementRequired = Boolean.parseBoolean(input.nextLine());
				
				switch(itemType) {
				case 1:
					System.out.println(Colors.TEXT_WHITE + "\nInforme o dado de dano da arma: ");
					itemBaseDamage = input.nextLine();
					
					products.create(new Weapon(itemCode, itemType, itemName, itemDescription, itemPrice, itemAttunementRequired, itemBaseDamage));
					break;
					
				case 2:
					System.out.println(Colors.TEXT_WHITE + "\nInforme a CA base da armadura: ");
					itemBaseArmorClass = input.nextInt();
					
					products.create(new Armor(itemCode, itemType, itemName, itemDescription, itemPrice, itemAttunementRequired, itemBaseArmorClass));
					
					break;
				}
				
				keyPress();
        		break;
        		
			case 2:
				System.out.println(Colors.TEXT_WHITE + "\nListar todos os itens");
				products.listAll();
				
				keyPress();
        		break;
        		
			case 3:
				System.out.println(Colors.TEXT_WHITE + "\nBuscar item por código");
				System.out.println(Colors.TEXT_WHITE + "\nDigite o código do item que deseja localizar: ");
				itemCode = input.nextInt();
				
				products.searchbyCode(itemCode);
				
				keyPress();
        		break;
				
			case 4:
				System.out.println(Colors.TEXT_WHITE + "\nAtualizar item");
				System.out.println(Colors.TEXT_WHITE + "\nDigite o código do item a ser atualizado:");
				itemCode = input.nextInt();
				
				do {
					System.out.println(Colors.TEXT_WHITE + "\nDigite o tipo do item a ser atualizado (1 - Arma | 2 - Armadura):");
					itemType = input.nextInt();
					
				} while (itemType < 1 && itemType > 2);
				
				System.out.println(Colors.TEXT_WHITE + "\nDigite o nome do item a ser atualizado:");
				input.nextLine();
				itemName = input.nextLine();
				
				System.out.println(Colors.TEXT_WHITE + "\nDescreva o efeito mágico do item a ser atualizado: ");
				itemDescription = input.nextLine();
				
				System.out.println(Colors.TEXT_WHITE + "\nDigite o preço em Peças de Ouro do item a ser atualizado: ");
				itemPrice = input.nextFloat();
				input.nextLine();
				
				System.out.println(Colors.TEXT_WHITE + "\nInforme se o item precisa de sintonização: ");
				itemAttunementRequired = Boolean.parseBoolean(input.nextLine());
				
				switch(itemType) {
				case 1:
					System.out.println(Colors.TEXT_WHITE + "\nInforme o novo dado de dano da arma: ");
					itemBaseDamage = input.nextLine();
					
					products.update(new Weapon(itemCode, itemType, itemName, itemDescription, itemPrice, itemAttunementRequired, itemBaseDamage));
					break;
					
				case 2:
					System.out.println(Colors.TEXT_WHITE + "\nInforme a nova CA base da armadura: ");
					itemBaseArmorClass = input.nextInt();
					
					products.update(new Armor(itemCode, itemType, itemName, itemDescription, itemPrice, itemAttunementRequired, itemBaseArmorClass));
					
					break;
				}
				
				keyPress();
        		break;
        		
			case 5:
				System.out.println(Colors.TEXT_WHITE + "\nRemover item");
				System.out.println(Colors.TEXT_WHITE + "\nDigite o código do item a ser removido: ");
				itemCode = input.nextInt();
				
				products.delete(itemCode);
				
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
