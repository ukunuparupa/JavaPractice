class Practice2{
	public static void main(String args[]){
		int a, b, c;
		a = 99;
		b = 100;
		c = 100;
		double ave = (double)(a + b + c) / 3;
		System.out.println(a + "，" + b + "，" + c + "，" + "の平均は" + String.format("%.2f", ave) + "です");
	}
}
