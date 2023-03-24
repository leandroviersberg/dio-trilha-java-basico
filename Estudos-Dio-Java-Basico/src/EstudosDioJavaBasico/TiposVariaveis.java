package EstudosDioJavaBasico;
// 8 tipos primitivos em java:
/*
 * int, byte, short, long, float, double, boolean e char - estes
 * tipos não são considerados objetos, e portanto representam valores brutos.
 *Exemplos: int idade; > Tipo "int", nome "idade", com nenhum valor atribuido.
 int anoFabricacao = 2023 >tipo "int", nome "anoFabricacao", com valores atribuidos.
 double salarioMinimo = 2.500; >tipo "double, nome salarioMinimo "
 */

public class TiposVariaveis {
    public static void main(String[] args) {
        // double salarioMinimo = 2500; //O valor está de forma "milhar"
        // Outros exemplos da tipagem.

        byte idade = 123;
        short ano = 2021;
        int cep = 21070333; // Se começar com zero, talvez tenha que ser de outro tipo, talvez possa usar
                            // como String se necessário
        long cpf = 98765432109L; // Se começar com zero, talvez tenha que ser de outro tipo, quando se trata de
                                 // long usar a letra "L" para indicar o tipo do dado
        float pi = 3.14F; // Vale ressaltar que todo valor indicado deve ter no final a letra "F" ou "f",
                          // pois se não tiver, o Java pode entender que este valor seja do tipo double
        double salario = 1275.33;

        // Outro exemplo:

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // short numeroCurto2 = numeroNormal; //aqui ele pede que seja mudado para
        // "int", mas será usado uma adaptação do recurso CAST
        short numeroCurto2 = (short) numeroNormal; // (short) adaptou o numero

        // Variaveis e constantes
        /*
         * Em java, as Constantes se trata de valores amazenados em memoria que não
         * podem ser modificados.
         * depois de declarados. Na linguagem Java, tais valores são representados pela
         * palavra reservada "final"
         * seguida do tipo.
         * Foi convencionado que Constantes são sempre escritos em CAIXA ALTA
         * (UPPERCASE)
         * 
         * Veja um exemplo abaixo.
         * 
         */

        int numero = 5;

        numero = 10;

        System.out.print(numero);

        final double VALOR_DE_PI = 3.14; // Aqui mostra que não deve permitir que a variavel altere

        // VALOR_DE_PI = 10.75;

    }
}
