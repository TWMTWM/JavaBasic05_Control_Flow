package cn.gtmap.break_control;

public class Test05 {
	/**
	 * ʹ�ñ�ǩ�����ⲿѭ��
	 */
	public static void main(String[] args) {
		//��ӡ����
		outloop: //outloop�����ʾ�ǿ����Զ���ı���outloop1,ol2,out5
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i+":"+j);
				if(0==j%2)
					break outloop;//�����˫���������ⲿѭ��
			}
		}	
	}

}
