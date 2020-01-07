package cn.gtmap.break_control;

public class Test01 {
	/**
	 * break:结束循环
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(0==i%2)
				break;//如果是双数，直接结束循环
			System.out.println(i);
		}
	}
}
