class Practice8{
	public static void main(String args[]){
		int[] data1 = {31, 7, 54, 99, 12, 32, 1, 24, 88, 6};
		int[] data2 = {27, 93, 54, 4, 18, 32, 65, 3, 77, 6};
		int dataLength1 = data1.length;
		int dataLength2 = data2.length;
		int index = 0;

		if(dataLength1 == dataLength2){
			while(index < dataLength1){
				int temp;
				if(data1[index] < data2[index]){
					temp = data1[index];
					data1[index] = data2[index];
					data2[index] = temp;
				}
				index++;
			}

			System.out.print("data1 = ");
			for(int i = 0; i < dataLength1; i++){
				System.out.print(data1[i] + ",");
			}
			System.out.println();
			System.out.print("data2 = ");
			for(int i = 0; i < dataLength2; i++){
				System.out.print(data2[i] + ",");
			}
		}
	}
}
