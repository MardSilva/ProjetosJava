import java.util.Scanner; //m�todo para entrada de dados

public class CalculadoraVersao2 { //classe CalculadoraVersao2
   
   public static void main (String[] args){ //m�todo principal
   
   Scanner teclado = new Scanner(System.in); //instanciando o scanner
   int operacao;
   double numero1, numero2, resultado; // declara��o de vari�veis
   
   System.out.println("\nBem vindo a calculadora de operacao basica v.2.0");
   System.out.println("Para comecar, escolha a operacao que deseja realizar: ");
   System.out.println("\n1)Adicao \n2)Subtracao \n3)Multiplicacao \n4)Divisao\n");
   operacao = teclado.nextInt();
   
   switch(operacao){ //switch para lidar com as escolhas das opera��es
   
      case 1: //case soma
         System.out.println("\nCalculadora Basica - Operacao de Soma");
      
         System.out.println("\nPor favor, digite o primeiro numero :");
         numero1 = teclado.nextDouble();
      
         System.out.println("\nPor favor, digite o segundo numero :");
         numero2 = teclado.nextDouble();
      
         resultado = numero1 + numero2;
      
         System.out.println("A soma dos numeros e igual a: " + resultado);
         break;
      
      case 2: //case subtra��o
          System.out.println("\nCalculadora Basica - Operacao de Subtracao");
      
          System.out.println("\nPor favor, digite o primeiro numero :");
          numero1 = teclado.nextDouble();
      
          System.out.println("\nPor favor, digite o segundo numero :");
          numero2 = teclado.nextDouble();
      
          resultado = numero1 - numero2;
      
          System.out.println("A subtracao dos numeros e igual a: " + resultado);
         break;

      case 3: //case multiplica��o
          System.out.println("\nCalculadora Basica - Operacao de Multiplicacao");
      
          System.out.println("\nPor favor, digite o primeiro numero :");
          numero1 = teclado.nextDouble();
      
          System.out.println("\nPor favor, digite o segundo numero :");
          numero2 = teclado.nextDouble();
      
          resultado = numero1 * numero2;
      
          System.out.println("A multiplicacao dos numeros e igual a: " + resultado);
         break;
         
      case 4: //case divis�o
          System.out.println("\nCalculadora Basica - Operacao de Divisao");
      
          System.out.println("\nPor favor, digite o primeiro numero :");
          numero1 = teclado.nextDouble();
      
          System.out.println("\nPor favor, digite o segundo numero :");
          numero2 = teclado.nextDouble();
      
          resultado = numero1 / numero2;
      
          System.out.println("A multiplicacao dos numeros e igual a: " + resultado);
         break;
         
      
      default: // case que ser� ativado caso nenhum outro case seja definido. Ex.: As opera��es s�o somente de 1 a 4. Caso o usu�rio digite 5, ele retornar� o default para execu��o.
          System.out.println("Digite somente os n�meros entre 1 e 4");
          break;
          
      }
    
    }
 }