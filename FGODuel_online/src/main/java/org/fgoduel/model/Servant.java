package main.java.org.fgoduel.model;

import lombok.Data;
import main.java.org.fgoduel.constants.ServantClass;
import main.java.org.fgoduel.skill.Skill;

@Data
public class Servant {

    /** サーヴァント名 */
    private String name;

    /** スキル */
    private Skill skill[];

    /** コマンドカード */
    private CommandCard[] commandCard;

    /** クラス */
    private ServantClass servantClass;
    
    /** コスト */
    private int Cost;

}
