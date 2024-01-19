// declaração da classe/objeto 'BiteTypeComentado'
public class BiteTypeComentado {
/** declaração de método executor main
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquê é um método sem retorno
     * @param String[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param args porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void main (String[] args) {
        //declaração de variável 'numVal' do Tipo byte, a qual converte o valor da variável em bytes.
        byte numVal;
        //declaração de variável 'numVal', que terá o valor de '127'.
        numVal = 127;
        //Impressão na tela com o valor da variável 'numVal' convertido.
        System.out.println(numVal);
    }//fechamento do método executor 'main'.
}//fechamento do objeto 'TesteComentado'.
