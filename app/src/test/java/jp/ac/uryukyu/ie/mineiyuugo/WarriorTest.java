package jp.ac.uryukyu.ie.mineiyuugo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    @Test
    void attackWithWeponSkillTest() {
        int defaultHeroHp = 100;
        Warrior demoWarrior = new Warrior("デモ勇者", defaultHeroHp, 20);
        Enemy slime = new Enemy("スライムもどき", 100, 100);
        for(int count=0; count<3; count++){
            demoWarrior.attackWithWeponSkill(slime); // over kill
        }
        slime.attack(demoWarrior);
        assertEquals(10, slime.hitPoint);
    }
}