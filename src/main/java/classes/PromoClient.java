package classes;

/**
 * @author Developer Name
 * @version 1.0
 * @apiNote Класс акционного покупателя. Количество таких клиентов огарничено значеинем stockNum.
 */
public class PromoClient extends Actor {
    private int id;
    private String promoName;
    /**
     * количество участников акции
     */
    private static int stockNum = 10;

    /**
     * @param name      имя покупателя
     * @param id        уникальный идентификатор акционного покупатя
     * @param promoName наименование акции
     * @apiNote Конструктор класса
     */
    public PromoClient(String name, int id, String promoName) {
        super(name);
        this.id = id;
        this.promoName = promoName;
        this.stockNum = stockNum - 1;
        if (stockNum < 0) {
            new OrdinaryClient(super.name);
            System.out.printf("!!! ПРЕДУПРЕЖДЕНИЕ !!!\n" +
                    "Превышено количество акционных покупателей. %s будет является обычный посетителем\n" +
                    "===============\n", super.name);
        }
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPromoName() {
        return this.promoName;
    }

    public void setPromoName(String promoName) {
        this.promoName = promoName;
    }

    public int getStockNum() {
        return stockNum;
    }

    public void setSockNum(int actualStockNum) {
        stockNum = actualStockNum;
    }

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean takenOrder) {
        super.isTakeOrder = takenOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public void setName(String name) {
        super.name = name;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
