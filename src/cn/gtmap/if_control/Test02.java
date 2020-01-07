package cn.gtmap.if_control;

public class Test02 {
	/**
	 * 2、多表达式与一个表达式
	 */
	public static void main(String[] args) {
		boolean b = false;
		//如果有多个表达式，必须用大括弧包括起来
		if(b){
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		
		//否则表达式2 3 无论b是否为true都会执行
		if(b)
			System.out.println("yes4");
			System.out.println("yes5");
			System.out.println("yes6");
			
		//如果只有一个表达式可以不用写括弧，看上去会简约一些	
		if(b){
			System.out.println("yes7");
		}
		if(b)
			System.out.println("yes8");
	}

}

