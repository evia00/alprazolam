package main.java.org.fgoduel.playerdata;

import lombok.Data;
import main.java.org.fgoduel.model.Servant;
import main.java.org.fgoduel.skill.Skill;

@Data
public class PlayerData {

    /** 使用サーヴァント */
    private Servant[] servants;
    
    /** 選択スキル */
    private Skill[] skill;
}
