package test;

import java.util.Scanner;

import controller.ContatoController;
import models.AgendaUtil;
public class Principal {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int input = 1;
		
		while(input != 0) {
			
		System.out.println("--AGENDA--\n");
		System.out.println("[1] CADASTRAR CONTATO\n");
		System.out.println("[2] LISTAR CONTATO\n");
		System.out.println("[3] REMOVER CONTATO\n");
		System.out.println("[0] SAIR\n");
			
		input = s.nextInt();
		 
			switch(input) {
		
			case 1:
				AgendaUtil.criarContato();
				break;
			
			case 2:
				ContatoController.listar();
				break;
			
			case 3:
				AgendaUtil.idRemover();
				break;
			
			case 0: 
				System.out.println("FECHANDO!!\n");
				break;
				
				
			default : 
				System.out.println("OPÇÃO INVÁLDA!!\n");
				break;
			}
			
		}	
		
	}

}
