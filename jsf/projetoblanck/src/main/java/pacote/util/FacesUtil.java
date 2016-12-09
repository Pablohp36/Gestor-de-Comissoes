package pacote.util;

import javax.faces.context.FacesContext;
import javax.faces.application.FacesMessage;

public class FacesUtil {
	
	public static boolean isPostback() {
		return FacesContext.getCurrentInstance().isPostback();
	}
	
	public static boolean isNotPostback() {
		return !isPostback();
	}
	
	public static void addErrorMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_ERROR, message, message));
	}
	
	public static void addInfoMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_INFO, message, message));
	}
	public static void addAvisoMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.SEVERITY_WARN, message, message));
	}
	public static void addfacesMessage(String message) {
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage(FacesMessage.FACES_MESSAGES, message));
	}
	

}
