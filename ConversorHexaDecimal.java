import java.lang.StringBuilder; // importando a classe StringBuilder - voltada para concatenação de textos, organização e outros
import java.util.Scanner; // importando método Scanner para leitura de dados
   
      class ConversorHexaDecimal //classe principal onde ficam os dados para conversão do hexadecimal e suas definições
      {
         private static final int tamanhodebytes = 8; //definido um valor privado final ou seja, sem alterações (imutável) para o tamanhodebytes
         private static final int numerodebits = 4;   //definido um valor privado final ou seja, sem alterações (imutável) para o numerodebits
         private static final int hexadecimalbyte = 0x0F; //definido um valor privado final ou seja, sem alterações (imutável) para o hexadecimalbyte para começar com 00,0000,000000
         private static final char [] digitoshexadecimais = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; //cadeia imutável para digitoshexadecimais
      
      
      public static String DecimalparaHexadecimal (int decimal) // classe de texto que não muda e devolve um valor inteiro: int
      {
         StringBuilder ConstrutorHex = new StringBuilder(numerodebits); //criando um StringBuilder
         ConstrutorHex.setLength(tamanhodebytes); //Definindo o tamanho do StringBuilder apartir do atributo tamanhodebytes
         
         for (int i = tamanhodebytes - 1; i>= 0; --i) //laço de repetição para o tamanho das casas decimais, e, ajustando-se ao tamanho da concatenação da conversão reduzindo-os.
         {
            int hexadec = decimal & hexadecimalbyte; //variável inteira chamada hexadec para armazenar os valroes de decimal e hexadecimalbyte para concatenação
            ConstrutorHex.setCharAt(i, digitoshexadecimais[hexadec]); //jogando no ConstrutorHex a concatenação respeitando o número de casas decimais
            decimal >>= numerodebits;//preenchendo com o menor valor para preencher com 0 sempre à esquerda. Ex.: 000000XX
         }
         
         return ConstrutorHex.toString(); //fazendo a conversão, e jogando ela para string
         
         }
   
      public static void main (String[] args) // classe principal main
      {
    
         Scanner valor = new Scanner(System.in); //criando um scanner para pegar informações do usuário como entrada
         System.out.println("\nPor favor, digite um numero para ser convertido: \n"); //mensagem para o usuário
         int digitointeiro = valor.nextInt(); //armazenando o valor da variável
         
         if(digitointeiro <= 0) //verificando se o número é menor ou igual a zero. se for, retornará a mensagem
         {
            System.out.println("\nO valor e ele mesmo. Digite novamente.");
         }
         else //senão
         {
         
         String hexadecimal = DecimalparaHexadecimal(digitointeiro); //armazenando o número convertido na variável hexadecimal
         System.out.println("\nA conversao do número: " + digitointeiro + " tem como resultado: " +hexadecimal); //mostrando o número em hexadecimal
          
         }
      }
   }