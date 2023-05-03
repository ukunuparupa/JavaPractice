class Ex1_2_2{
	public static void main(String args[]){
		int[] data = {13, 24, 8, 67, 42, 9, 33, 92, 24, 57, -1};
		int index = 0;
		int dataLength = data.length;
		int target = 9;
		int sentinel = -1;

		while(sentinel != data[index]){
			if(target == data[index]){
				System.out.println("データ" + target + "は添え字" + index + "の位置に存在します");
				break;
			}
			index++;
		}

		if(index + 1 == dataLength){
			System.out.println("データ" + target + "は存在しません");
		}
	}
}
