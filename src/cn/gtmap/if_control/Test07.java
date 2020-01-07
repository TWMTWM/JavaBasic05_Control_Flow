package cn.gtmap.if_control;

import java.util.Scanner;

public class Test07 {
	/**
	 * 练习闰年
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("请输入年份（整数）");
		int inputYear = scan.nextInt();
		if((0==inputYear%4 && 0!=inputYear%100)||(0==inputYear%400)){
			System.out.println(inputYear + "是闰年");
		}else{
			System.out.println(inputYear + "不是闰年");
		}
	}
}
