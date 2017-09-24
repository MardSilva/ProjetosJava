import java.util.Scanner; // importando biblioteca scanner do java
   
   public class AreaCirculoUsuario {
   
      public static void main (String [] args){
      
      //declaração de variável PI
      double pi = 3.14;
      
      //instanciando e criando o objeto scanner juntamente com a variável raio permitindo que o usuário possa digitar o valor de raio
      Scanner valor = new Scanner(System.in);
      double raio;
      
      //pedindo o valor do raio para o usuário
      System.out.println("\nO valor do raio e: ");
      raio = valor.nextDouble();
      double area = pi * raio *raio; // fórmula matemática para calcular o raio é: A = pi.r²
      
      //escrevendo os dados na tela para o usuário
      System.out.println("\nLembrando que a formúla da area de um círculo e: A = pi.r.r");
      System.out.println("\nO valor do raio e: " + raio);
      System.out.println("\nO valor da area e: " + area);
      }
 }
   
   