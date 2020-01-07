package cn.gtmap.break_control;

/**
 * break; 只能结束当前循环
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//打印单数
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+":"+j);
				if(0==j%2)
					break;//如果是双数，结束当前循环
			}
		}
		
		
		
	}
}
