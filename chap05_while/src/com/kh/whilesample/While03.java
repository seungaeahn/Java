package com.kh.whilesample;

public class While03 {

	public static void main(String[] args) {
		// �ݺ������� ���
		/*int i = 1;
		while (i <=5) { //i�� 5���� �۰ų� ���� �� true
			//���ڰ� 5�� �� �� ����� ���߰��� �� 
			System.out.println(i); //�� �ε�ȣ�� ���� ��� ���
			i = i + 1;
			
		}
		*/
		int i = 1;
		while (i <=10) { 
			
			System.out.println(i); 
			i = ++i;
			/*
			 i++�϶� i�� 1�� ���� ���� �����g�� ������ ++�� �۵����� ����
			 ���ѷ��� �߻�
			 ++i�� ���� i�� +1�� ���� ����
			 1~10���� ��°���
			 ���ѷ����� �߻����� ���� 
			 */
			
		}

	}

}