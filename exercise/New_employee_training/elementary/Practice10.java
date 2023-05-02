class Practice10{
	public static void main(String args[]){
		int matrixSize = 9;
		int times = 0;
		for(int i; i < matrixSize; i++){
			for(int j; j < matrixSize; j++){
				times = j * j;
				System.out.println(times + "");
			}
		}
	}
}
