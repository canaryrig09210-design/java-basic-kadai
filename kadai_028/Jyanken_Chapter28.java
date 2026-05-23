package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	
    private HashMap<String, String> map;
    
    // コンストラクタ
    public Jyanken_Chapter28() {
        map = new HashMap<>();
        initItem();
    }

    // 初期データ登録
    public void initItem() {
    	map.put("r","グー");
    	map.put("s","チョキ");
    	map.put("p","パー");
    }
    
	public String getMyChoice() {
		//自分の手を入力
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	    //Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		//入力内容を取得
		String input = scanner.next();
		//入力内容を出力する
		System.out.println(input);
		return input;

	}
	public String getRandom() {
		//対戦相手のじゃんけんの手を乱数で選ぶ
		int random = (int) Math.floor(Math.random() * 3);
		
		if(random == 0) {
			return "r";
		} else if (random == 1) {
			return "s";
		} else {
			return "p";
		}
	}
	//じゃんけんを行う
	public void playGame() {
		String myChoice = getMyChoice();
		String enemyChoice = getRandom();
		
		System.out.print("自分の手は" + map.get(myChoice) + ",");
		System.out.println("対戦相手の手は" + map.get(enemyChoice));
		
		//勝敗判定
		if(myChoice.equals(enemyChoice)) {
			System.out.println("あいこです");
		}else if (
				(myChoice.equals("r") && enemyChoice.equals("s")) ||
				(myChoice.equals("s") && enemyChoice.equals("p")) ||
				(myChoice.equals("p") && enemyChoice.equals("g")) 
				) {
			System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	}

}
