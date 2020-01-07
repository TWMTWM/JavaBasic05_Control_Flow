package cn.gtmap.for_control;

public class Test01 {
	/**
	 * 1、for
	 * 	比较for和while
	 */
	public static void main(String[] args) {
		//使用while打印0到4
		int i = 0;
		while(i<5){
			System.out.println("while 循环输出的:" + i);
			i++;
		}
		//使用for打印0到4
		for(int j=0;j<5;j++){
			System.out.println("for 循环输出的:" + j);
		}
		
	}
}
