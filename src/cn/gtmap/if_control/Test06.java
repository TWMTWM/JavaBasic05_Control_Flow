package cn.gtmap.if_control;

import java.util.Scanner;

public class Test06 {
	/**
	 * ��ϰ��BMI 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("���������أ�kg��:");
		float weight = scan.nextFloat();
		System.out.println("��������ߣ�m��:");
		float height = scan.nextFloat();
		//BMI���㹫ʽ��
		double BMI = weight/(height*height);
		System.out.println("����BMIָ���ǣ�" + BMI);
		//�����ж�
		if(BMI<18.5)
			System.out.println("���ع���");
		else if(BMI>=18.5 && BMI<24)
			System.out.println("������Χ");
		else if(BMI>=24 && BMI<27)
			System.out.println("���ع���");
		else if(BMI>=27 && BMI<30)
			System.out.println("��ȷ���");
		else if(BMI>=30 && BMI<35)
			System.out.println("�жȷ���");
		else if(BMI>=35)
			System.out.println("�ضȷ���");	
	}

}
