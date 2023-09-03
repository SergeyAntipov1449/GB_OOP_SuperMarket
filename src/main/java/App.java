import classes.*;
import Interfaces.iActorBehaviour;

public class App {
    public static void main(String[] args) throws Exception {
        Market magnit = new Market();

        iActorBehaviour client1 = new OrdinaryClient("Николай");
        iActorBehaviour client2 = new SpecialClient("Владимир", 1);
        iActorBehaviour client3 = new TaxInspector();
        iActorBehaviour client4 = new PromoClient("Дмитрий", 1, "Чай со слоном");
        iActorBehaviour client5 = new PromoClient("Альберт", 2, "Чай со слоном");

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);
        magnit.update();
    }
}