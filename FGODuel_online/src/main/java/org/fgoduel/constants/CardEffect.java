package main.java.org.fgoduel.constants;

/**
 * カード属性定数
 * 
 * @author reflex
 *
 */

public enum CardEffect {

    Arts('A'), Quick('Q'), Buster('B');

    // フィールドの定義
    private char id;

    // コンストラクタの定義
    private CardEffect(char id) {
        this.id = id;
    }
    
    // 値取得
    public char getValue() {
        return id;
    }

}
