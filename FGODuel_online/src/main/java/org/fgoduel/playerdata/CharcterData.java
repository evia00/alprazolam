package main.java.org.fgoduel.playerdata;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;
import main.java.org.fgoduel.model.Servant;

@Data
public class CharcterData {

    public CharcterData() {
        servants = new HashMap<String, Servant>();
    }

    /** 読み込みサーヴァントデータ */
    private Map<String, Servant> servants;
}
