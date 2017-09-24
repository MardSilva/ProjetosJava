import java.util.Scanner; //importando a biblioteca scanner para pegar valor inserido pelo usuário

public class PerimetroQuadradoUsuario{
   
   public static void main (String [] args){
   
   //declarando o método scanner para pegar o valor inserido pelo usuario
   Scanner valor = new Scanner(System.in);
   
   //Criando o método para pedir o usuário para inserir os valores utilizados por ele no programa
   System.out.println("\nPor favor, digite o valor do lado desejado: ");
   double lado;
   lado = valor.nextDouble(); // atribuindo a variável lado o método valor do Scanner
   
   // variável para armazenar o valor do perímetro e multiplicar por 4 > Lembrando: P = 4.L
   double perimetro = 4 * lado;
   
   //Escrevendo na tela para o usuário o resultado
   
   System.out.println("\nO valor digitado para calculo da area foi: " + lado);
   System.out.println("\nO perímetro do quadrado e: " + perimetro);
   }
}

   