package pacote.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import pacote.model.Fatura;
import pacote.util.FacesUtil;
import pacote.util.JpaUtil;

public class FaturaRepository {

	public static Fatura find(Integer codigo) {
		EntityManager em = JpaUtil.getEntityManager();
		Fatura fatura = null;
		try{
			fatura =	em.find(Fatura.class, codigo);
		return fatura;
		}catch (Exception e) {
			System.err.println(e.getMessage());
			return null;
		}finally {
			em = null;
			fatura = null;
		}
		
	}

	public static void salvar(Fatura fatura) {
		EntityManager em = JpaUtil.getEntityManager();
		EntityTransaction tx = em.getTransaction();
		Fatura faturac = null;
		tx.begin();
		try{
			tx.commit();
			faturac = em.merge(fatura);
			FacesUtil.addInfoMessage("Fatura baixada com sucesso !!!");
		}catch (Exception e) {
			FacesUtil.addErrorMessage("Erro : "+e.getMessage());
			e.getStackTrace();
		}finally {
			em.close();
		}
	}

}
