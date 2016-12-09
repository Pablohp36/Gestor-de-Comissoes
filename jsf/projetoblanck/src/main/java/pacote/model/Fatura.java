package pacote.model;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fatura {
	
	private Integer codigo;
	private Venda venda;
	private Date dataDeVencimento;
	private BigInteger valor;
	private Integer pagamentoEfetuado;
	private Date dataDoPagamento;
	
	@Id
	@GeneratedValue
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	@ManyToOne(cascade=CascadeType.MERGE )
	public Venda getVenda() {
		return venda;
	}
	public void setVenda(Venda venda) {
		this.venda = venda;
	}
	public Date getDataDeVencimento() {
		return dataDeVencimento;
	}
	public void setDataDeVencimento(Date dataDeVencimento) {
		this.dataDeVencimento = dataDeVencimento;
	}
	public BigInteger getValor() {
		return valor;
	}
	public void setValor(BigInteger valor) {
		this.valor = valor;
	}
	public Integer getPagamentoEfetuado() {
		return pagamentoEfetuado;
	}
	public void setPagamentoEfetuado(Integer pagamentoEfetuado) {
		this.pagamentoEfetuado = pagamentoEfetuado;
	}
	public Date getDataDoPagamento() {
		return dataDoPagamento;
	}
	public void setDataDoPagamento(Date dataDoPagamento) {
		this.dataDoPagamento = dataDoPagamento;
	}
	
	
	
	

}
