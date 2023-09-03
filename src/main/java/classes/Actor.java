package classes;

import Interfaces.iActorBehaviour;

/**
 * @apiNote Родительский класс для представления посетителя магазина
 * @author Developer Name
 * @version 1.0
 */
public abstract class Actor implements iActorBehaviour {

    /**
     * @apiNote Имя посетителя
     */
    protected String name;

    /**
     * @apiNote признак получения заказа
     */
    protected boolean isTakeOrder;

    /**
     * @apiNote признак оформления заказа
     */
    protected boolean isMakeOrder;

    public Actor(String name) {

        this.name = name;
    }

    abstract public void setName(String name);

    abstract public String getName();

}