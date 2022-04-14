package br.edu.univas.main;

import java.util.ArrayList;
import java.util.Scanner;

import br.edu.univas.vo.Piece;

public class StartApp {
	
	/*
	1.Seu programa deve ser um jogo de Domin�.
	2.O player 1 � o pr�prio computador e o player 2 � um humano.
	3.Cada pe�a deve ser representada por um objeto contendo 2 n�meros inteiros,representando os dois n�meros da pe�a.
	4.O programa deve possuir 3 listas (duplamente encadeadas):
		1.uma lista com as pe�as do player do computador
		2.uma lista com as pe�as do player humano.
		3.uma lista com as pe�as que foram jogadas.
	5.A cada jogada feita o programa deve imprimir a lista de pe�as jogadas.
	6.Ao iniciar, programa deve fazer a distribui��o aleat�ria de todas pe�as.
	7.O programa deve ler do teclado das op��es dispon�veis no jogo:
		1.Ler a pe�a que o humano escolhe jogar � para isso � necess�rio imprimir todas aspe�as dispon�veis do humano.
		2.Escolher a op��o para o humano passar a vez.
	8.Caso o computador n�o tiver pe�a dispon�vel, ele deve indicar que passou a vez.
	9.O programa deve imprimir o player vencedor, quando chegar ao final do jogo.
	10.Fazer as valida��es necess�rias para o jogo n�o entrar em um estado inconsistente.
	11.Anotar no arquivo README.md as decis�es n�o especificadas nesta descri��o.
	(Extra) Pensar em uma estrat�gia para deixar o computador mais �inteligente� para tentarganhar o jogo, sem que �ele� saiba as pe�as que o humano possui.
	*/
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		List list = new List();
		
		populatePieceList(scan);
		
		scan.close();
	}
	
	public static List populatePieceList(Scanner scan) {
		List pieces = new List();
		
		int cont = 0;
		
		for(int i=0; i<7; i++) {// 7 = 0 a 6
			for(int j=0; j<7; j++) {// 7 = 0 a 6
				if(i<=j) {
					Piece piece = new Piece(i, j);
					pieces.addPiece(piece, scan);
					System.out.println("Pe�a " + (cont+1) + " " + piece.toString());
					cont++;
				}
			}
		}
		return pieces;
	}
}
