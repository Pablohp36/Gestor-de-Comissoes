package pacote.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import pacote.model.Venda;
import pacote.model.Venda;
import pacote.util.FacesUtil;
import pacote.util.JpaUtil;

public class VendaRepository {
	
	
	public static Venda salvar(Venda venda) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		Venda produtorret;
		tx.begin();
		try {
			 produtorret = manager.merge(venda);
			
			tx.commit();
			FacesUtil.addInfoMessage("Venda salvo com Sucesso !!!");
			return produtorret;
		} catch (Exception e) {
			FacesUtil.addErrorMessage(e.getMessage());
			return new Venda();
		}finally {
			manager.close();
		}
	}
	
public static List<Venda> listaDeVendaes() {
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			String sql = "Select v From Venda v " ;
			List<Venda> produtores = manager.createQuery(sql).getResultList();
			tx.commit();
			return produtores;
		} catch (Exception e) {
			FacesUtil.addErrorMessage(e.getMessage());
			return null;
		}finally {
			manager.close();
		}
		
	}

public static Venda find(Integer codigo) {
	EntityManager manager = JpaUtil.getEntityManager();
	EntityTransaction tx = manager.getTransaction();
	tx.begin();
	Venda vend = null;
	try {
		vend = manager.find(Venda.class, codigo);
	}
	catch (Exception e) {
		vend = new Venda();
	}
	finally {
		manager.close();
		return vend;
	}
	
}

}
