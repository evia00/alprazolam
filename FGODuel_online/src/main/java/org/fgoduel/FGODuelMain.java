package main.java.org.fgoduel;

import java.io.IOException;

import main.java.org.fgoduel.playerdata.CharcterData;
import main.java.org.fgoduel.util.FileReadUtil;

public class FGODuelMain {

    public static void main(String[] args) {
        //メイン処理

        CharcterData charcters = new CharcterData();
        try {
            FileReadUtil.readServant(charcters);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        for (String key : charcters.getServants().keySet()) {
            System.out.println(charcters.getServants().get(key));
        }
    }

}
