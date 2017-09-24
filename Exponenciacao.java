import java.util.Scanner; //método Scanner para entrada de dados

   public class Exponenciacao{ // classe principal
      
      public static void main (String[] args){ //método principal main
      
      double base, expoente, resultado; // variáveis do ambiente
      System.out.println("\nBem vindo ao programa de exponenciacao");
      Scanner teclado = new Scanner(System.in);//classe Scanner para entrada de dados
      
      System.out.println("\nPor favor, digite a base da operacao: ");
      base = teclado.nextDouble();//atribuindo valor a variável base      
      System.out.println("\nPor favor, digte o expoente da operacao: ");
      expoente = teclado.nextDouble();//atribuindo valor a variável expoente
      
      resultado = Math.pow(base, expoente); // operação na variável resultado
      
      System.out.println("\nO numero " + base + " elevado a " + expoente + " e igual a: " + resultado); //exibindo a mensagem com a operação já realizada
      }
      //fim do método main
   }//fim da classe Exponenciacao