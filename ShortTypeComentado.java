// declaração da classe/objeto 'ShortTypeComentado'
public class ShortTypeComentado {
    /** declaração de método executor main
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquÊ é um método sem retorno
     * @param String[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param args porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void main (String[] args) {
        //declaração de variável 'shortVar' do Tipo Short, que atribui valores pequenos quantitativamente a uma variável, a qual será atribuído (=) o valor '9999'.
        Short shortVar = 9999;
         //Impressão na tela da variável 'shortVar'.
        System.out.println(shortVar);
 }//fechamento do método executor 'main'.
}//fechamento do objeto 'DoubleTypeComentado'. Main {