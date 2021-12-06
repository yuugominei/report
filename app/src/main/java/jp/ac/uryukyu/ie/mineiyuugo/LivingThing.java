package jp.ac.uryukyu.ie.mineiyuugo;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    public LivingThing (String name, int maximumHP, int attack) {
        
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    public boolean isDead(){
        return this.dead;
    }
    public String getName(){
        return this.name;
    }
    public void attack(LivingThing opponent){
        if (hitPoint >= 0){
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

}
