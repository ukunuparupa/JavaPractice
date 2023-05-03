class Practice13{
	public static void main(String args[]){
		int matrixSize = 9;
		int times = 0;
		String str = "";

		//カラムを表示
		System.out.print("   ");
		for(int i = 1; i <= matrixSize; i++){
			str = String.format("%3d", i);
			System.out.print(str);
		}
		System.out.println();

		//九九の表を表示
		for(int i = 1; i <= matrixSize; i++){
			str = String.format("%3d", i);
			System.out.print(str);
			for(int j = 1; j <= matrixSize; j++){
				if(j < i){
					System.out.print("   ");
				}else{
					times = i * j;
					str = String.format("%3d", times);
					System.out.print(str);
				}
			}
			System.out.println();
		}
	}
}
