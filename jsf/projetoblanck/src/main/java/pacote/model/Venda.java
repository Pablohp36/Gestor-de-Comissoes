package pacote.model;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Venda {
	
	 private Integer codigo;
	 private String cliente;
	 private String representante;
	 private Date dataDaVenda;
	 private BigInteger valor;
	 private List<Fatura> faturas;
	 
	 @Id
	 @GeneratedValue
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getRepresentante() {
		return representante;
	}
	public void setRepresentante(String representante) {
		this.representante = representante;
	}
	public Date getDataDaVenda() {
		return dataDaVenda;
	}
	public void setDataDaVenda(Date dataDaVenda) {
		this.dataDaVenda = dataDaVenda;
	}
	public BigInteger getValor() {
		return valor;
	}
	public void setValor(BigInteger valor) {
		this.valor = valor;
	}
	
	@OneToMany(mappedBy="venda", cascade= CascadeType.MERGE)
	public List<Fatura> getFaturas() {
		return faturas;
	}	
	public void setFaturas(List<Fatura> faturas) {
		this.faturas = faturas;
	}
	

}
