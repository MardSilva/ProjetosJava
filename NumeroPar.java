import java.util.Scanner;

public class NumeroPar{
   
   public static void main(String[] args){
   
   int numero;
   System.out.println("\nBem vindo ao programar de verificacao do numero");
   Scanner teclado = new Scanner(System.in);
   
   System.out.println("\nPor favor, digite o numero desejado: ");
   numero = teclado.nextInt();
   
   if(numero % 2 == 0)
   {
      System.out.println("O numero digitado: " + numero + " e par.");
   }
   else
   {
      System.out.println("O numero digitado: " + numero + " e par.");
   }
  }
}