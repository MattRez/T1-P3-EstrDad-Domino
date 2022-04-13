package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	
	/*
	1.Seu programa deve ser um jogo de Dominó.
	2.O player 1 é o próprio computador e o player 2 é um humano.
	3.Cada peça deve ser representada por um objeto contendo 2 números inteiros,representando os dois números da peça.
	4.O programa deve possuir 3 listas (duplamente encadeadas):
		1.uma lista com as peças do player do computador
		2.uma lista com as peças do player humano.
		3.uma lista com as peças que foram jogadas.
	5.A cada jogada feita o programa deve imprimir a lista de peças jogadas.
	6.Ao iniciar, programa deve fazer a distribuição aleatória de todas peças.
	7.O programa deve ler do teclado das opções disponíveis no jogo:
		1.Ler a peça que o humano escolhe jogar – para isso é necessário imprimir todas aspeças disponíveis do humano.
		2.Escolher a opção para o humano passar a vez.
	8.Caso o computador não tiver peça disponível, ele deve indicar que passou a vez.
	9.O programa deve imprimir o player vencedor, quando chegar ao final do jogo.
	10.Fazer as validações necessárias para o jogo não entrar em um estado inconsistente.
	11.Anotar no arquivo README.md as decisões não especificadas nesta descrição.
	(Extra) Pensar em uma estratégia para deixar o computador mais “inteligente” para tentarganhar o jogo, sem que “ele” saiba as peças que o humano possui.
	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List list = new List();
		list.addPiece(scan);
		
		scan.close();
	}
}
