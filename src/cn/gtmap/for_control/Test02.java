package cn.gtmap.for_control;

public class Test02 {
	/**
	 * ��ϰ����ؤҪǮ
	 * �쳯��һ����ؤ�պ飬ȥ����ҪǮ
	 * 	��һ��Ҫ��1��Ǯ
	 * 	�ڶ���Ҫ��2��Ǯ
	 * 	������Ҫ��4��Ǯ
	 * 	������Ҫ��8��Ǯ
	 * 	�Դ�����
	 * 	���⣺ ����ؤ��10�죬�����Ƕ��٣�
	 */
	public static void main(String[] args) {
		int totalMoney = 1;
		int eachDayMoney = 1;
		for (int i = 1; i < 10; i++) {
			eachDayMoney *= 2;
			totalMoney = totalMoney + eachDayMoney;
		}
		System.out.println("����ؤ����10�������ǣ�" + totalMoney);
	}
}
