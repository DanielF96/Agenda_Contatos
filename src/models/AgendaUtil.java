package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import controller.ContatoController;

public class AgendaUtil {
	
	public static ContatoController contatoController = new ContatoController();
	
	public static void criarContato() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("--CADASTRO DO CONTATO--");
		System.out.print("ID: \n");
		String id =  s.nextLine();
		
		System.out.print("NÚMERO: \n");
		String telefone = s.nextLine();
		
		System.out.print("NOME: \n");
		String nome = s.nextLine();	
		
		System.out.print("PROFISSÃO: \n");
		String profissao = s.nextLine();
		
		System.out.print("E-MAIL: \n");
		String email = s.nextLine();
		
		System.out.print("CIDADE: \n");
		String cidade = s.nextLine();
		
		System.out.print("ESTADO: \n");
		String estado = s.nextLine();
		
		System.out.print("BAIRRO: \n");
		String bairro = s.nextLine();
		
		System.out.println("RUA");
		String rua = s.nextLine();

		Telefone telefone1 = new Telefone(telefone);
		Email email1 = new Email(email);
		Endereco endereco1 = new Endereco(cidade, estado, bairro, rua);
		Contato contato = new Contato(id, nome, profissao, telefone1, email1, endereco1);
		
		contatoController.inserir(contato);
	}
	
	public static void idRemover() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("--REMOVER CONTATO-- \n");
		System.out.println("ID: \n");
		String id = s.nextLine();
		
		ContatoController.remover(id);
	}
	
}
