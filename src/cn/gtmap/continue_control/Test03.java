package cn.gtmap.continue_control;

public class Test03 {
	/**
	 * break:����ѭ��
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if(0==i%2)
				break;//�����˫����ֱ�ӽ���ѭ��
			System.out.println(i);
		}
	}
}
