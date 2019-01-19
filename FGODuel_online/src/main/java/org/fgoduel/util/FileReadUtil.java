package main.java.org.fgoduel.util;

import java.io.IOException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import main.java.org.fgoduel.constants.ServantClass;
import main.java.org.fgoduel.model.Servant;
import main.java.org.fgoduel.playerdata.CharcterData;

public class FileReadUtil {

    /** ファイルパス */
    static final String PATH = "servant/";

    /** リストファイル */
    static final String LIST_FILE = "list.txt";

    /**
     * ファイル読み込み
     * 
     * @param charData
     * @throws IOException
     */
    public void readServant(CharcterData charData) throws IOException {

        // fileアクセサ
        FileAccessUtil fileUtil = new FileAccessUtil();
        // 対象ファイルリスト
        List<String> filelist = fileUtil.getReadAllLines(LIST_FILE);

        for (String file : filelist) {
            List<String> data = fileUtil.getReadAllLines(PATH + file);
            System.out.println(PATH + file);
            charData.getServants().put(file, createServant(data));
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
