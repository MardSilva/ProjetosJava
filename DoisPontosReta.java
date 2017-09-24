   import java.util.Scanner; 
   
   public class DoisPontosReta {
      
      public static void main (String[] args){
      
      double D,resultado, Xa, Xb, Yb, Ya;
      System.out.println("Bem-vindo ao algoritmo de calculo para distancia de dois pontso em uma reta.\n\nPara comecar: ");
      System.out.println("\nPor favor, digite o valor de Xb: ");
      Scanner teclado = new Scanner(System.in);
      Xb = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o valor de Xa: ");
      Xa = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o valor de Yb: ");
      Yb = teclado.nextDouble();
      
      System.out.println("\nPor favor, digite o valor de Ya: ");
      Ya = teclado.nextDouble();
      
      
      resultado = Math.sqrt(Math.pow((Xb-Xa), 2) + Math.pow((Yb-Ya), 2));
      
      System.out.println("\n\tA distancia entre dois pontos e: " + resultado);
      }
    }
   
   
   
   
   