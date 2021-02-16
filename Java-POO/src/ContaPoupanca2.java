
public class ContaPoupanca2 extends Cliente2{
	private String agencia;
	private String conta;
	
	public ContaPoupanca2(String cpf, String nome,String rg, int idade, String agencia) {
		super(cpf, nome, rg, idade);
		this.agencia = agencia;
	}
	public ContaPoupanca2(String cpf, String nome,String rg, int idade, String agencia, String conta) {
		super(cpf, nome, rg, idade);
		this.conta = conta;
	}
	public void exibir() {
		System.out.println("Agencia : "+agencia);
		System.out.println("Conta : "+conta);
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getConta() {
		return conta;
	}
	public void setConta(String conta) {
		this.conta = conta;
	}
	

}
