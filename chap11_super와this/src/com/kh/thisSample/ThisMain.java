package com.kh.thisSample;

	/*
	 * 
		int x = 10; //���� x�� 10�� �Ҵ� 
		int y = x; //�������� y x�� ����Ų��.
		
		x = 20;
		
		System.out.println("y : " + y);
		
		int[] list1 = {1,2,3};
		int[] list2 = list1; //list2 list1 
		
	 this �ν��Ͻ� �ڽ��� ����Ű�� �������� �ν��Ͻ��� �ּҰ� ���� 
	 this ��ü(=�ν��Ͻ�) �ڽ��� ����Ű�� ���� ���� ��ü(=�ν��Ͻ�)�� �ּҰ� ����. 
	 this() ���� Ŭ������ �ٸ� �����ڸ� ȣ���ϴµ� ��� 
	 */
	class MyClass {
		int myFeild;
		
		//ù ��° ������
		MyClass() {
			//this.myFeild = 0; //this() ����ؼ� �ٸ� ������ ȣ�� 
			this(0); //this�� ����ؼ� �ٸ� ������ ȣ�� 
		}
		//�� ��° ������
		MyClass(int value) {
			this.myFeild = value;
		}
		void printValue() {
			System.out.println("myFeild�� ��: " + this.myFeild);
		}
	}

public class ThisMain {
	public static void main(String[] args) {
		 MyClass obj1 = new MyClass(); //ù ��° ������ ȣ��
		 MyClass obj2 = new MyClass(); //�� ��° ������ ȣ��
		 
		 obj1.printValue();
		 obj2.printValue();

	}

}











