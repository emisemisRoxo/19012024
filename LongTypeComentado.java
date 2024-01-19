// declaração da classe/objeto 'LongTypeComentado'
public class LongTypeComentado {
/** declaração de método executor main
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquê é um método sem retorno
     * @param String[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param args porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void main(String[] args) {
        //declaração de variável 'longVar' do Tipo Long, que atribui valores grandes quantitativamente a uma variável, a qual será atribuído (=) o valor '999999999999999999'.
        Long longVar = 999999999999999999L;
        //Impressão na tela da variável 'longVar'.
        System.out.println(longVar);
 }//fechamento do método executor 'main'.
}//fechamento do objeto 'DoubleTypeComentado'.
