package repositorios;

import java.io.BufferedWriter;
import java.io.FileWriter;

import entidades.Cliente;

public class ClienteRepositorio {
	
	public void exportarParaTxt(Cliente cliente) {
		
		try {
			
			var fileWriter = new FileWriter("c:\\temp\\cliente.txt", true);
			
			var bufferedWriter = new BufferedWriter(fileWriter);
			
			bufferedWriter.write(cliente.getId() + "\n");
			bufferedWriter.write(cliente.getNome() + "\n");
			bufferedWriter.write(cliente.getEmail() + "\n");
			bufferedWriter.write(cliente.getTelefone() + "\n");
			bufferedWriter.write(cliente.getDataHoracadastro() + "\n\n");
			
			bufferedWriter.close();
			
			System.out.println("\nDADOS GRAVADOS COM SUCESSO!");
			
		}
		catch(Exception e) {
			System.out.println("\nFALHA AO GRAVAR O ARQUIVO!");
		}
				
	}

}
