/**
 *  受講生の作ったシェルソートが正しく動作するかの確認プログラム
 *  正しいシェルソートになっていれば、100万件のデータを0.5秒程度で
 *  ソートする筈
 *  ただし、gapの初期値を忘れずに30万程度に変更すること。
 *  gapの初期値が8や4だと、200秒程度の実行時間となってしまう。
 */

import java.util.Random;
import java.util.Arrays;

class Ex3_4_3 {

    private static final int N = 1000000;
    /****************/
    /* main routine */
    /****************/
    public static void main(final String[] args) {

        Random rnd = new Random();
        int[] inputData = new int[N];
        long startTime;
        long elapTime = 0;

        // initialize inputData
        for (int i = 0; i < N; i++) {
            inputData[i] = rnd.nextInt(N);
        }
        int[] originalData = copy(inputData);

        startTime = System.nanoTime();
        shellSort(inputData);
        elapTime = System.nanoTime() - startTime;

        if (checkAnswer(originalData, inputData)) {
            System.out.println("Sorting time for " + N + " data was " + String.format("%,11d", elapTime / 1000) + "micro seconds.");
        } else {
            // Invalid result
            System.out.println("Invalid result !!");
        }
    }


    /*************/
    /* shellSort */
    /*************/
    public static void shellSort(final int[] data) {
        // この下に自分のシェルソートをコピペしてください。
        // ソート対象の配列名が異なる場合には、引数(2行上)のdataを適当な名前に変更すること


        // 重要！！！
        // gapは300000（30万）からスタートして1/2ずつにしていくこと ！！！
        // 重要！！！

    }


    /********/
    /* copy */
    /********/
    public static int[] copy(final int[] inputData) {
        int[] returnData = new int[inputData.length];

        for (int i = 0; i < inputData.length; i++) {
            returnData[i] = inputData[i];
        }
        return returnData;
    }


    /*********/
    /* print */
    /*********/
    public static void print(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + ",");
        }
        System.out.println();
    }


    /*********/
    /* check */
    /*********/
    private static boolean checkAnswer(final int[] originalData, final int[] sortedData) {
        int[] checkData = copy(originalData);
        Arrays.sort(checkData);
        if (Arrays.equals(checkData, sortedData)) {
            return true;
        }
        return false;
    }
}
