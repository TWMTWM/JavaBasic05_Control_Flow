package cn.gtmap.comprehensive_exercise;

/**
 * ��ϰ��ˮ�ɻ���
 * ˮ�ɻ������壺
 * 	1. һ����3λ��
 * 	2. ÿһλ��������������ǡ�����������������153=1*1*1+5*5*5+3*3*3
 * 		Ѱ�����е�ˮ�ɻ���
 * @author Administrator
 *
 */
public class Test02 {
	public static void main(String[] args) {
		for (int i = 100; i < 1000; i++) {
			int baiwei = i/100;
			int shiwei = i/10 %10;
			int gewei = i%10;
			int cube = baiwei*baiwei*baiwei + shiwei*shiwei*shiwei + gewei*gewei*gewei;
			if(i==cube){
				System.out.println("�ҵ�ˮ�ɻ�����" + i);
			}
		}
	}
}
