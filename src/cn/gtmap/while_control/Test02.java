package cn.gtmap.while_control;

public class Test02 {
	/**
	 * do-while：
	 * 	与while的区别是，无论是否成立，先执行一次，再进行判断
	 */
	public static void main(String[] args) {
		//打印0到4
		//与while的区别是，无论是否成立，先执行一次，再进行判断
		int i = 0;
		do{
			System.out.println(i);
			i++;
		}while(i<5);
		
			
	}

}
