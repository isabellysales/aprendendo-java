
public class Projeto {
	public static void main(String[] args) {
		Cachorro mila = new Cachorro();
		mila.raca = "vira-lata";
		mila.idade = 3;
		mila.peso = 10.5;
		mila.nome = "mila";
		
		System.out.println(mila.raca);
		System.out.println(mila.idade);
		System.out.println(mila.peso);
		
		Cachorro lupy = new Cachorro();
		lupy.idade = 4;
		lupy.peso = 3.6;
		lupy.raca = "pincher";
		lupy.nome = "lupy";
		
		System.out.println(lupy.idade);
		System.out.println(lupy.peso);
		System.out.println(lupy.raca);
		
		Dono isa = new Dono();
		isa.nome = "isabelly";
		isa.cpf = "123456-78";
		isa.idade = 20;
		isa.cao = mila;
		
		System.out.println(isa.cao.nome + " é doguinha da " + isa.nome);
		
		Dono alan = new Dono();
		alan.nome = "alan";
		alan.cpf = "123456-98";
		alan.idade = 23;
		alan.cao = lupy;
		
		
		System.out.println(alan.cao.nome + " é doguinho da " + alan.nome);
		
				
		
	} 
}
