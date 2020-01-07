package cn.gtmap.if_control;

/**
 * 3、if 使用过程中可能遇到的坑
 *
 */
public class Test03 {
	public static void main(String[] args) {
		/**
		 * 在第16行，if后面有一个分号; 而分号也是一个完整的表达式
		 * 	如果b为true，会执行这个分号，然后打印yes
		 * 	如果b为false，不会执行这个分号，然后打印yes
		 * 	这样，看上去无论如何都会打印yes
		 */
		boolean b = false;
		if(b);
		System.out.println("yes");
	}
}
