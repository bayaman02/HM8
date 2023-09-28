package kg.geeks.game.players;

import kg.geeks.game.logic.RPG_Game;

public class Tor extends Hero{

    public Tor(int health, int damage, String name) {
        super(health, damage,SuperAbility.FREEZING,name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean bool = RPG_Game.random.nextBoolean();
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth()>0&&bool==true){
            boss.setDamage(0);
            System.out.println("boss is stun");
        }
        else{
            boss.setDamage(50);
        }
            break;
    }
}
    }
