package cn.gtmap.case_control;

import java.util.Scanner;

public class Test02 {
	/**
	 * ��ϰ��switch �����·ݣ��жϼ���
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�������·ݣ�");
		int inputMonth = scan.nextInt();
		String season;
		switch(inputMonth){
			case 1:
			case 2:
			case 3:
				season = "����";
				break;
			case 4:
			case 5:
			case 6:
				season = "����";
				break;
			case 7:
			case 8:
			case 9:
				season = "����";
				break;
			case 10:
			case 11:
			case 12:
				season = "����";
				break;
			default:
				season = "��JB����˰�";
		}
		System.out.println(season);
	}

}
