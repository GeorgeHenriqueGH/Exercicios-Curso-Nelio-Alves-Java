package carro;

public class TipoCarro  { //Classe responsavel por guardar as variaveis e atributos dos carros

	private String nomeCarro;
	private String tipoDeCarro;
	private String anoFabricacao;
	private String modeloDoCarro;
	private String corCarro;
	
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getModeloDoCarro() {
		return modeloDoCarro;
	}
	public void setModeloDoCarro(String modeloDoCarro) {
		this.modeloDoCarro = modeloDoCarro;
	}
	public String getTipoDeCarro() {
		return tipoDeCarro;
	}
	public void setTipoDeCarro(String tipoDeCarro) {
		this.tipoDeCarro = tipoDeCarro;
	}
	public String getNomeCarro() {
		return nomeCarro;
	}
	public void setNomeCarro(String nomeCarro) {
		this.nomeCarro = nomeCarro;
	}
	public String getCorCarro() {
		return corCarro;
	}
	public void setCorCarro(String corCarro) {
		this.corCarro = corCarro;
	}
	
}