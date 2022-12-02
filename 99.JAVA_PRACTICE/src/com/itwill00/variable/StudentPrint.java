package com.itwill00.variable;
public class StudentPrint {

	public static void main(String[] args) {
		/*
		 * ������������ �л�2�� ����Ÿ�� ���� ��������
		 * 	- ��ȣ(int), �̸�(String), ����, ����, ����, ����, ���(double), ����(A,B,C)(char), ����(int)
		 */
		int num1,num2,ranking,kor1,kor2,eng1,eng2,math1,math2;
		String name1,name2;
		double avg1,avg2,totalScore1,totalScore2;
		char grade;

		
		/*
		 * �л� 2���� �⺻������(��ȣ, �̸�, ����, ����, ����) �Է� 
		 */
		num1 = 1;
		name1 = "���ȣ";
		kor1 = 42;
		eng1 = 56;
		math1 = 78;
		
		num2 = 2;
		name2 = "����";
		kor2 = 45;
		eng2 = 53;
		math2 = 76;
		
		/*
		 * �л� 2���� �⺻������(��ȣ, �̸�, ����, ����, ����)�� �̿��ؼ�
		 * ����, ��� ��� �� ���� (������ F , ������ 0�� ����)
		 */
		totalScore1 = kor1+eng1+math1;
		totalScore2 = kor2+eng2+math2;
		avg1 = totalScore1/3;
		avg2 = totalScore2/3;
		grade = 'F';
		ranking = 0;
		
		/*
		- �������
 		- ����� �Ҽ������� ù°�ڸ����� ����ϼ���
 		- ����,������ ������������
 		
 		--------------�л� �������-------------------
		�й�  �̸�   ���� ���� ���� ���� ��� ���� ����
		-----------------------------------------------
		 1   ���ȣ   42   56   78   334  89   A    3  
		 2   ����   45   53   76   334  78   A    2  
		-----------------------------------------------
		*/
		System.out.println("-----------------�л� �������----------------------");
		System.out.println("�й�  �̸�   ���� ���� ���� ���� ��� ���� ����");
		System.out.println("----------------------------------------------------");
		System.out.printf(" %d   %s   %d   %d   %d   %.0f  %.1f   %s    %d \n",num1,name1,kor1,eng1,math1,totalScore1,avg1,grade,ranking);
		System.out.printf(" %d   %s   %d   %d   %d   %.0f  %.1f   %s    %d \n",num2,name2,kor2,eng2,math2,totalScore2,avg2,grade,ranking);
		System.out.println("----------------------------------------------------");
	}

}