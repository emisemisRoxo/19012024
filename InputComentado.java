//importação de todos os itens da biblioteca java.util.Scanner.
import java.util.Scanner;
// declaração da classe/objeto 'InputComentado'.
public class InputComentado {
    // declaração da classe/objeto 'Input'.
    public class Input {
        /** declaração de método executor main
     * public: porque poderá ser importado por outros objetos/classes
     * static: porque o método não poderá ser alterado ou sobrescrito
     * void porquê é um método sem retorno
     * @param String[] porque poderão ser invocados métodos do tipo String e matrizes []
     * @param args porque poderá ser invocado o objeto args da biblioteca java.lang
     */
    public static void main(String[] args) {
        //Impressão na tela da seguinte mensagem: 'Por favor, digite seu ano de nascimento:'
        System.out.println("Por favor, digite seu ano de nascimento:");
         //declaração de um novo Scanner, chamado 'scandt'.
        Scanner scandt = new Scanner(System.in);
        //declaração de variável 'datanasc' do Tipo Int, a qual tem valor recebido pelo Scanner 'scandt'.
        int datanasc = scandt.nextInt();
         //Impressão na tela da seguinte mensagem: 'Você tem (diferença do ano de nascimento para o ano de 2023) anos.'
        System.out.println("Você tem " + (2023 - datanasc) + " anos.");
        //Fechamento do Scanner 'scandt'.
        scandt.close();
    }//fechamento do método executor 'main'.
}//fechamento do objeto 'Input'.
}//fechamento do objeto 'InputComentado'.


