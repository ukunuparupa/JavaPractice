class Practice7{
	public static void main(String args[]){
		int[] data1 = {31, 7, 54, 99, 12, 32, 1, 24, 88, 6};
		int[] data2 = {27, 93, 54, 4, 18, 32, 65, 3, 77, 6};

		int dataLength1 = data1.length;
		int dataLength2 = data2.length;
		if(dataLength1 == dataLength2){
			int indexNum = 0;
			int diff = 0;
			
			while(indexNum < dataLength1){
				diff = data1[indexNum] - data2[indexNum];

				if(0 < diff){
					System.out.println("大きいのは data1 です");
				}else if(diff < 0){
					System.out.println("大きいのは data2 です");
				}else{
					System.out.println("data1 と data2 は等しいです");
				}

				indexNum++;
			}
		}
	}
}
