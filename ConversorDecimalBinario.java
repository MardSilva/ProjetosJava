/**
* Converte decimal para bin�rio. A regra � ficar dividindo o valor por 2, pegar o resto de cada divis�o e inserir o valor da direita para a esquerda na String de
* retorno. O algoritmo � executado at� que o valor que foi sucessivamente dividido se torne 0. Obs.: assume que o valor passado � inteiro positivo.
* Exemplo: 13
* 13/2 = 6 -> resto 1 -> Resultado: 1
* 6/2 = 3  -> resto 0 -> Resultado: 01
* 3/2 = 1  -> resto 1 -> Resultado: 101
* 1/2 = 0  -> resto 1 -> Resultado: 1101
*
* Resultado: 1101
*
* @param valor n�mero decimal a ser convertido
* @return String contendo o valor em bin�rio
*/

import java.util.Scanner;

public static String ConversorDecimalBinario( int valor) {
int resto = -1;
StringBuilder construtorstring = new StringBuilder();

if (valor == 0)
   {
      return 0;
   }
   
/* enquanto o resultado da divis�o por 2 for maior que '0' ser� adicionado a String de 
o resto de retorno*/

while ( valor > 0)
{
   resto = valor % 2;
   valor = valor / 2;
   construtorstring.insert(0, resto);
}

   return construtorstring.toString();
}

public static void main(String[] args){

   Scanner valor = new Scanner(System.in);
   System.out.println("Conversor de Binario v.1.0");
   System.out.println("\nPor favor, digite o n�mero para ser convertido em binario: ");
   int numero = valor.nextInt();

   String numerobinario = ConversorBinarioDecimal(numero);
   System.out.println("O numero informado: " + numero + " convertido e: " + numerobinario);
  
  }

