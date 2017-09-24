import java.util.Scanner;

   public class AnoBissexto{

   public static void main(String[] args){
   
   int ano;
   System.out.println("Bem-vindo ao algoritmo de ano bissexto.");
   Scanner teclado = new Scanner(System.in);
   System.out.println("\nPor favor, digite o ano desejado: ");
   ano = teclado.nextInt();
   
   if( ano % 4 == 0)
   {
      if(ano % 100 == 0)
      {
         if(ano % 400 == 0)
          {
            System.out.println("\nO ano informado: " + ano + " e bissexto");
          }
          
          else
          {
            System.out.println("\nO ano informado: " + ano + " nao e bissexto");
          }
       }
       else
       {
         System.out.println("\nO ano informado: " + ano + " e bissexto");
       }
    }
      else
          {
            System.out.println("\nO ano informado: " + ano + " nao e bissexto");
          }
    }
  }      