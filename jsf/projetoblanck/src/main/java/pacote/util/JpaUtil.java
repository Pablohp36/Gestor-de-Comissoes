package pacote.util;

import javax.faces.bean.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
@ApplicationScoped
public class JpaUtil {

	private static EntityManagerFactory factory = null;

	

	public static EntityManager getEntityManager() {
		if (factory == null) {
			System.err.println("Factory is null");
			factory = Persistence.createEntityManagerFactory("comissao");
		}
		
		return factory.createEntityManager();

	}

	public static void close() {
		factory.close();
	}

}
