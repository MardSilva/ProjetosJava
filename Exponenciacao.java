import java.util.Scanner; //m�todo Scanner para entrada de dados

   public class Exponenciacao{ // classe principal
      
      public static void main (String[] args){ //m�todo principal main
      
      double base, expoente, resultado; // vari�veis do ambiente
      System.out.println("\nBem vindo ao programa de exponenciacao");
      Scanner teclado = new Scanner(System.in);//classe Scanner para entrada de dados
      
      System.out.println("\nPor favor, digite a base da operacao: ");
      base = teclado.nextDouble();//atribuindo valor a vari�vel base      
      System.out.println("\nPor favor, digte o expoente da operacao: ");
      expoente = teclado.nextDouble();//atribuindo valor a vari�vel expoente
      
      resultado = Math.pow(base, expoente); // opera��o na vari�vel resultado
      
      System.out.println("\nO numero " + base + " elevado a " + expoente + " e igual a: " + resultado); //exibindo a mensagem com a opera��o j� realizada
      }
      //fim do m�todo main
   }//fim da classe Exponenciacao