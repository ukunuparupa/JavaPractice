class Ex311{
	//素数判定プログラム
	//昔やったからいいかな．
    public static void main(String[] args) {

        // 処理前の時刻を取得
        long startTime = System.currentTimeMillis();

        // 時間計測をしたい処理
		int age  = 27;
		boolean isPrime = true;
		for(int i = 2; i * i < age; i++){
			if(age % i == 0){
				isPrime = false;
			}
		}
		
		if(isPrime){
			System.out.println(age + "は素数.");
		} else {
			System.out.println(age + "は素数じゃあない.");
		}

        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }
}
