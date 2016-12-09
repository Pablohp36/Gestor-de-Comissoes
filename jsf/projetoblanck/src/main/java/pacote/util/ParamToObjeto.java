package pacote.util;





public class ParamToObjeto {
	
	/*
	 * Param é o parametro da Url
	 * Classe é o nome da classe que será retornada.
	 * 
	 * */

	public static Object getObject(String param, String classe) {/*

		String s = Parametro.getParamentro(param);
		Object obj = null;

		if (s == null) {
			System.err.println("Deu B.O");
			return new Object();
		} else {
			Integer codigo = Integer.valueOf(s);
			System.out.println("Param: "+param+" Class: "+classe+"Value: "+s);
			switch (classe) {
			case "Animal":
				AnimalService service = new AnimalService();

				obj = service.porCodigo(codigo);
				break;
			case "CicloReprodutivo":
				CicloReprodutivoService servicec = new CicloReprodutivoService();
				obj = servicec.porCodigo(codigo);
				break;
			case "Produtor":
				obj = ProdutorService.find(codigo);
				break;
			case "Venda":
				obj = VendaService.find(codigo);
				break;
			default:

				break;
			}

		}
		return obj;*/
		return null;
	}
}
