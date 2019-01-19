package main.java.org.fgoduel.constants;

public enum ServantClass {

    SAVER("SAVER"), ARCHER("ARCHER"), LANCER("LANCER");

    // フィールドの定義
    private String serClass;

    // コンストラクタの定義
    private ServantClass(String serClass) {
        this.serClass = serClass;
    }

    // 値取得
    public String getValue() {
        return serClass;
    }
}
