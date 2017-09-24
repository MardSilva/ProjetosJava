import java.util.Scanner;

public class Calculadora {
   
   public static void main (String[] args){
   
   Scanner teclado = new Scanner(System.in);
   int escolha;
   double numero1, numero2, resultado;
   
   System.out.println("\nBem vindo a calculadora basica v.1.0");
   System.out.println("Para comecar, escolha a operacao que deseja realizar: ");
   System.out.println("\n1)Adicao \n2)Subtracao \n3)Multiplicacao \n4)Divisao\n");
   escolha = teclado.nextInt();
   
   if(escolha == 1)
   {
      System.out.println("\nCalculadora Basica - Operacao de Soma");
      
      System.out.println("\nPor favor, digite o primeiro numero :");
      numero1 = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o segundo numero :");
      numero2 = teclado.nextDouble();
      
      resultado = numero1 + numero2;
      
      System.out.println("A soma dos numeros e igual a: " + resultado);
   }
   
   if(escolha == 2)
   {
      System.out.println("\nCalculadora Basica - Operacao de Subtracao");
      
      System.out.println("\nPor favor, digite o primeiro numero :");
      numero1 = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o segundo numero :");
      numero2 = teclado.nextDouble();
      
      resultado = numero1 - numero2;
      
      System.out.println("A subtracao dos numeros e igual a: " + resultado);
      
   }
   
   if(escolha == 3)
   {
      System.out.println("\nCalculadora Basica - Operacao de Subtracao");
      
      System.out.println("\nPor favor, digite o primeiro numero :");
      numero1 = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o segundo numero :");
      numero2 = teclado.nextDouble();
      
      resultado = numero1 * numero2;
      
      System.out.println("A multiplicacao dos numeros e igual a: " + resultado);
      
   }
   
   else if(escolha == 4)
   
   {
      System.out.println("\nCalculadora Basica - Operacao de Subtracao");
      
      System.out.println("\nPor favor, digite o primeiro numero :");
      numero1 = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o segundo numero :");
      numero2 = teclado.nextDouble();
      
      resultado = numero1 / numero2;
      
      System.out.println("A divisao dos numeros e igual a: " + resultado);
         
   }
   
  }
}