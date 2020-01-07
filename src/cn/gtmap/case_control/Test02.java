package cn.gtmap.case_control;

import java.util.Scanner;

public class Test02 {
	/**
	 * 练习：switch 输入月份，判断季节
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入月份：");
		int inputMonth = scan.nextInt();
		String season;
		switch(inputMonth){
			case 1:
			case 2:
			case 3:
				season = "春天";
				break;
			case 4:
			case 5:
			case 6:
				season = "夏天";
				break;
			case 7:
			case 8:
			case 9:
				season = "秋天";
				break;
			case 10:
			case 11:
			case 12:
				season = "冬天";
				break;
			default:
				season = "又JB输错了吧";
		}
		System.out.println(season);
	}

}
