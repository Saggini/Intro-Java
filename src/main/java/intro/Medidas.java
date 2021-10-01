  // 1 - Pacote
package intro;

// 2 - Referência as bibliotecas

// 3 - Classe
public class Medidas {
    // 3.1 - Atributos - Características

    // 3.2 - Métodos e Funções
    public static void main(String[] args) {
        System.out.println("Cálculo de áreas !!!");

        // Cálculo de área - Reduzido
        int largura = 4;
        int comprimento = 3;

        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área do tapete é de " + largura * comprimento + "m²");

    }

    public void calcularAreaModoExtenso(){
        // Calculo de área - Exemplo: o tamanho do tapete ou do piso
        int largura;
        int comprimento;
        int resultado;

        largura = 4; // largura recebe 4 unidades
        comprimento = 3; // comprimento recebe 3 unidades

        resultado = largura  * comprimento; // calculo
        System.out.println("Para a largura de " + largura + "m e o comprimento de " + comprimento + "m a área do tapete é de " + resultado + "m²");

    }

    public void calcularAreaModoCompacto (){


    }

}