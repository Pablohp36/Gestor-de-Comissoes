package pacote.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import pacote.model.Cliente;
import pacote.util.FacesUtil;
import pacote.util.JpaUtil;

public class ClienteRepository {
	
	public static Cliente salvar(Cliente produtor) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		Cliente produtorret;
		tx.begin();
		try {
			 produtorret = manager.merge(produtor);
			
			tx.commit();
			FacesUtil.addInfoMessage("Cliente salvo com Sucesso !!!");
			return produtorret;
		} catch (Exception e) {
			FacesUtil.addErrorMessage(e.getMessage());
			return new Cliente();
		}finally {
			manager.close();
		}
	}
	
public static List<Cliente> listaDeClientees() {
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			String sql = "Select p From Cliente p " ;
			List<Cliente> produtores = manager.createQuery(sql).getResultList();
			tx.commit();
			return produtores;
		} catch (Exception e) {
			FacesUtil.addErrorMessage(e.getMessage());
			return null;
		}finally {
			manager.close();
		}
		
	}

}
