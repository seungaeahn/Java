package com.kh.classAM;

public class AM {
	public int pNum = 10;
	protected int pNum2 = 20;
	int pNum3 = 30; //���� �����ڸ� �������� ������ �ڵ����� default ������ ����� 
	private int pNum4 = 40;
	
	// ȣ��޼ҵ� �ۼ��ؼ� ���� ȣ���ϱ� 
	
	public void publicMethod() {
		System.out.println("public Method() ȣ�ٵ�");
	}
	
	protected void protectedMethod() {
		System.out.println("protected Method() ȣ���");
	}
	
	void defaultMethod() { //���� �����ڸ� �������� ������ �ڵ����� default ������ �����
		System.out.println("default Method() ȣ���");
	}
	
	private void privateMethod() {
		System.out.println("private Method() ȣ���");
	}
}






