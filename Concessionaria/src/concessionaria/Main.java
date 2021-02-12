package concessionaria;

public class Main {

	public static void main(String[] args) {
	    
		//Cidades
		Cidade cuiaba  = new Cidade();
		cuiaba.cod = 1;
		cuiaba.nome = "Cuiaba";
		cuiaba.mostrar();
		
		
		Cidade goiania = new Cidade();
		goiania.cod = 2;
		goiania.nome = "Goiania";
		goiania.mostrar();
		
		Cidade brasilia= new Cidade();
		brasilia.cod = 3;
		brasilia.nome = "Brasilia";
		brasilia.mostrar();
		
		//Concessionarias
		Concessionaria smartCuiaba   = new Concessionaria();
		
		smartCuiaba.codigo = 1;
		smartCuiaba.nome = "Smart Cuiaba";
		smartCuiaba.cidade.cod = cuiaba.cod;
		smartCuiaba.cidade.nome =cuiaba.nome;
		
		Concessionaria smartGoiania  = new Concessionaria();
		smartGoiania.codigo = 2;
		smartGoiania.nome = "Smart Goiania";
		smartGoiania.cidade.cod = goiania.cod;
		smartGoiania.cidade.nome = goiania.nome;
		
		Concessionaria smartBrasilia = new Concessionaria();
		smartBrasilia.codigo = 3;
		smartBrasilia.nome = "Smart Brasilia";
		smartBrasilia.cidade.cod = brasilia.cod;
		smartBrasilia.cidade.nome = brasilia.nome;
		
		smartCuiaba.mostrar();
		smartGoiania.mostrar();
		smartBrasilia.mostrar();
		
		//Comprar Carro
	    smartGoiania.comprarCarro();
		smartGoiania.comprarCarro();
		smartGoiania.comprarCarro();
		smartGoiania.mostrar();
		
		smartCuiaba.comprarCarro();
		smartCuiaba.mostrar();
		
		smartBrasilia.mostrar();
		
   }

}
