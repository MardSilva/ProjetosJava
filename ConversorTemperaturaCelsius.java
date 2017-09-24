import java.util.Scanner;

public class ConversorTemperaturaCelsius{
   
   public static void main(String[] args){
   System.out.println("Bem-vindo ao Conversor de Temperaturas - Farenheit para Celsius");
   double tempF, tempC;
   
   Scanner valortemperatura = new Scanner(System.in);
   System.out.println("\nPor favor, digite o valor da temperatura em Farenheit: ");
   tempF = valortemperatura.nextDouble();
   
   // realizando a conversão   
   tempC = 5.0 / 9.0 * (tempF - 32);
   System.out.println("\nO valor da temperatura em Celsius e: " + tempC + " C");
   
   
   /*tempC = 5.0 / 9.0 * (tempF - 32) ;*/ //para divisão real SEMPRE COLOCAR NUMERO COM .0!

   }
}
   