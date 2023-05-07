class Ex3_3_2{
	public static void main(String args[]){
		int[] data = {51, 121, 29, 85, 240, 3, 77, 850, 334, 53};
		int temp = 0;

		//ソート実行
		for(int i = 1; i < data.length; i++){
			temp = data[i];
			for(int j = i - 1; 0 <= j; j--){
				//tempが小さい時にはデータをスライドさせる．
				//本の場所を移動させるイメージ
				if(temp < data[j]){
					data[j + 1] = data[j];

					//先頭と比べていた時には，tempを代入してしまう．
					if(j == 0){
						data[j] = temp;
					}
				}else if(data[j] < temp){
					data[j + 1] = temp;
					break;
				}
			}
		}

		//ソートできたか表示
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + ", ");
		}
	}
}
