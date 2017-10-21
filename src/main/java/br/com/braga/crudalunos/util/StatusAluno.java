package br.com.braga.crudalunos.util;

public enum StatusAluno {

	MATRICULADO(1, "Matrículado"), TRANCADO(2, "Trancado"), JUBILADO(3, "Jubilado");
	
	private int codigo;
	
	private String status;
	
	StatusAluno(int codigo, String status) {
		this.codigo = codigo;
		this.status = status;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getStatus() {
		return status;
	}
}
