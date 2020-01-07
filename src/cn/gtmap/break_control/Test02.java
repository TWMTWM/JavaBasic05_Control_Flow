package cn.gtmap.break_control;
/**
	 ��������������3000������ƽʱ������ÿ��������1000��Ǯ����Ͷ�ʡ�
		Ȼ��������������� ����Ʊ�ͻ��� 21������ŵ���ͨ�����ﵽ��ÿ��20%��Ͷ�ʻر��ʡ�
	��ô�������ˣ���ÿ����Ͷ��1000��Ǯ�Ľ��࣬����Ͷ�ʶ����꣬������ﵽ100��
	���������㰴��ÿ��12000Ͷ����㣬������ÿ�¼�Ϣ��
	������ʽ��
	F = p* ( (1+r)^n );
	F ��������
	p ����
	r ������
	n ���˶�����
	�����龰һ��
	p = 10000
	r = 0.05
	n = 1
	
	�����
	������10000
	��������5%
	����һ�� 1��
	�������� 10000*( (1+0.05)^1 ) = 10500
	
	�����龰����
	p = 10000
	r = 0.05
	n = 2
	�����
	������10000
	��������5%
	��������
	�������� 10000*( (1+0.05)^2 ) = 11025
 */
public class Test02 {
	/**
	 * ��ϰ��������
	 * ��һ�꣺12000*(1+0.2)
	 * �ڶ��꣺12000*(1+0.2) + 12000*(1+0.2)^2
	 * �����꣺12000*(1+0.2) + 12000(1+0.2)^2 + 12000(1+0.2)^3
	 * �����꣺12000*(1+0.2) + 12000(1+0.2)^2 + 12000(1+0.2)^3 + 12000(1+0.2)^4
	 */
	public static void main(String[] args) {
		int eachYearInvestment = 12000;
		double investmentRate = 0.2;
		double investmentIncome;
		int goalIncome = 1000000;
		int sum = 0;
		for (int year = 1; year < 100; year++) {
			double compoundInterestRate = 1;
			for(int i = 0;i<year;i++){
				compoundInterestRate = compoundInterestRate*(1 + investmentRate);
			}
			investmentIncome = eachYearInvestment * compoundInterestRate;
			sum += investmentIncome;
			System.out.println("����" + year + "�꣬������Ϊ��" + sum);
			if(sum >= goalIncome){
				System.out.println("һ����Ҫ" + year + "�꣬�ۼ����볬��" + goalIncome);
				break;
			}
		}
	}
}	
