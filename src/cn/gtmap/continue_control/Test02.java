package cn.gtmap.continue_control;
/**
 * 练习：忽略倍数
 *	打印 1-100 之间的数，如果这个数，要么是3，要么5的倍数，就忽略掉
 */
public class Test02 {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(0==i%3 || 0==i%5)
				continue;
			System.out.println(i);
		}
	}
}
