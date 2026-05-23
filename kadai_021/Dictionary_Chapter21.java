package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    // フィールド
    private HashMap<String, String> map;

    // コンストラクタ
    public Dictionary_Chapter21() {

        map = new HashMap<>();

        initItem();
    }

    // 初期データ登録
    public void initItem() {

        map.put("apple", "りんご");
        map.put("peach", "桃");
        map.put("banana", "バナナ");
        map.put("lemon", "レモン");
        map.put("pear", "梨");
        map.put("kiwi", "キウイ");
        map.put("strawberry", "いちご");
        map.put("grape", "ぶどう");
        map.put("muscat", "マスカット");
        map.put("cherry", "さくらんぼ");
    }
    // 単語検索(containsKey)
    public void searchWord(String word) {

        if (map.containsKey(word)) {

            System.out.println(word + " の意味は " + map.get(word));

        } else {

            System.out.println(word + " は辞書に存在しません");

        }
    }
}