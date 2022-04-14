package br.edu.univas.vo;

public class Piece {
	
	private int a;
	private int b;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + a + "|" + b + "]";
	}
	
	public Piece(int a, int b) {
		// TODO Auto-generated constructor stub
		this.a = a;
		this.b = b;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
}