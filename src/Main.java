import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		Cliente cliente = new Cliente();
		
		//COLOCAR NOME CLIENTE
		System.out.print("Digite o nome do titular: ");
		cliente.setNome();
		
		//CRIAR CONTAS
		Conta cc = new ContaCorrente(cliente);
		Conta poupanca = new ContaPoupanca(cliente);
		
		//PERGUNTAR QUANTO QUER COLOCAR EM CADA CONTA
		float valorInicialC;
		float valorInicialP;
		System.out.print ("Digite o valor inicial da conta Corrente: ");
		valorInicialC = scan.nextInt();
		cc.depositar(valorInicialC);
		
		System.out.print ("Digite o valor inicial da conta Poupança: ");
		valorInicialP = scan.nextInt();
		poupanca.depositar(valorInicialP);
		
		//MENU
		int menu = 10;
		System.out.println ("Menu: ");
		
		do {
			System.out.println ("Para fazer um depósito digite 1");
			System.out.println ("Para fazer uma transferência digite 2");
			System.out.println ("Para fazer uma saque digite 3");
			System.out.println ("Para fazer ver o extrato digite 4");
			System.out.println ("Para sair digite 0");
			
            double valor;
            String aux;
			menu = scan.nextInt();
			
			//opção1
			if (menu == 1) {
				
				System.out.println ("Deseja fazer um deposito na conta: \nA - Corrente\nB - Poupança");
				String deposito = scan.next();
				
					if (deposito.equalsIgnoreCase ("A")) {
						System.out.print ("Digite o valor do depósito: ");
						valor = scan.nextFloat();
						cc.depositar(valor);
						System.out.println ("Depósito realizado com sucesso!");
					}else if (deposito.equalsIgnoreCase ("B")) {
						System.out.print ("Digite o valor do depósito: ");
						valor = scan.nextFloat();
						poupanca.depositar(valor);
						System.out.println ("Depósito realizado com sucesso!");
					}
			    
					System.out.println ("Deseja voltar ao menu? -sim -nao: ");
					aux = scan.next();
					if (aux.equalsIgnoreCase("Nao")) {
						menu = 0;
					}else if (aux.equalsIgnoreCase("Sim")) {}
					
			//opção2
		    }else if (menu == 2) {
				
				System.out.print ("Informe o valor que deseja transferir: ");
				valor = scan.nextFloat();
				
				System.out.println ("Transferir da Conta Corrente para Conta Poupança: opção 'A'\nTransferir da Conta Poupança para Conta Corrente: opção 'B'");
				String transferencia = scan.next();
				
					if (transferencia.equalsIgnoreCase ("A")) {
						cc.transferir (valor, poupanca);
						System.out.println ("Transferência realizada com sucesso!");
					}else if (transferencia.equalsIgnoreCase ("B")) {
						poupanca.transferir (valor, cc);
						System.out.println ("Transferência realizada com sucesso!");
					}
				
					System.out.println ("Deseja voltar ao menu? -sim -nao: ");
					aux = scan.next();
					if (aux.equalsIgnoreCase("Nao")) {
						menu = 0;
					}else if (aux.equalsIgnoreCase("Sim")) {}
					
			//opção3	
		    }else if (menu == 3) {
		    	
		    	System.out.print ("Informe o valor que deseja sacar: ");
		    	valor = scan.nextFloat();
		    	
		    	System.out.println ("Sacar da Conta Corrente: opção 'A'\nSacar da Conta Poupança: opção 'B'");
		    	String saque = scan.next();
		    	
		    	if (saque.equalsIgnoreCase ("A")) {
		    		cc.sacar (valor);
					System.out.println ("Saque realizado com sucesso!");
				}else if (saque.equalsIgnoreCase ("B")) {
					poupanca.sacar (valor);
					System.out.println ("Saque realizado com sucesso!");
				}
			
				System.out.println ("Deseja voltar ao menu? -sim -nao: ");
				aux = scan.next();
				if (aux.equalsIgnoreCase("Nao")) {
					menu = 0;
				}else if (aux.equalsIgnoreCase("Sim")) {}
		    	
		    //opção4
		    }else if (menu == 4) {
            	cc.imprimirExtrato();
        		poupanca.imprimirExtrato();
        		
        		System.out.println ("Deseja voltar ao menu? -sim -nao: ");
        		aux = scan.next();
        		if (aux.equalsIgnoreCase("Nao")) {
    				menu = 0;
    			}else if (aux.equalsIgnoreCase("Sim")) {}
        		
            }else if (menu == 0)
				break;

		}while (menu != 0);
	
		System.out.println ("Você saiu!");
	}
	}
