package cn.gtmap.if_control;

public class Test05 {
	/**
	 * 1��else if 
	 * 	else if�Ƕ������ж�
	 */
	public static void main(String[] args) {
		//���ֻʹ��if ����ִ��4���ж�
		int i = 2;
		if(i==1)
			System.out.println(1);
		if(i==2)
			System.out.println(2);
		if(i==3)
			System.out.println(3);
		if(i==4)
			System.out.println(4);
		//���ʹ��else if, һ����22�У��жϳ����� 24�к�26�е��жϾͲ���ִ���ˣ���Լ��������Դ
		if(i==1)
			System.out.println(1);
		else if(i==2)
			System.out.println(2);
		else if(i==3)
			System.out.println(3);
		else if(i==4)
			System.out.println(4);
	}
}