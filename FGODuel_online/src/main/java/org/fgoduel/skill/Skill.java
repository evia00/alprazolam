package main.java.org.fgoduel.skill;

import lombok.Data;

@Data
public abstract class Skill {

    /** スキルID */
    protected String id;
    
    /** スキル名 */
    protected String name;
    
    /** スキル詳細 */
    protected String text;
}
