package Interfaces;

import java.util.List;

import classes.Actor;

/**
 * @apiNote Интерфейс для описания посещения магазина
 */
public interface iMarketBehaviour {

    /**
     * @apiNote метод регистрации посетителя при входе в магазин
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * @apiNote метод регистрации посетителя при выходе из магазина
     */
    void releaseFromMarket(List<Actor> actors);

    /**
     * @apiNote метод обновления данных о состоянии посетителя
     */
    void update();
}