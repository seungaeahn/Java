package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice3 {

	public static void main(String[] args) {
		//키보드 가로, 세로 값을 실수형으로 입력 받아 사각형의 면적과 둘레를 계산하여 출력하세요.
				Scanner sc = new Scanner(System.in);
				double width, height;
				System.out.println("가로의 길이는?");
				width = sc.nextDouble();
				System.out.println("세로의 길이는?");
				height = sc.nextDouble();
				
				System.out.println("가로: "+ width + " 세로: " + height);
				
				double area = width * height ;
				System.out.println("면적:  " + area);
				double length =  2*(width+height);
				System.out.println("둘레: " + length );

	}

}
