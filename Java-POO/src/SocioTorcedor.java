public class SocioTorcedor {
    private String nome;
    private String cpf;
    private int senha;

    public SocioTorcedor(){}

    public SocioTorcedor(String nome, String cpf, int senha){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
    }
    public void exibir(){
        System.out.println("Nome : "+nome);
        System.out.println("CPF : "+cpf);
        System.out.println("Senha : "+senha);
    } 
    public String getNome(){
        return nome;
    }
    public String getCpf(){
        return cpf;
    }
    public int getSenha(){
        return senha;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setSenha(int senha){
        this.senha = senha;
    }
    public void Cadastrando(String cpf){
        System.out.println("Cadastrando socio torcedor do cpf : "+cpf);
    }
    
}
