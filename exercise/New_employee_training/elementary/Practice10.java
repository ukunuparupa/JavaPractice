class Practice10{
	public static void main(String args[]){
		int matrixSize = 9;
		int times = 0;
		String str = "";
		for(int i = 1; i <= matrixSize; i++){
			for(int j = 1; j <= matrixSize; j++){
				times = i * j;
				str = String.format("%3d", times);
				System.out.print(str);
			}
			System.out.println();
		}
	}
}
