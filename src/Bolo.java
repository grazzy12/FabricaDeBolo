public class Bolo {
    String sabor;
    int tamanho;


    public Bolo(String sabor, int tamanho){
        this.sabor = sabor;
        this.tamanho = tamanho;
    }


    public void  exibirDetalhes(){
        System.out.println("Bolo de "+sabor+", tamanho "+tamanho+" cm.");
    }
}
