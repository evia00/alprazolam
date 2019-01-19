package main.java.org.fgoduel.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import main.java.org.fgoduel.constants.ServantClass;
import main.java.org.fgoduel.model.Servant;
import main.java.org.fgoduel.playerdata.CharcterData;

public class FileReadUtil {

    static String path = "./servFile";

    /**
     * ファイル読み込み
     * 
     * @param charData
     * @throws IOException
     */
    public static void readServant(CharcterData charData) throws IOException {

        File dir = new File(path);

        String[] filelist = dir.list();

        for (String fileName : filelist) {
            Path filePath = Paths.get(path + "/" + fileName);
            List<String> data = Files.readAllLines(filePath);
            charData.getServants().put(fileName, createServant(data));
        }

    }

    /**
     * キャラデータ作成
     * @param data
     * @return
     */
    private static Servant createServant(List<String> data) {
        Servant servant = new Servant();

        // 1行目：サーヴァント名
        servant.setName(data.get(0));

        // 2行目：クラス
        servant.setServantClass(ServantClass.valueOf(data.get(1)));

        // 3行目：コスト
        servant.setCost(Integer.parseInt(data.get(2)));

        // 4行目：カード
        servant.setCommandCard(ServantUtil.createCommandCard(data.get(4)));

        // 5,6,7行目：スキル
        servant.setSkill(ServantUtil.createSkill(data.get(5), data.get(6), data.get(7)));

        return servant;
    }

}
