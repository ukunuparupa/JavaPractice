class TestEnum{
	public static void main (String args[]){

		for(Fruit frt : Fruit.values()){
			System.out.println(frt.ordinal() + ":" + frt.name() + "," + frt.getValue());
		}

			Fruit fruit = Fruit.Orange;
			System.out.println(fruit.getValue());
	}

	protected enum Fruit{
		Orange("Ehime"),
		Apple("Aomori"),
		Melon("Ibaraki");

		//フィールドを定義
		private String name;

		//コンストラクタを定義
		private Fruit(String name){
			this.name = name;
		}

		//メソッド
		public String getValue(){
			return this.name;
		}
	}
}
