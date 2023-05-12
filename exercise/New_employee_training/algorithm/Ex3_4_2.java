class Ex3_4_2{
	public static void main(String args[]){
		int[] data = {13, 28, 10, 40, 42, 57, 27, 25, 66, 3, 18, 54, 7, 20, 33, 5, 12};

		sort(data);
		for(int i = 0; i < data.length; i++){
			System.out.print(data[i] + ", ");
		}
	}

	//入力値のint配列を昇順ソートする
	//Ex3_3_2の挿入ソートをそのまま実行
	//
	//入力値：昇順にソートしたいint配列
	//出力値：なし
	static void sort(int[] data){
		int temp = 0;

		for(int i = 1; i < data.length; i++){
			temp = data[i];
			for(int j = i - 1; 0 <= j; j--){
				//tempが小さい時にはデータをスライドさせる．
				//本の場所を移動させるイメージ
				if(temp < data[j]){
					data[j + 1] = data[j];

					//先頭に来た時には，tempを代入してしまう．
					if(j == 0){
						data[j] = temp;
					}
				}else if(data[j] < temp){
					data[j + 1] = temp;
					break;
				}
			}
		}
	}
}
