package cn.gtmap.if_control;

public class Test02 {
	/**
	 * 2������ʽ��һ�����ʽ
	 */
	public static void main(String[] args) {
		boolean b = false;
		//����ж�����ʽ�������ô�������������
		if(b){
			System.out.println("yes1");
			System.out.println("yes2");
			System.out.println("yes3");
		}
		
		//������ʽ2 3 ����b�Ƿ�Ϊtrue����ִ��
		if(b)
			System.out.println("yes4");
			System.out.println("yes5");
			System.out.println("yes6");
			
		//���ֻ��һ�����ʽ���Բ���д����������ȥ���ԼһЩ	
		if(b){
			System.out.println("yes7");
		}
		if(b)
			System.out.println("yes8");
	}

}

