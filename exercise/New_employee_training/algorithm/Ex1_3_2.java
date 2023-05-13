class Ex1_3_2{
	public static void main(String args[]){
		int[] data = {3, 8, 12, 21, 30, 45, 49, 69, 71, 99};
		int target = 71;
		int dataLength = data.length;
		int low = 0;
		int high = dataLength - 1;
		int mid = (low + high) / 2;

		while(target != data[mid]){
			mid = (low + high) / 2;
			if(target == data[mid]){
				System.out.println("データ" + target + "は添え字" + mid + "の位置に存在します");
				break;
			}else if(target < data[mid]){
				high = mid - 1;
			}else{
				low = mid + 1;
			}

			if(high < low){
				System.out.println("データ" + target + "は存在しません");
				break;
			}
		}
	}
}
