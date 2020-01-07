package cn.gtmap.if_control;

public class Test05 {
	/**
	 * 1、else if 
	 * 	else if是多条件判断
	 */
	public static void main(String[] args) {
		//如果只使用if ，会执行4次判断
		int i = 2;
		if(i==1)
			System.out.println(1);
		if(i==2)
			System.out.println(2);
		if(i==3)
			System.out.println(3);
		if(i==4)
			System.out.println(4);
		//如果使用else if, 一旦在22行，判断成立， 24行和26行的判断就不会执行了，节约了运算资源
		if(i==1)
			System.out.println(1);
		else if(i==2)
			System.out.println(2);
		else if(i==3)
			System.out.println(3);
		else if(i==4)
			System.out.println(4);
	}
}
