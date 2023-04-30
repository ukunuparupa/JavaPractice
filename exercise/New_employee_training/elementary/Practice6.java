class Practice6{
	public static void main(String args[]){
		int[] data = {31, 7, 54, 99, 12, 32, 1, 24, 88, 6};
		int dataLength = data.length;
		int indexNum = 0;
		int sum = 0;

		while(indexNum < dataLength){
			sum += data[indexNum];
			indexNum++;
		}

		System.out.println("合計は" + sum + "です");
	}
}
