package kadai_021;


public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		//インスタンスの作成
		Dictionary_Chapter21 manager = new Dictionary_Chapter21();
		
		//調べる英単語を配列に格納
		String[] words = {
				"apple",
				"banana",
				"grape",
				"orange"
		};
		
        for (String word : words) {

        	manager.searchWord(word);

        }
	}
}
