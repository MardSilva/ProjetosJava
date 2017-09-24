import java.lang.StringBuilder; // importando a classe StringBuilder - voltada para concatena��o de textos, organiza��o e outros
import java.util.Scanner; // importando m�todo Scanner para leitura de dados
   
      class ConversorHexaDecimal //classe principal onde ficam os dados para convers�o do hexadecimal e suas defini��es
      {
         private static final int tamanhodebytes = 8; //definido um valor privado final ou seja, sem altera��es (imut�vel) para o tamanhodebytes
         private static final int numerodebits = 4;   //definido um valor privado final ou seja, sem altera��es (imut�vel) para o numerodebits
         private static final int hexadecimalbyte = 0x0F; //definido um valor privado final ou seja, sem altera��es (imut�vel) para o hexadecimalbyte para come�ar com 00,0000,000000
         private static final char [] digitoshexadecimais = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}; //cadeia imut�vel para digitoshexadecimais
      
      
      public static String DecimalparaHexadecimal (int decimal) // classe de texto que n�o muda e devolve um valor inteiro: int
      {
         StringBuilder ConstrutorHex = new StringBuilder(numerodebits); //criando um StringBuilder
         ConstrutorHex.setLength(tamanhodebytes); //Definindo o tamanho do StringBuilder apartir do atributo tamanhodebytes
         
         for (int i = tamanhodebytes - 1; i>= 0; --i) //la�o de repeti��o para o tamanho das casas decimais, e, ajustando-se ao tamanho da concatena��o da convers�o reduzindo-os.
         {
            int hexadec = decimal & hexadecimalbyte; //vari�vel inteira chamada hexadec para armazenar os valroes de decimal e hexadecimalbyte para concatena��o
            ConstrutorHex.setCharAt(i, digitoshexadecimais[hexadec]); //jogando no ConstrutorHex a concatena��o respeitando o n�mero de casas decimais
            decimal >>= numerodebits;//preenchendo com o menor valor para preencher com 0 sempre � esquerda. Ex.: 000000XX
         }
         
         return ConstrutorHex.toString(); //fazendo a convers�o, e jogando ela para string
         
         }
   
      public static void main (String[] args) // classe principal main
      {
    
         Scanner valor = new Scanner(System.in); //criando um scanner para pegar informa��es do usu�rio como entrada
         System.out.println("\nPor favor, digite um numero para ser convertido: \n"); //mensagem para o usu�rio
         int digitointeiro = valor.nextInt(); //armazenando o valor da vari�vel
         
         if(digitointeiro <= 0) //verificando se o n�mero � menor ou igual a zero. se for, retornar� a mensagem
         {
            System.out.println("\nO valor e ele mesmo. Digite novamente.");
         }
         else //sen�o
         {
         
         String hexadecimal = DecimalparaHexadecimal(digitointeiro); //armazenando o n�mero convertido na vari�vel hexadecimal
         System.out.println("\nA conversao do n�mero: " + digitointeiro + " tem como resultado: " +hexadecimal); //mostrando o n�mero em hexadecimal
          
         }
      }
   }