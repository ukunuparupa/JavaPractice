class Practice4{
	public static void main(String args[]){
		int a, b;
		a = 12;
		b = 14;
	
		int diff;
		if(a > b){
			diff = a - b;
			System.out.println(a + "，" + b + "のうち小さいのは" + b + "で，" + a + "より" + diff + "小さいです");
		} else if(b > a){
			diff = b - a;
			System.out.println(a + "，" + b + "のうち小さいのは" + a + "で，" + b + "より" + diff + "小さいです");
		} else{
		}
	}
}
