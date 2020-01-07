package cn.gtmap.comprehensive_exercise;

/**
 * 
 * i + j = 8
 * +
 * x - y = 6
 * 
 * =   =
 * 14  10
 * 
 */
public class Test03 {
	public static void main(String[] args) {
		
		int i = 0;
		int j = 0;
		int x = 0;
		int y = 0;
		for ( i = -100; i < 100; i++) {
			for ( j = -100; j < 100; j++) {
				for ( x = -100; x < 100; x++) {
					for ( y = -100; y < 100; y++) {
						if((i+j==8) && (i+x==14) && (j+x==10)&& (x-y==6)){
							System.out.println("i:"+i);
							System.out.println("j:"+j);
							System.out.println("x:"+x);
							System.out.println("y:"+y);
						}
					}
				}
			}
		}
				
	}
}
