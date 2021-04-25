
public final class PessoaFisica extends Cliente{

	private String cpf;
	
	public PessoaFisica(String nome, String cpf) {
		super(nome);
		this.cpf = cpf;
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
