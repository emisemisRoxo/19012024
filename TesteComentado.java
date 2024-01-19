// declaração da classe/objeto 'TesteComentado'
public class TesteComentado {
    /** declaração de método executor main
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquê é um método sem retorno
     * @param String[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param args porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void main(String[] args) {
        //Impressão na tela com a ação 'ImprimirTextoMaiusculo', do texto 'Hello Worl ' e a impressão do resultado do cálculo 6*7 + 1.
        System.out.println(ImprimirTextoMaiusculo("Hello World " + (1 + 6 * 7)));
    }//fechamento do método executor 'main'.
    /** declaração de método ImprimirTextoMaiusculo, do tipo String.
     * public: porque poderá ser importado por outros objetos/classes.
     * static: porque o método não poderá ser alterado ou sobrescrito.
     * Declarado esse método como 'Texto' do tipo String.
     */
    public static String ImprimirTextoMaiusculo(String Texto)
    {//Retorna ao conteúdo do método 'Texto', porém com todas as letras sendo maiúsculas.
        return Texto.toUpperCase();
    }//fechamento do método executor 'main'.
}//fechamento do objeto 'TesteComentado'.
