class Ex1_4_2{
	//定数系
	static int TABLE_SIZE = 19;
	static int TARGET = 55;

	public static void main(String args[]){
		int[] data = {51, 121, 29, 85, 240, 3, 77, 850, 334, 53};

		//ハッシュ表作成：定数TABLE_SIZEを法として，値を格納する
		//要素がない事は"-1"を用いて表現
		int[] hashTable = new int[TABLE_SIZE];

		//初期化
		for(int i = 0; i < hashTable.length; i++){
			hashTable[i] = -1;
		}

		//dataを格納
		int index = 0;
		for(int i = 0; i < data.length; i++){
			index = data[i] % TABLE_SIZE;
			hashTable[index] = data[i];
		}

		//ハッシュ探索
		int hashValue = TARGET % TABLE_SIZE;
		if(hashTable[hashValue] != -1){
			System.out.println("データ" + TARGET + "は存在します");
		}else{
			System.out.println("データ" + TARGET + "は存在しません");
		}
	}
}
