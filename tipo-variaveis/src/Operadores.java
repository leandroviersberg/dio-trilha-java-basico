/*Operadores

Operador de atribuição representado pelo simbolo de =
Operador de atribuição 
Operadores Aritméticos:

+(adição)
-(subtração)
*(multiplicação)
/ (divisão)
% (módulo)
++ (incremento)
-- (decremento)
Operadores de Atribuição:

= (atribuição simples)
+= (atribuição de adição)
-= (atribuição de subtração)
*= (atribuição de multiplicação)
/= (atribuição de divisão)
%= (atribuição de módulo)
<<= (atribuição de deslocamento à esquerda)

||"= (atribuição de deslocamento à direita)"

&= (atribuição de AND bit a bit)
^= (atribuição de OR exclusivo bit a bit)
|= (atribuição de OR bit a bit)
Operadores Relacionais:

== (igual a)
!= (diferente de)

|"(maior que)"

< (menor que)
= (maior ou igual a)
<= (menor ou igual a)

Operadores Lógicos:

&& (e lógico)
|| (ou lógico)
! (negação lógica)


Operadores Bitwise:

& (AND bit a bit)
| (OR bit a bit)
^ (OR exclusivo bit a bit)
~ (NOT bit a bit)
<< (deslocamento à esquerda)
||(deslocamento à direita)
||| (deslocamento à direita sem sinal)

Operadores de Ternário:

?: (operador ternário)
Além desses operadores, 
também existem os operadores de instância (.) e de cast ((tipo)),
 que são usados para acessar membros de objetos e converter tipos de dados, respectivamente.

 * 
 * 
 */

public class Operadores {
    public static void main(String[] args) {
        boolean variavel = false;

        variavel = !variavel; // negação, ou seja, usando "!" tem a finalidade de inverter a variavel boolean
        System.out.println(variavel);

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
