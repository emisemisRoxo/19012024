// declaração da classe/objeto 'MathAbsoluteComentado'
public class MathAbsoluteComentado {
    /** declaração de método executor main
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquê é um método sem retorno
     * @param String[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param args porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void main (String[] args) {
         //declaração de variável 'valorNum', a qual recebe o valor da função 'Math.abs' do valor '-50.23567''.
        double valorNum = Math.abs(-50.23567);
        //Impressão na tela da seguinte variável 'valorNum'.
        System.out.println(valorNum);
    }//fechamento do método executor 'main'.
}//fechamento do objeto 'TesteComentado'.

