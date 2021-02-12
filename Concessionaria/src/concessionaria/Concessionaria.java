package concessionaria;

public class Concessionaria {

	int codigo;
    String nome;
    Cidade cidade = new Cidade();
    Carro carro = new Carro();
    
    void mostrar() {
        
    	System.out.println("codigo da concessionaria: "+this.codigo);
        System.out.println("nome da concessionaria: "+this.nome);
        System.out.println("Codigo da cidade de localizacao: "+this.cidade.cod);
        System.out.println("Localizada em: "+this.cidade.nome);
        System.out.println("Carro em estoque: "+this.carro.estoque);
    }
    
    void comprarCarro() {
    	carro.estoque--;
    }
    
}
