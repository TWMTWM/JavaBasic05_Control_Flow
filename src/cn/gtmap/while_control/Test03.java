package cn.gtmap.while_control;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		/**
		 * 1����ϰ���׳�
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("��������Ҫ����׳˵�������");
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
