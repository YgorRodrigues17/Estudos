
public class Carro {
    private String placa;
    private String renavam;

    public Carro() {
    }

    public Carro(String placa, String renavam) {
        this.placa = placa;
        this.renavam = renavam;
    }
    public void exibir(){
        System.out.println("Placa do carro : "+placa);
        System.out.println("Renavam do carro : "+renavam);
    }
    public void acenderFarois(String placa){
        System.out.println("Acendendo farois do carro de placa : "+placa);
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }
    public void setRenavam(String renavam){
        this.renavam = renavam;
    }
    public String getPlaca(){
        return placa;
    }
    public String getRenavam(){
        return renavam;
    }


}
