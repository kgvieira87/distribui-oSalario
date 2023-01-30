package controle;

import java.util.Scanner;

public class control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc = new Scanner ( System.in);

dados dados1 = new dados();
double[] dados3 = new double[2];

for(int x = 0; x< dados3.length; x++) {
	
System.out.println("Informe seu salário:");
dados1.salario = sc.nextDouble();
dados3[x]= dados1.salario;

System.out.println("Você tem disponível para Custo Fixo o valor de: R$ " + dados1.fixo() );
System.out.println("Você tem disponível para Custo Variável o valor de: R$ " + dados1.var() );
System.out.println("Você tem disponível para fazer investimento o valor de: R$ " + dados1.Inv() );
System.out.println("Você tem disponível para gasto livre o valor de: R$ " + dados1.livre1() );

System.out.println("-----------------------------------------------------------------------------");
		
	}

}
}