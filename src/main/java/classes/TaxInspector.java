package classes;

import Interfaces.iActorBehaviour;

/**
 * @apiNote Класс для представления посетителя-инспектора
 * @author Developer Name
 * @version 1.0
 */
public class TaxInspector implements iActorBehaviour {

    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;


    public TaxInspector() {
        this.name = "Tax audit";
    }

    public String getName()
    {
        return name;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean take) {
        isTakeOrder=take;
    }

    @Override
    public void setMakeOrder(boolean make) {
        isMakeOrder = make;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

}
