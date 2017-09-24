import java.util.Scanner; //método scanner para entrada de dados

   public class AreaTrianguloRetangulo{
   
      public static void main (String[] args){
      
      double a, b, h;
      Scanner teclado = new Scanner(System.in);
      System.out.println("\nBem vindo ao programa de calcular a Area do Triangulo Retangulo");
      
      System.out.println("\nPor favor, digite o valor de a: ");
      a = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o valor de b: ");
      b = teclado.nextDouble();
            
      h = a*2 + b*2;
      Math.sqrt(h);
      
      System.out.println("\nO perimetro do triangulo retangulo e: " + h) ;
      }
   }