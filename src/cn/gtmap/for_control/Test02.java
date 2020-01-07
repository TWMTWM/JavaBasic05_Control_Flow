package cn.gtmap.for_control;

public class Test02 {
	/**
	 * 练习：乞丐要钱
	 * 天朝有一个乞丐姓洪，去天桥要钱
	 * 	第一天要了1块钱
	 * 	第二天要了2块钱
	 * 	第三天要了4块钱
	 * 	第四天要了8块钱
	 * 	以此类推
	 * 	问题： 洪乞丐干10天，收入是多少？
	 */
	public static void main(String[] args) {
		int totalMoney = 1;
		int eachDayMoney = 1;
		for (int i = 1; i < 10; i++) {
			eachDayMoney *= 2;
			totalMoney = totalMoney + eachDayMoney;
		}
		System.out.println("洪乞丐干了10天收入是：" + totalMoney);
	}
}
