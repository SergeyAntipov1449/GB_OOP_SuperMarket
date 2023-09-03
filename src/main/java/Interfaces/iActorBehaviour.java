package Interfaces;
import classes.Actor;

/**
 * @apiNote Интерфейс для описания поведения посетителя магазина
 * @author Developer Name
 * @version 1.0
 */
public interface iActorBehaviour {
    /**
     * @apiNote признак получения заказа
     */
    public boolean isTakeOrder();

    /**
     * @apiNote признак офорления заказ
     */
    public boolean isMakeOrder();

    /**
     * @apiNote Изменение признака получения заказа
     */
    public void setTakeOrder(boolean take);

    /**
     * @apiNote Изменение признака оформления заказа
     */
    public void setMakeOrder(boolean make);
    Actor getActor();
}
