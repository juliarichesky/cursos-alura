/*Exemplo de comentário em um bloco grande
  Exemplo de comentário em um bloco grande
  Exemplo de comentário em um bloco grande
  Exemplo de comentário em um bloco grande
  Exemplo de comentário em um bloco grande*/

//Exemplo de comentário em uma linha

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("O ano de lançamento é: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        //Média calculada em tres notas
        double media = (9.8 + 6.3 + 8.0) /3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com o galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);
        }
    }