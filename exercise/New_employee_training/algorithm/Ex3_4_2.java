class Ex3_4_2{
	public static void main(String args[]){
		int[] data = {13, 28, 10, 40, 42, 57, 27, 25, 66, 3, 18, 54, 7, 20, 33, 5, 12};
		int mod = 9;
		int temp = 0;

		while(0 < mod){
			//挿入ソート
			//modを法とした配列だけを並べ替える．
			for(int i = 1; i < data.length; i++){
				temp = data[i];
				for(int j = i - mod; 0 <= j; j -= mod){
					if(temp < data[j]){
						data[j + mod] = data[j];

						//先頭に来た時には，tempを代入してしまう．
						if(j <= mod){
							data[j] = temp;
						}
					}else if(data[j] <= temp){
						data[j + mod] = temp;
						break;
					}
				}
			}
			mod = mod / 2;
		}

		//処理結果表示
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + ",");
		}
	}
}
