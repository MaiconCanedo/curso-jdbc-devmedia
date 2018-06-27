package br.edu.devmedia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.edu.devmedia.dto.LoginDTO;
import br.edu.devmedia.exception.PersistenciaException;
import br.edu.devmedia.jdbc.ConexaoUtil;

public class LoginDAO implements GenericoDAO<LoginDTO> {
	
	private static final String SQL_ALTHENTICATE = "SELECT * FROM usuario WHERE nome=? AND senha=MD5(?)";
	
	private PreparedStatement alimentarStatement(LoginDTO loginDTO, Connection connection, String sql) throws SQLException {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setInt(1, loginDTO.getIdLogin());
		preparedStatement.setString(2, loginDTO.getNome());
		preparedStatement.setString(3, loginDTO.getSenha());
		return preparedStatement;
	}
	
	private LoginDTO alimentarLogin(ResultSet resultSet) throws SQLException {
		return new LoginDTO(resultSet.getInt("id_login"), resultSet.getString("nome"), resultSet.getString("senha"));
	}
	
	public Boolean logar(String login, String senha) throws PersistenciaException{
		Boolean resultado = false;
		try {
			Connection connection = ConexaoUtil.getInstance().getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(SQL_ALTHENTICATE);
			preparedStatement.setString(1, login);
			preparedStatement.setString(2, senha);
			
			resultado = preparedStatement.executeQuery().next();
			connection.close();
		} catch (Exception e) {
			throw new PersistenciaException("logar " ,e);
		}
		return resultado;
	}
	
	public boolean logar(LoginDTO loginDTO) throws PersistenciaException {
		return logar(loginDTO.getNome(), loginDTO.getSenha());
	}

	
	@Override
	public void atualizar(LoginDTO objeto) throws PersistenciaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluir(Integer id) throws PersistenciaException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<LoginDTO> listarTodos() throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginDTO getById(Integer id) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer inserir(LoginDTO objeto) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LoginDTO getById(Long id) throws PersistenciaException {
		// TODO Auto-generated method stub
		return null;
	}
}
