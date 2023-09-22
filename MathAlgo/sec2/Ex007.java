class Ex007{
	public static void main(String args[]){
        // 処理前の時刻を取得
        long startTime = System.currentTimeMillis();

		//計測対象処理
		double n = Math.pow(10, 6);
		int x = 2;
		int y = 3;

		int cnt = 0;
		for (int i = 1; i <= n; i++){
			if(i % x == 0 || i % y == 0){
				cnt++;
			}
		}
		System.out.println(cnt);

        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
	}
}
