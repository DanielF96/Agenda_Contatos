package controller;

import java.util.ArrayList;
import java.util.List;

import models.Contato;

public class ContatoController {
	
	private static List<Contato> listContato = new ArrayList<> ();
	
	public void inserir (Contato contato) {
		this.listContato.add(contato);
		System.out.println("\nContato cadastrado com sucesso!!\n");
	}
	
	public static void listar() {
		
		System.out.println("--LISTA DE TODOS OS CONTATOS-- \n");
		
		if(listContato.size() == 0){
		System.out.println("\nLista vázia!!\n");
		}
		for(int i = 0; i < listContato.size(); i++) {
			System.out.println(listContato.get(i).toString());
		}
	}
	
	public static void remover(String id) {
		listContato.remove(id);
		System.out.println("\nContato removido com sucesso!!\n");
	}
	
	public void editar() {
		
	}


}
