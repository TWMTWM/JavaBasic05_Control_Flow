package cn.gtmap.continue_control;

public class Test01 {
	/**
	 * continue��������һ��ѭ��
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(0==i%2)
				continue;//�����˫��������Ĵ��벻ִ�У�ֱ�ӽ�����һ��ѭ��
			System.out.println(i);
		}
	}

}
