// declaração da classe/objeto DoubleTypeComentado
public class DoubleTypeComentado {
        /** declaração de método executor main
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquÊ é um método sem retorno
     * @param String[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param args porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void main(String[] args) {
        //declaração de variável doubleVar do Tipo Double, que arredonda o resultado da variável, a qual será atribuído (=) o valor '9.9999999999999999999999999999999999'.
        Double doubleVar = 9.9999999999999999999999999999999999;
        //Impressão na tela da variável 'doubleVar'.
        System.out.println(doubleVar);
    }//fechamento do método executor 'main'.
} //fechamento do objeto 'DoubleTypeComentado'. Main {
