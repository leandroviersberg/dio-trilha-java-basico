public class Operadores {
    public static void main(String[] args) {

        /*
         * Operadores Relacionais
         * De forma mais precisa os Operadores relacionais definem se o 'Operando' à
         * eaquerda é igual, diferente,
         * menor, menor ou igual, maior ou igual ao da direita, sempre retornando o
         * valor booleano no resultado.
         * 
         * ==Quando verificamos se as variaveis são IGUAIS
         * != Quando veriificamos se as variaveis são DIFERENTES das outras
         * > Quando veriificamos se a variavei é MAIOR QUE a outra
         * >= Quando veriificamos se a variavel é MAIOR OU IGUAL a outra
         * < Quando veriificamos se a variavel é MENOR QUE a outra
         * <= Quando veriificamos se a variavel é MENOR OU IGUAL a outra
         * 
         * 
         * 
         */

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("numeroUm é igual ao numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente ao numeroDois? " + simNao);

        // Operador Ternario

        // int a, b; //As variveis
        // a = 5;
        // b = 6;

        /*
         * String resultado = ""; //Se (if) a for igual ao b, deve imprimir verdadeiro
         * if(a==b)
         * resultado = "verdadeiro";
         * else //Senão(else) deve imprimir falso
         * resultado = "falso";
         */

        /*
         * De forma mais simplificada será a mesma coisa do modo acima, mas serão usadas
         * a simbologia "?:"
         * int a, b; //As variveis
         * a = 5;
         * b = 6;
         * 
         * String resultado = a==b ?"verdadeiro" : "falso";
         * System.out.println(resultado);
         */

        // ___________________________________________________________________________________

        // boolean variavel = false;

        // variavel = !variavel; // negação, ou seja, usando "!" tem a finalidade de
        // inverter a variavel boolean
        // System.out.println(variavel);

        // int numero = 5;
        // numero = -numero;

        // x repeticao incremento
        // int numero = 5;

        // numero++; // é a mesma representação de incremento +1 conforme está abaixo
        // numero = numero + 1;
        // System.out.println( numero ++ ); //[Incremnentar em 1] aqui imprimiu o numero
        // conforme mudamos os dados
        // System.out.println( numero -- );// [decrementar em 1]

    }

}
