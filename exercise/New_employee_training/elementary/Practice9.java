class Practice9{
	public static void main(String args[]){
		int[] data = {31, 7, 54, 99, 12, 32, 1, 24, 88, 6};
		int dataLength = data.length;
		int index = 0;
		int temp = 0;
		int[] resultData = new int[dataLength];

		//配列要素入れ替えする
		for(int i = 0; i < dataLength; i++){
			resultData[dataLength - i - 1] = data[i];
		}

		//出力
		while(index < dataLength){
			System.out.print(resultData[index] + ",");
			index++;
		}
	}
}
