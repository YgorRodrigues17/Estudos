public class TesteSocioTorcedor {
    public static void main(String[] args){
        SocioTorcedor st1 = new SocioTorcedor("Gilberto","74803256",123456);
        SocioTorcedor st2 = new SocioTorcedor("Ygor","00446900370",27072001);
        SocioTorcedor st3 = new SocioTorcedor("Jose Antonio","16196171372",19031961);

        st2.Cadastrando("00446900370");
        st2.exibir();

        st3.Cadastrando("16196171372");
        st3.exibir();

        st1.Cadastrando("74803256");
        st1.exibir();
    }
    
}
