package cn.gtmap.break_control;

/**
 * break; ֻ�ܽ�����ǰѭ��
 *
 */
public class Test03 {
	public static void main(String[] args) {
		//��ӡ����
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+":"+j);
				if(0==j%2)
					break;//�����˫����������ǰѭ��
			}
		}
		
		
		
	}
}
