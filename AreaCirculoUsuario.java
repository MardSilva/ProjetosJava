import java.util.Scanner; // importando biblioteca scanner do java
   
   public class AreaCirculoUsuario {
   
      public static void main (String [] args){
      
      //declara��o de vari�vel PI
      double pi = 3.14;
      
      //instanciando e criando o objeto scanner juntamente com a vari�vel raio permitindo que o usu�rio possa digitar o valor de raio
      Scanner valor = new Scanner(System.in);
      double raio;
      
      //pedindo o valor do raio para o usu�rio
      System.out.println("\nO valor do raio e: ");
      raio = valor.nextDouble();
      double area = pi * raio *raio; // f�rmula matem�tica para calcular o raio �: A = pi.r�
      
      //escrevendo os dados na tela para o usu�rio
      System.out.println("\nLembrando que a form�la da area de um c�rculo e: A = pi.r.r");
      System.out.println("\nO valor do raio e: " + raio);
      System.out.println("\nO valor da area e: " + area);
      }
 }
   
   