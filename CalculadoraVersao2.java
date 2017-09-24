import java.util.Scanner; //método para entrada de dados

public class CalculadoraVersao2 { //classe CalculadoraVersao2
   
   public static void main (String[] args){ //método principal
   
   Scanner teclado = new Scanner(System.in); //instanciando o scanner
   int operacao;
   double numero1, numero2, resultado; // declaração de variáveis
   
   System.out.println("\nBem vindo a calculadora de operacao basica v.2.0");
   System.out.println("Para comecar, escolha a operacao que deseja realizar: ");
   System.out.println("\n1)Adicao \n2)Subtracao \n3)Multiplicacao \n4)Divisao\n");
   operacao = teclado.nextInt();
   
   switch(operacao){ //switch para lidar com as escolhas das operações
   
      case 1: //case soma
         System.out.println("\nCalculadora Basica - Operacao de Soma");
      
         System.out.println("\nPor favor, digite o primeiro numero :");
         numero1 = teclado.nextDouble();
      
         System.out.println("\nPor favor, digite o segundo numero :");
         numero2 = teclado.nextDouble();
      
         resultado = numero1 + numero2;
      
         System.out.println("A soma dos numeros e igual a: " + resultado);
         break;
      
      case 2: //case subtração
          System.out.println("\nCalculadora Basica - Operacao de Subtracao");
      
          System.out.println("\nPor favor, digite o primeiro numero :");
          numero1 = teclado.nextDouble();
      
          System.out.println("\nPor favor, digite o segundo numero :");
          numero2 = teclado.nextDouble();
      
          resultado = numero1 - numero2;
      
          System.out.println("A subtracao dos numeros e igual a: " + resultado);
         break;

      case 3: //case multiplicação
          System.out.println("\nCalculadora Basica - Operacao de Multiplicacao");
      
          System.out.println("\nPor favor, digite o primeiro numero :");
          numero1 = teclado.nextDouble();
      
          System.out.println("\nPor favor, digite o segundo numero :");
          numero2 = teclado.nextDouble();
      
          resultado = numero1 * numero2;
      
          System.out.println("A multiplicacao dos numeros e igual a: " + resultado);
         break;
         
      case 4: //case divisão
          System.out.println("\nCalculadora Basica - Operacao de Divisao");
      
          System.out.println("\nPor favor, digite o primeiro numero :");
          numero1 = teclado.nextDouble();
      
          System.out.println("\nPor favor, digite o segundo numero :");
          numero2 = teclado.nextDouble();
      
          resultado = numero1 / numero2;
      
          System.out.println("A multiplicacao dos numeros e igual a: " + resultado);
         break;
         
      
      default: // case que será ativado caso nenhum outro case seja definido. Ex.: As operações são somente de 1 a 4. Caso o usuário digite 5, ele retornará o default para execução.
          System.out.println("Digite somente os números entre 1 e 4");
          break;
          
      }
    
    }
 }