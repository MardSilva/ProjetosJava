import java.util.Scanner;

public class EquacaoSegundoGrau{
   
   public static void main (String [] args){
   
   double a, b, c, delta, x1, x2;
   System.out.println("Bem vindo ao algoritmo de equacao de segundo grau");
   
   Scanner teclado = new Scanner(System.in);
   System.out.println("\nPor favor, digite o valor de a:");
   a = teclado.nextDouble();
   
   System.out.println("\nPor favor, digite o valor de b:");
   b = teclado.nextDouble();
   
   System.out.println("\nPor favor, digite o valor de c:");
   c = teclado.nextDouble();
   
   delta = Math.pow(b,2) - 4 * a * c;
   
   x1 = (-b + Math.sqrt(delta)) / 2 * a;
   x2 = (-b - Math.sqrt(delta)) / 2 * a;
   
   System.out.println("\nO resultado da equacao e: " + x1 + " ou " + x2);
   
   }
}
   
   
   
   