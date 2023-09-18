package com.kh.IteratorMain;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorMain {
/*
 * Iterator
 * 	�÷���(������ �׷�)�� �ݺ�(iterator)�ϸ鼭 ��ҿ� �����ϴµ� ���Ǵ� �������̽�
 *  �پ��� �÷��� ����(ArrayList, HashSet� ����� �� ���� 
 *  �÷����� ��Ҹ� �а� �����ϴµ� ���
 *  �÷����� ũ�⳪ ���� ������ ������� ��ҿ� ������ �� ����
 */
	public static void main(String[] args) {
		
		//ArrayList ���� �� ��� �߰� 
		ArrayList<String> music = new ArrayList<>();
		music.add("�߶��");
		music.add("����");
		music.add("Ʈ��Ʈ");
		
		//Iterator ����
		Iterator<String> iter = music.iterator();
		
		//Iterator�� �����Ͽ� ��� �ݺ� 
		while(iter.hasNext()) {
			String msc = iter.next();
			System.out.println(msc);
		}	
		//Iterator ����Ͽ� ��� ����
		iter = music.iterator(); //�ٽ� iterator �ʱ�ȭ
		while(iter.hasNext()) {
			String msc = iter.next();
			//���࿡ Ʈ��Ʈ�� ������ �����ϱ� ���� 
			if (msc.equals("Ʈ��Ʈ")) {
				iter.remove(); //���� ��� ����
			}
		}
		//���� �� ArrayList ����
		System.out.println("���� �� ���");
		for(String a : music) {
			System.out.println(a);
		}
	}

}