package cn.gtmap.continue_control;
/**
 * ��ϰ�����Ա���
 *	��ӡ 1-100 ֮�����������������Ҫô��3��Ҫô5�ı������ͺ��Ե�
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
