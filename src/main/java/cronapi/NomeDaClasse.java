package cronapi;

import cronapi.CronapiMetaData;
import cronapi.ParamMetaData;


/**
 * Descrição da Função ...
 *
 * @author Usuário de Teste
 * @version 1.0
 * @since 2021-03-02
 *
 */

@CronapiMetaData(categoryName = "Minhas Funções")
public class NomeDaClasse {

	@CronapiMetaData(type = "function", name = "Nova Função", description = "Descrição da Função")
	public static String NovaFuncao(@ParamMetaData(description = "Parâmetro: Descrição do parâmetro") String input) throws Exception {
		return "Input " + input;
	}

}