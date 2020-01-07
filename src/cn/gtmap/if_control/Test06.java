package cn.gtmap.if_control;

import java.util.Scanner;

public class Test06 {
	/**
	 * 练习：BMI 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入体重（kg）:");
		float weight = scan.nextFloat();
		System.out.println("请输入身高（m）:");
		float height = scan.nextFloat();
		//BMI计算公式：
		double BMI = weight/(height*height);
		System.out.println("您的BMI指标是：" + BMI);
		//进行判断
		if(BMI<18.5)
			System.out.println("体重过轻");
		else if(BMI>=18.5 && BMI<24)
			System.out.println("正常范围");
		else if(BMI>=24 && BMI<27)
			System.out.println("体重过重");
		else if(BMI>=27 && BMI<30)
			System.out.println("轻度肥胖");
		else if(BMI>=30 && BMI<35)
			System.out.println("中度肥胖");
		else if(BMI>=35)
			System.out.println("重度肥胖");	
	}

}
