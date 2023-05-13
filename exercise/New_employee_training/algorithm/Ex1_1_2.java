class Ex_1_1_2{
	public static void main(String args[]){
		int[] data = {13, 24, 8, 67, 42, 9, 33, 92, 24, 57};
		int target = 100;
		int dataLength = data.length;
		int index = 0;

		while(index < dataLength){
			if(target == data[index]){
				System.out.println("データ" + target + "は添え字" + index + "の位置に存在します");
				break;
			}
			index++;
		}

		if(index == dataLength){
			System.out.println("データ" + target + "は存在しません");
		}
	}
}
