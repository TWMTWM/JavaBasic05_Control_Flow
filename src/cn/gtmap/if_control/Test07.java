package cn.gtmap.if_control;

import java.util.Scanner;

public class Test07 {
	/**
	 * ��ϰ����
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("��������ݣ�������");
		int inputYear = scan.nextInt();
		if((0==inputYear%4 && 0!=inputYear%100)||(0==inputYear%400)){
			System.out.println(inputYear + "������");
		}else{
			System.out.println(inputYear + "��������");
		}
	}
}
