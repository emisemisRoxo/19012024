// declaração da classe/objeto 'CommaVarsComentado'
public class CommaVarsComentado {
    /** declaração de método executor main
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquê é um método sem retorno
     * @param String[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param args porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void main(String[] args) {
        //declaração de variável 'nome', 'sobrenome' e 'trabalho' do Tipo String, a qual tem valor respectivamente de 'Moisés', 'Santos' e 'assistente administrativo'.
        String nome = "Moisés", sobrenome = "Santos", trabalho = "assistente administrativo";
        //Impressão na tela da seguinte mensagem:'Meu nome é (valor da variável 'nome') dos (valor da variável 'sobrenome') e trabalho como (valor da variável 'trabalho')'.
        System.out.println("Meu nome é " + nome + " dos " + sobrenome + ", e trabalho como " + trabalho + ".");
    }//fechamento do método executor 'main'.
}//fechamento do objeto 'TesteComentado'.
