import java.util.Scanner;

public class Jatiboca{
	public static void main(String []args){
		Scanner in = new Scanner(System.in);

		int opcao, opcao2, opcao3, opcao4;
		float estoqueJ, estoqueP, quantEstoque;

		System.out.print("Entre com o estoque inicial de açúcar empresa 1 - Jatiboca: ");
		estoqueJ = in.nextFloat();
		System.out.print("Entre com o estoque inicial de açúcar empresa 2 - Pontal: ");
		estoqueP = in.nextFloat();

		do{
			System.out.println("\n--------------------------------------------------");
			System.out.println("->O que deseja fazer:");
			System.out.println("1 – Entrada de Estoque ");
			System.out.println("2 – Saída de Estoque");
			System.out.println("3 – Transferência de Estoque");
			System.out.println("4 – Consulta Estoque");
			System.out.println("5 – Finalizar");
			System.out.print("\n    Opção ->: ");
			opcao = in.nextInt();

			if(opcao==1){
				System.out.println("--------------------------------------------------");
				System.out.println("->Qual empresa:");
				System.out.println("1 – Jatiboca ");
				System.out.println("2 – Pontal ");
				System.out.print("\n    Opção ->: ");
				opcao2 = in.nextInt();

				if(opcao2==1){
					System.out.println("--------------------------------------------------");
					System.out.print("Qual a quantidade de Entrada de açúcar em Jatiboca -> ");
					quantEstoque = in.nextFloat();
					estoqueJ += quantEstoque;
					System.out.print("Estoque Atualizado em Jatiboca -> "+ estoqueJ +"Kg");
				}
				else if(opcao2==2){
					System.out.println("--------------------------------------------------");
					System.out.print("Qual a quantidade de Entrada de açúcar em Pontal -> ");
					quantEstoque = in.nextFloat();
					estoqueP += quantEstoque;
					System.out.print("Estoque Atualizado em Jatiboca -> "+ estoqueP +"Kg");
				}
				else{
					System.out.print("Opção inválida!");
				}
			}
			else if(opcao==2){
				System.out.println("--------------------------------------------------");
				System.out.println("->Qual empresa:");
				System.out.println("1 – Jatiboca ");
				System.out.println("2 – Pontal ");
				System.out.print("\n    Opção ->: ");
				opcao2 = in.nextInt();

				if(opcao2==1){
					System.out.println("--------------------------------------------------");
					System.out.print("Qual a quantidade de Saída de açúcar em Jatiboca -> ");
					quantEstoque = in.nextFloat();
					if(quantEstoque<=estoqueJ){
						estoqueJ -= quantEstoque;
						System.out.print("Estoque Atualizado em Jatiboca -> "+ estoqueJ +"Kg");
					}
					else{
						System.out.println("Excede limite no estoque!");
						System.out.print("Estoque Atualizado em Jatiboca -> "+ estoqueJ +"Kg");
					}
				}
				else if(opcao2==2){
					System.out.println("--------------------------------------------------");
					System.out.print("Qual a quantidade de Saída de açúcar em Pontal -> ");
					quantEstoque = in.nextFloat();
					if(quantEstoque<=estoqueP){
						estoqueP -= quantEstoque;
						System.out.print("Estoque Atualizado em Jatiboca -> "+ estoqueP +"Kg");
					}
					else{
						System.out.println("Excede limite no estoque!");
						System.out.print("Estoque Atualizado em Pontal -> "+ estoqueP +"Kg");
					}
				}
				else{
					System.out.print("Opção inválida!");
				}
			}
			else if(opcao==3){
				System.out.println("--------------------------------------------------");
				System.out.println("    Qual empresa:");
				System.out.println("1 – Jatiboca -> Pontal");
				System.out.println("2 – Pontal -> Jatiboca");
				System.out.print("\n    Opção ->: ");
				opcao2 = in.nextInt();

				if (opcao2==1){
					System.out.println("--------------------------------------------------");
					System.out.print("Quantidade de transferência de açúcar- Jatiboca para Pontal -> ");
					quantEstoque = in.nextFloat();
					if(quantEstoque<=estoqueJ){
						estoqueJ -= quantEstoque;
						estoqueP += quantEstoque;
						System.out.println("Transferência realizada!!!");
						System.out.println("Estoque Atualizado em Jatiboca -> "+ estoqueJ +"Kg");
						System.out.print("Estoque Atualizado em Pontal -> "+ estoqueP +"Kg");
					}
					else{
						System.out.println("Excede limite no estoque em Jatiboca para transferência para Pontal!");
						System.out.print("Estoque Atualizado em Jatiboca -> "+ estoqueJ +"Kg");
					}
				}
				else if(opcao2==2){
					System.out.println("--------------------------------------------------");
					System.out.print("Quantidade de transferência de açúcar - Pontal para Jatiboca -> ");
					quantEstoque = in.nextFloat();
					if(quantEstoque<=estoqueP){
						estoqueP -= quantEstoque;
						estoqueJ += quantEstoque;
						System.out.println("Transferência realizada!!!");
						System.out.println("Estoque Atualizado em Jatiboca -> "+ estoqueJ +"Kg");
						System.out.print("Estoque Atualizado em Pontal -> "+ estoqueP +"Kg");
					}
					else{
						System.out.println("Excede limite no estoque de em Pontal para transferência para Jatiboca!");
						System.out.print("Estoque Atualizado em Pontal -> "+ estoqueP +"Kg");
					}
				}
				else{
					System.out.print("Opção inválida!");
				}

			}
			else if(opcao==4){
				System.out.println("Estoque em Jatiboca -> "+ estoqueJ);
				System.out.print("Estoque em Pontal -> "+ estoqueP);
			}
			else{
				System.out.print("Digite um número váido!");
			}			
		}
		while(opcao!=5);
		System.out.print("Bom dia e um bom trabalho!!!");
	}
}