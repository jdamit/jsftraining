package jsftraining;

public class DropDownDto {
	
	private String codigo;
	private String valor;
	
	public DropDownDto() {
		super();
	}

	public DropDownDto(String codigo, String valor) {
		super();
		this.codigo = codigo;
		this.valor = valor;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getValor() {
		return codigo +" - "+ valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	

}
