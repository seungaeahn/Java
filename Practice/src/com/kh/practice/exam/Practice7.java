package com.kh.practice.exam;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		/*
		 �� ������ �����ϳ�, 1�̸��� ���ڰ� �ԷµǾ��ٸ�
		 "1 �̻��� ���ڸ� �Է����ּ���"�� ��µǸ鼭 �ٽ� ����� ���� �Է��ϵ��� �ϼ���.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���: ");
		int num = sc.nextInt();
		
		// 1. ���� �� ����� boolean ���� = true or false;
		while() { // 2. ���� �߰��ϱ� 
			if(num < 1) {
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.println(i);
				}
				// 3. ���� false ����� 
			} 
		}
	}

}
