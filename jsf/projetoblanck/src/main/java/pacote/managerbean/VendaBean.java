package pacote.managerbean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import pacote.model.Fatura;
import pacote.model.Venda;
import pacote.repository.FaturaRepository;
import pacote.repository.VendaRepository;
import pacote.util.DateUtil;

@ManagedBean(name="vendaBean")
@ViewScoped
public class VendaBean implements Serializable {
	
	
	 private Venda venda = new Venda();
	 private List<Venda> vendas;
	 private Fatura fatura;
	 private List<Fatura> faturas;	
	 
	 private Boolean vendaRender = false;
	 private Boolean vendasRender = false;
	 private Boolean faturamentoRender = false;
	 private Boolean relatorioRender = false;
	 
	 @PostConstruct
	 public void init(){
		 popularLista();
		 selectVendaRender();
	 }
 
	
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public List<Venda> getVendas() {
		return vendas;
	}
		

	public Boolean getVendaRender() {
		return vendaRender;
	}


	public void selectVendaRender() {
		 esconderPaineis();
		this.vendaRender = true;
		this.venda = new Venda();
		
	}


	public Boolean getVendasRender() {
		return vendasRender;
	}


	public void selectVendasRender() {
		esconderPaineis();
		this.vendasRender = true;
		this.faturamentoRender = true;
	}


	public Boolean getRelatorioRender() {
		return relatorioRender;
	}


	public void selectRelatorioRender() {
		esconderPaineis();
		this.relatorioRender = true;
	}
	

	public Boolean getFaturamentoRender() {
		return faturamentoRender;
	}


	public void selectFaturamentoRender() {
		esconderPaineis();
		this.faturamentoRender = true;
	}


	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}
	
	private void esconderPaineis(){
		
		 vendaRender = false;
		 vendasRender = false;
		 faturamentoRender = false;
		  relatorioRender = false;
	}


	public void salvar(){
		salvarFatura();
		VendaRepository.salvar(this.venda);
		this.venda = new Venda();
		popularLista();
	}
	public void salvarFatura(){
		BigInteger dividendo = new BigInteger("3");
		BigInteger valorfatura = this.venda.getValor().divide(dividendo);
		faturas = new ArrayList<>();
		Date datafatura = adicionarDias(this.venda.getDataDaVenda(),45); 
		this.venda.setFaturas(faturas);
	
		for (int i = 0; i < 3; i++) {
			
			Fatura fatura = new Fatura();
			fatura.setVenda(this.venda);
			fatura.setDataDeVencimento(datafatura);
			fatura.setValor(valorfatura);
			faturas.add(fatura);
			
			datafatura = adicionarDias(datafatura,15);
			System.out.print("Data de vencimento"+ datafatura.toString());
		
		}
		
	}
	
	public void baixarFatura(Integer codigo){
		System.out.println(codigo);
		
		this.fatura = FaturaRepository.find(codigo);
		this.fatura.setDataDoPagamento(new Date());
		//this.fatura.setPagamentoEfetuado(1);
		FaturaRepository.salvar(this.fatura);
		
	}
	
	public Date adicionarDias(Date data, Integer dias){
		
		return DateUtil.adicionarDiasDate(data, dias);
		
	}
	
	public void selecionarVenda(Integer codigo){
		this.venda =  VendaRepository.find(codigo);
	}
	
	public void popularLista(){
		 try{
			 vendas = VendaRepository.listaDeVendaes();
		 }catch (Exception e) {
			 vendas = new ArrayList<>();
		}
	}
	 

}
