package com.kh.goodExam.game;

//랜덤 숫자맞추기 게임 모델
public class GameModel {
	private int secretNumber; //숨겨진 번호 
	private int attempts; // 몇번 시도했는가
	
	public GameModel() {
		//1~100까지의 무작위 숫자 생성하기 
		secretNumber = (int) (Math.random() * 100) + 1;
		attempts = 0;
	}
	public int getSecretNumber() {
		return secretNumber;
	}
	public int getAttempts() {
		return attempts;
	}
	public void incrementAttempts() {
		attempts++;
	}
	public boolean inCorrectGuess(int guess) {
		incrementAttempts();
		//guess가 값을 입력했기 때문에 증가 메소드를 추가
		return guess == secretNumber;
	}
}
