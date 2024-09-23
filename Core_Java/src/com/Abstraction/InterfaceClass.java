package com.Abstraction;

interface chessPlayer{
	void moves();  
}

class Queen implements chessPlayer{

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		System.out.println("up "+"down "+"left "+"right "+"Diagonal(in all 4 Direction)");
		
	}
}

class Rook implements chessPlayer{

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		System.out.println("up "+"down "+"left "+"right");
	}
	
}

class King implements chessPlayer{

	@Override
	public void moves() {
		// TODO Auto-generated method stub
		System.out.println("up "+"down "+"left "+"right "+"Diagonal(by 1 step)");
	}
	
}


public class InterfaceClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queen q = new Queen();
		q.moves();
	}

}
