import java.util.Scanner;

   public class TiposTriangulos {
   
      public static void main (String[] args){
      Scanner teclado = new Scanner(System.in);
      double a, b, c;
      System.out.println("\nBem vindo ao programa de verificacao de triangulos");
      
      System.out.println("\nPor favor, digite o primeiro valor (a): ");
      a = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o segundo valor  (b): ");
      b = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o terceiro valor (c): ");
      c = teclado.nextDouble();
      
      //verificando a condição de existência de um triangulo
      
      if( a < (b + c) && b < (a + c) && c < (a + b))
      {
         if( a == b && b == c)
         {
            System.out.println("Os dados sao de um triangulo equilatero");
         }
         
         else if ( a == b || b == c || c == a )
         {
            System.out.println("Os dados sao de um triangulo isoceles.");
         }
         
         else
         {
            System.out.println("Os dados sao de um triangulo escaleno");
         }
      }
      
      else
      {
         System.out.println("As medidas informadas nao formam um triangulo");
      }
      
    }
 }