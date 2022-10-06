import java.util.Scanner;
public class banco {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double saldoCC=0,saldoCP=0,valOP;
		int menu1,menu2,menu3;
		String nome,numCC,numCP;

		System.out.println("Entre com o nome do cliente: ");
		nome=in.nextLine();
		System.out.println("\nEntre com o número da Conta Corrente: ");
		numCC=in.nextLine();
		System.out.println("\nEntre com o saldo inicial da Conta Corrente "+numCC+" : ");
		saldoCC=in.nextDouble();
		in = new Scanner(System.in);
		System.out.println("\nEntre com o número da Conta Poupança: ");
		numCP=in.nextLine();
		System.out.println("\nEntre com o saldo inicial da Conta Poupança "+numCP+" : ");
		saldoCP=in.nextDouble();

		do {
			System.out.println("\nQual operação deseja realizar?\n1- Creditar\n2- Debitar\n3- Transferir\n4- Saldo\n5- Sair");
			menu1=in.nextInt();
        	if (menu1<1 || menu1>5){
				System.out.println("\nOpção inválida.");
				System.out.print("--------------\n");
        	}
        // Opção 1 (Creditar)
			else if (menu1==1){
				System.out.println("\nQual conta?\n1- Corrente\n2- Poupança");
				menu2=in.nextInt();
					if (menu2==1){
						System.out.println("\nQual valor a creditar na conta corrente "+numCC+" ?");
						valOP=in.nextDouble();
						saldoCC=valOP+saldoCC;
						System.out.print("\nSaldo atual na Conta Corrente "+numCC+" : ");
						System.out.printf("%.2f",saldoCC);
						System.out.print("\n--------------\n");
					}
					else if (menu2==2){
						System.out.println("\nQual valor a creditar na conta Poupança "+numCP+" ?");
						valOP=in.nextDouble();
						saldoCP=valOP+saldoCP;
						System.out.print("\nSaldo atual na Conta Poupança "+numCP+" : ");
						System.out.printf("%.2f",saldoCP);
						System.out.print("\n--------------\n");
					}
					else {
						System.out.println("\nOpção inválida.");
						System.out.print("--------------\n");
					}
			}
		// Opção 2 (Debitar)
			else if (menu1==2){
				System.out.println("\nQual conta?\n1- Corrente\n2- Poupança");
				menu2=in.nextInt();
					if (menu2==1){
						System.out.println("\nQual valor a debitar na conta corrente "+numCC+" ?");
						valOP=in.nextDouble();
						saldoCC=saldoCC-valOP;
						System.out.print("\nSaldo atual na Conta Corrente "+numCC+" : ");
						System.out.printf("%.2f",saldoCC);
						System.out.print("\n--------------\n");
					}
					else if (menu2==2){
						System.out.println("\nQual valor a debitar na conta Poupança "+numCP+" ?");
						valOP=in.nextDouble();
							if (valOP<=saldoCP){
								saldoCP=saldoCP-valOP;
								System.out.print("\nSaldo atual na Conta Poupança "+numCP+" : ");
								System.out.printf("%.2f",saldoCP);
								System.out.print("\n--------------\n");
							}
							else{
								System.out.println("\nSALDO INSUFICIENTE.");
								System.out.print("--------------\n");
							}
					}
					else {
						System.out.println("\nOpção inválida.");
						System.out.print("--------------\n");
					}
			}
		// Opção 3 (Transferir)
			else if (menu1==3){
				System.out.println("\nEntre:\n1- Conta corrente e poupança\n2- Poupança e conta corrente");
				menu3=in.nextInt();
					if (menu3==1){
						System.out.println("\nQual valor a transferir da conta corrente "+numCC+" para a conta poupança "+numCP+" ?");
						valOP=in.nextDouble();
						saldoCC=saldoCC-valOP;
						saldoCP=valOP+saldoCP;
						System.out.print("\nSaldo atual na Conta Corrente "+numCC+" : ");
						System.out.printf("%.2f",saldoCC);
						System.out.print("\nSaldo atual na Conta Poupança "+numCP+" : ");
						System.out.printf("%.2f",saldoCP);
						System.out.print("\n--------------\n");
					}
					else if (menu3==2){
						System.out.println("\nQual valor a transferir da conta poupança "+numCP+" para a conta corrente "+numCC+" ?");
						valOP=in.nextDouble();
							if (valOP<=saldoCP){
								saldoCP=saldoCP-valOP;
								saldoCC=valOP+saldoCC;
								System.out.print("\nSaldo atual na Conta Corrente "+numCC+" : ");
								System.out.printf("%.2f",saldoCC);
								System.out.print("\nSaldo atual na Conta Poupança "+numCP+" : ");
								System.out.printf("%.2f",saldoCP);
								System.out.print("\n--------------\n");
							}
							else{
								System.out.println("\nSALDO INSUFICIENTE.");
								System.out.print("\n--------------\n");
							}
					}
					else {
						System.out.println("\nOpção inválida.");
						System.out.print("\n--------------\n");
					}
			}
		// Opção 4 (Saldo)
			else if (menu1==4) {
				System.out.print("Senhor(a) "+nome+" ,\nSaldo da sua Conta Corrente "+numCC+" : ");
				System.out.printf("%.2f",saldoCC);
				System.out.print("\nSaldo da sua Conta Poupança "+numCP+" : ");
				System.out.printf("%.2f",saldoCP);
				System.out.print("\n--------------\n");
			}
			else {
			}
		}
		while(menu1!=5);
		System.out.print("\nObrigado por trabalhar com o nosso banco!!!");
	}
}