package kadai_018;

public abstract class Kato_Chapter18 {

	//フィールド
	public String familyName = "";
	public String givenName = "";
	public String address = "";
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + familyName + "" + givenName + "です");
		System.out.println("住所は" + address + "です");
	}
	
	//個別の紹介を出力する（サブクラス）
	public abstract void eachIntroduce();
	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
}