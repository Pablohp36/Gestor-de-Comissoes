package pacote.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class ProdutorRepository {
	/*
	public static Produtor salvar(Produtor produtor) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		Produtor produtorret;
		tx.begin();
		try {
			 produtorret = manager.merge(produtor);
			
			tx.commit();
			FacesUtil.addInfoMessage("Produtor salvo com Sucesso !!!");
			return produtorret;
		} catch (Exception e) {
			FacesUtil.addErrorMessage(e.getMessage());
			return new Produtor();
		}finally {
			manager.close();
		}
	}

	public static List<Produtor> buscaDeCompradorPorNome(String query) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			String sql = "From Produtor p where p.nome like :produtor or p.propriedade like :produtor";
			List<Produtor> produtores = manager.createQuery(sql).setParameter("produtor","%"+query+"%").getResultList();
			tx.commit();
			return produtores;
		} catch (Exception e) {
			FacesUtil.addErrorMessage(e.getMessage());
			return null;
		}finally {
			manager.close();
		}
	}

	public static List<Produtor> listaDeProdutores() {
		
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		try {
			String sql = "Select p From Produtor p " ;
			List<Produtor> produtores = manager.createQuery(sql).getResultList();
			tx.commit();
			return produtores;
		} catch (Exception e) {
			FacesUtil.addErrorMessage(e.getMessage());
			return null;
		}finally {
			manager.close();
		}
		
	}

	public static Produtor find(Integer codigo) {
		EntityManager manager = JpaUtil.getEntityManager();
		EntityTransaction tx = manager.getTransaction();
		Produtor produtor;
		tx.begin();
		try {
			produtor = manager.find(Produtor.class,codigo);
			tx.commit();
			return produtor;			
		} catch (Exception e) {
			return new Produtor();
		}
		
	}
*/

}
