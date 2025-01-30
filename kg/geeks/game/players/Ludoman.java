package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Ludoman extends Hero {

    public Ludoman(int health, String name) {
        super(health, 0, name, SuperAbility.PLAY_BONES);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int dic1 = RPG_Game.random.nextInt(1, 7);
        int dic2 = RPG_Game.random.nextInt(1, 7);

        if (dic1 == dic2) {
            boss.setHealth(boss.getHealth() - (dic1 * dic2));
            System.out.println("Ludoman attacked Boss " + (dic1 * dic2));
        } else {
            Hero hero = heroes[RPG_Game.random.nextInt(heroes.length)];
            hero.setHealth(hero.getHealth() - (dic1 + dic2));
            System.out.println("Ludoman attacked "+ hero.getName() + " " + (dic1 + dic2));
        }
    }
}
/*
Лудоман. Его способность: Он бросает две игральные кости, если они совпадают,
то он отнимает произведение чисел которые выпали из здоровья босса, если же они не совпадают,
 то он отнимает сумму чисел из здоровья случайного сокомандника


 */


