class Ex004{
    public static void main(String[] args) {

        // 処理前の時刻を取得
        long startTime = System.currentTimeMillis();

        // 時間計測をしたい処理
		int n = 100;
		int result = 2 * n + 3;
		System.out.println(result);

        // 処理後の時刻を取得
        long endTime = System.currentTimeMillis();
        System.out.println("処理時間：" + (endTime - startTime) + " ms");
    }
}
