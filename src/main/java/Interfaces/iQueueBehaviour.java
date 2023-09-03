package Interfaces;

import classes.Actor;

/**
 * @apiNote Интерфей для описания поведения посетителя в магазине
 * @author Developer Name
 * @version 1.0
 */
public interface iQueueBehaviour {
    /**
     * @apiNote Метод регистрации посетителя в очереди
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * @apiNote Метод регистрации посетителя при выходе из очереди
     */
    void releaseFromQueue();

    /**
     * @apiNote Метод оформления заказа посетителем
      */
    void takeOrder();

    /**
     * @apiNote Метод получения заказа посетителем
      */
    void giveOrder();
}
