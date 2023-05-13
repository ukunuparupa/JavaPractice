class Ex3_1_2{
	public static void main(String args[]){
		int[] data = {51, 121, 29, 85, 240, 3, 77, 850, 334, 53};
		int dataLength = data.length;
		int temp = 0;

		//バブルソート
		for(int i = dataLength; 0 < i; i--){
			for(int j = 0; j < i - 1; j++){
				if(data[j + 1] < data[j]){
					temp = data[j];
					data[j] = data[j + 1];
					data[j + 1] = temp;
				}
			}
		}

		//ソートできたか表示
		for(int i = 0; i < dataLength; i++){
			System.out.print(data[i] + ", ");
		}
	}
}
