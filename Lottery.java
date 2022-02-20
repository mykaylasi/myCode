package inClassExe;

public class Lottery {
	public static void main(String[] args) {
		
		int lotto = (int)(Math.random()*90) + 10;
		
		int guess = 95;
		
		int guess_1 = guess % 10;
		int guess_2 = guess / 10;
		int lotto_1 = lotto % 10;
		int lotto_2 = lotto / 10;
		
		if (lotto == guess) {
			
			//10000
			
		} else if (guess_1 == lotto_1 || guess_1 == lotto_2 ||
		          guess_2 == lotto_1 || guess_2 == lotto_2) {
			//1000
			
		} else {
			//nothing
		}
	}

}
