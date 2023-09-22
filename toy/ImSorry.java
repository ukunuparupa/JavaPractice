import java.util.Scanner;

class ImSorry{
	public static void main(String args[]){
		System.out.println("何か言うことない？");

		Scanner input = new Scanner(System.in, "utf-8");
		String str = input.nextLine();

		if(str.equals("ごめん")){
			System.out.println("いいよ");
		}

		System.out.println(str);
	}
}
