package br.edu.devmedia.teste;

import java.util.ArrayList;
import java.util.Date;

import br.edu.devmedia.dao.PessoaDAO;
import br.edu.devmedia.dto.PessoaDTO;
import br.edu.devmedia.util.MensagensUtil;

public class Teste {
	
	public static void main(String[] args) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		PessoaDTO pessoaDTO = new PessoaDTO();
		try {
//			pessoaDTO.setIdPessoa(200);
//			pessoaDTO.setNome("Claudia");
//			pessoaDTO.setDataNascimento(new Date("1985/01/12"));
//			pessoaDTO.setSexo('f');
//			pessoaDTO.setCpf(12345678925L);
//			
//			pessoaDAO.inserir(pessoaDTO);
//			pessoaDAO.atualizar(pessoaDTO);
			
			//pessoaDAO.excluir(13);
//			pessoaDAO.listarTodos().forEach((pessoa)-> System.out.println(pessoa));
			//System.out.println("202cb962ac59075b964b07152d234b70".length());
			//System.out.println("Maicon Canedo Rocha Paradela".length());
			int i = 1234567890;
			System.out.println("23810310".length());
			//System.out.println((99999999999L / Math.pow(10, 11)));
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	
}
