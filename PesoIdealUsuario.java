import java.util.Scanner;
public class PesoIdealUsuario {

   public static void main (String[] args){
   
   //cria��o da vari�vel de escolha
   int escolha;
   double altura, peso_masc, peso_fem, resultadomasc, resultadofem;
   
   
   //instanciando a classe scanner
   Scanner opcao = new Scanner(System.in);
   Scanner digitaaltura = new Scanner(System.in);
   
   //escrevendo para o usu�rio na tela as poss�veis op��es para realiza��o do c�lculo
   System.out.println("\nOla, usuario! Por favor, escolha a melhor opcao para sua situacao:");
   System.out.println("1) Calculo de peso masculino \n2) Calculo de peso feminino\n");
   escolha = opcao.nextInt();
   
   if(escolha == 1)
   {
     System.out.println("\nCalculo do peso ideal masculino");
     System.out.println("\nInforme a altura aproximada. Ex.: 1,75: ");
     altura = digitaaltura.nextDouble();
     resultadomasc = (72.7 * altura) - 58;
     System.out.println("\nO peso ideal masculino e: " + resultadomasc + "kg");
       
   }
   else
   {
      System.out.println("\nCalculo do peso ideal feminino");
      System.out.println("\nInforme a altura aproximada. Ex.: 1,75: ");
      altura = digitaaltura.nextDouble();
      resultadofem = (62.1 * altura) - 44.7;
      System.out.println("\nO peso ideal feminino e: " + resultadofem + "kg");
      
   }   
  }
}