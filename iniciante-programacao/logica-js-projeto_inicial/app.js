alert('Boas vindas ao jogo do número secreto!');
let numeroSecreto = 5;
console.log(numeroSecreto)
let chute = prompt('Escolha um número entre 1 a 10');

// se o chute for igual a numero secreto
if (chute == numeroSecreto) {
    alert(`Isso aí! Você descobriu o número secreto ${numeroSecreto}!`);
                                                    //template strings
} else {
    alert('Você errou! :(');
}