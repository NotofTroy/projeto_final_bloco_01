package product;

import java.util.Scanner;
import product.util.Colors;

public class Menu {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int option;
		
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

			option = input.nextInt();
			
			switch(option) {
			
			case 1:
				System.out.println(Colors.TEXT_WHITE + "Cadastrar item\n\n");
				
        		break;
        		
			case 2:
				System.out.println(Colors.TEXT_WHITE + "Listar todos os itens\n\n");
				
        		break;
        		
			case 3:
				System.out.println(Colors.TEXT_WHITE + "Buscar item por código\n\n");
				
        		break;
				
			case 4:
				System.out.println(Colors.TEXT_WHITE + "Atualizar item\n\n");
				
        		break;
        		
			case 5:
				System.out.println(Colors.TEXT_WHITE + "Remover item\n\n");
				
        		break;
        		
			case 6:
				System.out.println(Colors.TEXT_WHITE_BOLD + "\nItens mágicos Strange: Facilitando aventuras!");
				about();
				input.close();
				System.exit(0);
				
				break;
				
			default:
				System.out.println(Colors.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Colors.TEXT_RESET);
				
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
}
