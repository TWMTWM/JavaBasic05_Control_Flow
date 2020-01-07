package cn.gtmap.while_control;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/**
		 * 1、练习：阶乘
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入需要计算阶乘的整数：");
		int num = scan.nextInt();
		long result = 1;
		if(0==num)
			result = 1;
		else if(1==num){
			result = 1;
		}else{
			while(num > 1){
				result = result * num;
				num--;
			}
			
		}
		System.out.println(result);
		
	}
}
