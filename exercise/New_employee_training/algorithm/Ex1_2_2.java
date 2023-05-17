class Ex1_2_2{
	public static void main(String args[]){
		int[] data = {13, 24, 8, 67, 42, 9, 33, 92, 24, 57, -1};
		int index = 0;
		int dataLength = data.length;
		int target = 57;

		//番兵を設定
		data[data.length - 1] = target;

		while(target != data[index]){
			index++;
		}

		if(data.length - 1 <= index){
			System.out.println("データ" + target + "は存在しません");
		}else {
			System.out.println("データ" + target + "は添え字" + index + "の位置に存在します");
		}
	}
}
