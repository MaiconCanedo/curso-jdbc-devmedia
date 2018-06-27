package br.edu.devmedia.bo;

import br.edu.devmedia.dao.LoginDAO;
import br.edu.devmedia.dto.LoginDTO;
import br.edu.devmedia.exception.NegocioException;

/**
 *
 * @author Maicon
 */
public class LoginBO {

    public boolean logar(String login, String senha) throws NegocioException {
        boolean resultado = false;
    	try {
            if (login == null || "".equals(login.trim())) {
                throw new NegocioException("Login Obrigatório!");
            } else if (senha == null || "".equals(senha.trim())) {
            	throw new NegocioException("Senha Obrigatória!");
            } else {
            	resultado = (new LoginDAO().logar(login, senha));
            }
        } catch (Exception e) {
        	throw new NegocioException(e.getMessage(), e);
        }
        return resultado;
    }
    
    public boolean logar(LoginDTO loginDTO) throws NegocioException {
    	return logar(loginDTO.getNome(), loginDTO.getSenha());
    }
}
