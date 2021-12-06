package jp.ac.uryukyu.ie.mineiyuugo;

public class Warrior extends Hero {
    public Warrior(String name, int maximumHP, int attack) {
        super(name, maximumHP, attack);
    }
    public void attackWithWeponSkill(LivingThing opponent){
        if (hitPoint >= 0){
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    
    public void wounded(int damage){
        super.wounded(damage);
    }
    
}
