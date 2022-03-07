import java.util.Scanner;

public class Cliente {
	Scanner scan = new Scanner (System.in);
	public String nome;
	
	public void setNome() {
		nome = scan.next();
	}
	
	public String getNome() {
		return nome;
	}


}
