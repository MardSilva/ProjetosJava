import java.util.Scanner; //importando a biblioteca scanner para pegar valor inserido pelo usu�rio

public class PerimetroQuadradoUsuario{
   
   public static void main (String [] args){
   
   //declarando o m�todo scanner para pegar o valor inserido pelo usuario
   Scanner valor = new Scanner(System.in);
   
   //Criando o m�todo para pedir o usu�rio para inserir os valores utilizados por ele no programa
   System.out.println("\nPor favor, digite o valor do lado desejado: ");
   double lado;
   lado = valor.nextDouble(); // atribuindo a vari�vel lado o m�todo valor do Scanner
   
   // vari�vel para armazenar o valor do per�metro e multiplicar por 4 > Lembrando: P = 4.L
   double perimetro = 4 * lado;
   
   //Escrevendo na tela para o usu�rio o resultado
   
   System.out.println("\nO valor digitado para calculo da area foi: " + lado);
   System.out.println("\nO per�metro do quadrado e: " + perimetro);
   }
}

   