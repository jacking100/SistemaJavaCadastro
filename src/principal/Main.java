package principal;

import java.util.Date;
import java.util.Scanner;
import java.util.UUID;

import entidades.Cliente;
import repositorios.ClienteRepositorio;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nSistema de Cadastro de Clientes\n");
		
		var scanner = new Scanner(System.in);
        
		var cliente = new Cliente();
		
		cliente.setId(UUID.randomUUID());
		
		System.out.print("Informe o nome do Cliente.....:");
		cliente.setNome(scanner.nextLine());
		
		System.out.print("Informe o e-mail do Cliente.....:");
		cliente.setEmail(scanner.nextLine());
		
		System.out.print("Informe o telefone do cliente...:");
		cliente.setTelefone(scanner.nextLine());
		
		cliente.setDataHoracadastro(new Date());
		
		System.out.println("\nDados do Cliente: ");
		
		System.out.println("Id..........:" + cliente.getId());
		System.out.println("Nome..........:" + cliente.getNome());
		System.out.println("Email..........:" + cliente.getEmail());
		System.out.println("Telefone..........:" + cliente.getTelefone());
		System.out.println("Cadasdtro em..........:" + cliente.getDataHoracadastro());
		
		var clienteRepositorio = new ClienteRepositorio();
		
		clienteRepositorio.exportarParaTxt(cliente);
		
		scanner.close();
	}
	
	

}
