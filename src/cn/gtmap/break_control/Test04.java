package cn.gtmap.break_control;
/**
 * ʹ��boolean���������ⲿѭ��
 */
public class Test04 {
	//����boolean���������ⲿѭ��
	//��Ҫ���ڲ�ѭ�����޸��������ֵ
	//ÿ���ڲ�ѭ�������󣬶�Ҫ���ⲿѭ�����жϣ����������ֵ
	public static void main(String[] args) {
		boolean breakout = false;//�Ƿ���ֹ�ⲿѭ���ı��
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(1+":"+j);
				if(0 == j%2){
					breakout = true;//��ֹ�ⲿѭ���ı������Ϊtrue
					break;
				}
			}
			if(breakout)//�ж��Ƿ���ֹ�ⲿѭ��
				break;
		}
		
	}
}
