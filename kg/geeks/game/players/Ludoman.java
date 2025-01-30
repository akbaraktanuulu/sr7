package kg.geeks.game.players;

import kg.geeks.game.general.RPG_Game;

public class Ludoman extends Hero {
    int bones1 = 10;
    int bones2 = RPG_Game.random.nextInt(10);

    public Ludoman (int health, String name) {
        super(health, 0, name, SuperAbility.PLAY_BONES);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {

        if ( bones1 == bones2 - boss.getHealth()){
            System.out.println(" Кости Ludoman совпадают " +  bones1 + bones2 + " Жизнь Bossa уменьшена 20hp");
        }

        }
    }

/*
Лудоман. Его способность: Он бросает две игральные кости, если они совпадают,
то он отнимает произведение чисел которые выпали из здоровья босса, если же они не совпадают,
 то он отнимает сумму чисел из здоровья случайного сокомандника

 
 */


