package cn.gtmap.continue_control;

public class Test01 {
	/**
	 * continue：继续下一次循环
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(0==i%2)
				continue;//如果是双数，后面的代码不执行，直接进行下一次循环
			System.out.println(i);
		}
	}

}
