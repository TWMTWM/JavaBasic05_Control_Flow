package cn.gtmap.break_control;
/**
	 假设你月收入是3000，除开平时花销，每个月留下1000块钱进行投资。
		然后你认真的钻研了 《股票和基金 21天从入门到精通》，达到了每年20%的投资回报率。
	那么问题来了，以每个月投资1000块钱的节奏，持续投资多少年，总收入达到100万
	（复利计算按照每年12000投入计算，不按照每月计息）
	复利公式：
	F = p* ( (1+r)^n );
	F 最终收入
	p 本金
	r 年利率
	n 存了多少年
	假设情景一：
	p = 10000
	r = 0.05
	n = 1
	
	解读：
	本金是10000
	年利率是5%
	存了一年 1次
	复利收入 10000*( (1+0.05)^1 ) = 10500
	
	假设情景二：
	p = 10000
	r = 0.05
	n = 2
	解读：
	本金是10000
	年利率是5%
	存了两年
	复利收入 10000*( (1+0.05)^2 ) = 11025
 */
public class Test02 {
	/**
	 * 练习：百万富翁
	 * 第一年：12000*(1+0.2)
	 * 第二年：12000*(1+0.2) + 12000*(1+0.2)^2
	 * 第三年：12000*(1+0.2) + 12000(1+0.2)^2 + 12000(1+0.2)^3
	 * 第四年：12000*(1+0.2) + 12000(1+0.2)^2 + 12000(1+0.2)^3 + 12000(1+0.2)^4
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
			System.out.println("经过" + year + "年，总收入为：" + sum);
			if(sum >= goalIncome){
				System.out.println("一共需要" + year + "年，累计收入超过" + goalIncome);
				break;
			}
		}
	}
}	
