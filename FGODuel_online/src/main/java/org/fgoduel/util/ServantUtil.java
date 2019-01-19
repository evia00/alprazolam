package main.java.org.fgoduel.util;

import main.java.org.fgoduel.constants.CardEffect;
import main.java.org.fgoduel.model.CommandCard;
import main.java.org.fgoduel.skill.Skill;

public class ServantUtil {

    /**
     * コマンドカード読み込み
     * 
     * @param cardSet
     * @return
     */
    public static CommandCard[] createCommandCard(String cardSet) {
        CommandCard[] commandCard = new CommandCard[5];
        
        String[] cardList = cardSet.split(",");
        
        CommandCard card;
        for (String cardSorce : cardList) {
            card = new CommandCard();
            card.setEffect(CardEffect.valueOf(cardSorce.substring(0, 1)));
            card.setAttack(Integer.parseInt(cardSorce.substring(1,2)));
        }
        
        return commandCard;
    }
    
    public static Skill[] createSkill(String... skillSet) {
        Skill[] skills = new Skill[3];
        int i =0;
        for (String skill : skillSet) {
            String[] skillSorce = skill.split(",");
            skills[i].setId(skillSorce[0]);
            skills[i].setName(skillSorce[1]);
            skills[i].setText(skillSorce[2]);
            i++;
        }
        return skills;
    }
}
