public class Strings {
    public static void main(String[] args) {
        System.out.println("Muito bom!");

        /*Para criar uma String em Java, basta
        utilizar aspas duplas para delimitar o
        texto. Por exemplo:*/
        //String nome = "Julia";

        /*Nesse exemplo, a variável nome recebe uma
        String com o texto "Alura". É possível
        concatenar duas ou mais Strings utilizando o
        operador +, por exemplo:*/
        String saudacao = "Olá, ";
        String nome = "Alura";
        String mensagem = saudacao + nome + "!";
        //Nesse caso, a variável mensagem receberá a String "Olá, Alura!".

        /*Comparação de Strings usando operador == e equals()*/
        String senha = "12345";
        if (senha.equals(senha)) {
            System.out.println("Acesso autorizado!");
        } else {
            System.out.println("Senha incorreta!");
        }
    }
}