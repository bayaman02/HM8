package kg;

import kg.geeks.game.players.Boss;
import kg.geeks.game.players.Hero;
import kg.geeks.game.players.SuperAbility;

public class Witcher extends Hero {
    public Witcher(int health, int damage, String name) {
        super(health, damage, SuperAbility.RAISING_TO_DIDE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() <=0&&!heroes[i].equals(this) ) {
                int rhealth = heroes[i].getHealth();
                heroes[i].setHealth(rhealth + this.getHealth());
                this.setHealth(0);
            }break;

        }


    }
}