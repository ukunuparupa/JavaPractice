import java.util.ArrayList;
import java.util.List;

class Ex322{
	public static void main(String args[]){
        // 処理前の時刻を取得
        long startTime = System.currentTimeMillis();

        // 時間計測をしたい処理
		List<Integer> numberList = new ArrayList<Integer>();
		numberList.add(372);
		numberList.add(506);

		System.out.println(getGCDList(numberList));

        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
	}

	/**
	 * n個の正の整数の最大公約数を計算するプログラム
	 */
	static Integer getGCDList(List<Integer> numberList){
		Integer r = 0;
		for(int i = 1; i < numberList.size(); i++){
			r = getGCD(numberList.get(i-1), numberList.get(i));
		}
		return r;
	}

	/**
	 * ユークリッドの互除法を用いた，2個の正の整数の最大公約数を計算するプログラム
	 */
	static Integer getGCD(Integer a, Integer b){
		//変数が非負整数出ないときにエラーを返す
		if(a < 0 || b < 0){
			return -1;
		}

		Integer r = -1;
		while(r != 0){
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}
}
