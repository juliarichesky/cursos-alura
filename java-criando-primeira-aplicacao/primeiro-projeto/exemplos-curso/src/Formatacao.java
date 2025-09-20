public class Formatacao {
    public static void main(String[] args) {
        /* Em Java, é possível formatar textos e números de diversas
        maneiras. Isso pode ser útil em diversas situações, como ao
        exibir valores para o usuário de uma maneira mais legível.
        Uma das maneiras mais comuns de se formatar textos em Java
        é utilizando o método format(), da classe String. Esse
        método permite formatar um texto utilizando diversos placeholders, que são representados pelo caractere % seguido de uma letra que indica o tipo de dado que será inserido no placeholder. Por exemplo, %s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica um valor de ponto flutuante. Vamos ver um exemplo:*/

        String nome = "Julia";
        int idade = 21;
        double valor = 55.9999;
        System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais.", nome, idade, valor));

        /*Nesse exemplo, os valores das variáveis nome, idade e valor são passados como parâmetros para o método String.format, substituindo os placeholders %s, %d e %.2f, respectivamente. O resultado impresso será "Meu nome é Julia, eu tenho 21 anos e hoje gastei 55,99 reais". Perceba também que o placeholder %.2f indica que o valor deve ser formatado com duas casas decimais.

        Além disso, também podemos usar com text block!*/

        String nome1 = "Emily";
        int aulas = 4;
        String mensagem = """
                Olá %s!
                Boas vindas ao curso de Java.
                Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro passo na linguagem!""".formatted(nome1, aulas);
        System.out.println(mensagem);
    }
}
