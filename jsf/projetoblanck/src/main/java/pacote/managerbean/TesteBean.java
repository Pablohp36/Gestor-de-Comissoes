package pacote.managerbean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;






@ManagedBean(name = "testeBean")
@RequestScoped
public class TesteBean implements Serializable {

	private String ok;

	public String getOk(){
		return this.ok;
	}

	public void setOk(String ok){
		this.ok = ok;
	}


	@PostConstruct
	public void init(){
			this.ok = "Funcionando Perfeitamente";
	}



}
