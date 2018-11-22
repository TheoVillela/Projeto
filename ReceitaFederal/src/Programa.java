import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		 
			 Scanner s = new Scanner(System.in);
		     int opcao, qtdf = 0, qtdj = 0, MAX_ELEMENTOS = 10;
		     Fisica[] vf = new Fisica[MAX_ELEMENTOS];
		     Juridica[] vj = new Juridica[MAX_ELEMENTOS];
		     
		     do {
		         System.out.println("MENU");
		         System.out.println("====");
		         System.out.println("\nDigite:");
		         System.out.println("1 - fisica");
		         System.out.println("2 - juridica");
		         System.out.println("0 - Sair");
		         System.out.print("Opção: ");
		         opcao = s.nextInt();
		            
		         s.nextLine();//Limpando a entrada
		            
		            switch(opcao) {
		                case 1:
		                	 vf[qtdf] = new Fisica();
		                	 System.out.println("entre com nome: ");
		                	 vf[qtdf].nome = s.nextLine();
		                	 System.out.println("entre com valor: ");
		                	 vf[qtdf].valor = s.nextFloat();
		                	 System.out.println("entre com CPF: ");
		                	 vf[qtdf].cpf = s.nextLine();
		                	 qtdf++;
		                	 break;
		                    
		                case 2:
		                	vj[qtdj] = new Juridica();
		                	System.out.println("entre com nome: ");
		                	vj[qtdj].nome = s.nextLine();
		                	System.out.println("entre com valor: ");
		                	vj[qtdj].valor = s.nextFloat();
		                	System.out.println("entre com CNPJ: ");
		                	vj[qtdj].cnpj = s.nextLine();
		                	qtdj++;
		                    break;
		                    
		                case 3:
		                	for(int i =0; i < qtdf; i++) {
		                		System.out.println("nome: "+ vf[i].nome);
		                		System.out.println("CPF: "+ vf[i].cpf);
		                		System.out.println();
		                	}
		                	break;

		                case 4:
		                	for(int i =0; i < qtdj; i++) {
		                		System.out.println("nome: "+ vj[i].nome);
		                		System.out.println("CNPJ: "+ vj[i].cnpj);
		                	}
		                	break;
		                case 0:
		                    System.out.println("\nFim do programa.");
		                    break;
		                
		                default:
		                    System.out.println("\nOpção inválida!\n");
		            }
		        } while(opcao != 0);
		        
		        s.close();

	}

}
