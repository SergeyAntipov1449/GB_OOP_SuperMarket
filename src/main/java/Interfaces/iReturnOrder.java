package Interfaces;

import classes.Actor;

/**
 * @author Developer name
 * @version 1.0
 * @apiNote интерфейся для описания процесса возврата товара посетителем
 */
public interface iReturnOrder {

    /**
     * признак оформления возврата
     */
    boolean isMakeReturn();

    /**
     * признак возврата оплаты за товар
     */
    boolean isTakeRefund();

    /**
     * признак полечения товара по обмену
     */
    boolean isTakeExchange();

    /**
     * @apiNote изменение признака оформления заявки на возврат товара
     */
    void setMakeReturn(boolean makeReturn);

    /**
     * @apiNote изменение признака получения возврата оплаты
     */
    void setTakeRefund(boolean takeRefund);

    /**
     * @apiNote изменение признака получения товара по обемну
     */
    void setTakeExchange(boolean takeExchange);

    Actor getActor();
}
