package main.java.org.fgoduel.model;

import lombok.Data;
import main.java.org.fgoduel.constants.CardEffect;

@Data
public class CommandCard {

    /** カード属性 */
    private CardEffect effect;
    
    /** カード攻撃力 */
    private int Attack;
}
