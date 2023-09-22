import java.util.ArrayList;
import java.util.List;

class Ex312{
	private static final int FIRST_PRIME_NUMBER = 2;
	//素因数分解
	//昔やったからいいかな．
    public static void main(String[] args) {

        // 処理前の時刻を取得
        long startTime = System.currentTimeMillis();

        // 時間計測をしたい処理
		int n  = 513212;
		List<Integer> insuuList = new ArrayList<Integer>();
		for(int i = FIRST_PRIME_NUMBER; i * i <= n; i++){
			if(n % i == 0 && isPrimeNum(i)){
				insuuList.add(i);
			}
		}
		
		//素因数分解の表示
		for(Integer num : insuuList){
			System.out.print(num + ", ");
		}
		System.out.println();

        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }
	static private boolean isPrimeNum (int n){
		for(int i = FIRST_PRIME_NUMBER; i * i <= n; i++){
			if(n % i == 0){
				return false;
			}
		}

		return true;
	}
}
