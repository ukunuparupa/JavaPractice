class Practice5_1{
	public static void main(String args[]){
		int year = 2000;
		int isUruuYear = 0;
		if(year % 400 == 0){
			isUruuYear = 1;

			if(year % 100 == 0){
				isUruuYear = 0;

				if(year % 4 == 0){
					isUruuYear = 1;

				}else{
					isUruuYear = 0;
				}
			}else{
				isUruuYear = 1;
			}
		}else{
			isUruuYear = 0;
		}

		if(isUruuYear == 1){
			System.out.println(year + "はうるう年です");
		}else{
			System.out.println(year + "は平年です");
		}
	}
}
