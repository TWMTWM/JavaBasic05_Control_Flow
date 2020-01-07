package cn.gtmap.break_control;

public class Test05 {
	/**
	 * 使用标签结束外部循环
	 */
	public static void main(String[] args) {
		//打印单数
		outloop: //outloop这个标示是可以自定义的比如outloop1,ol2,out5
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+":"+j);
				if(0==j%2)
					break outloop;//如果是双数，结束外部循环
			}
		}	
	}

}
