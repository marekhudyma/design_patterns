package mh.behavioral.command;

import mh.behavioral.command.command.BuyStockCommand;
import mh.behavioral.command.command.SellStockCommand;

// Command
// - There is unified access to functionalities of objects
// - Access through simple interface with one method : execute()
// - Sometime there is method: revert()
// - It is easy to add and remove actions from execution of program
// - Example of usage: menu of application, toolbar, key shortcut
public class Main {

    public static void main(String[] args) {
        Stock grpnStock = new Stock("GRPN", 10);

        BuyStockCommand buyStockCommandOrder = new BuyStockCommand(grpnStock);
        SellStockCommand sellStockCommandOrder = new SellStockCommand(grpnStock);

        Broker broker = new Broker();
        broker.takeOrder(buyStockCommandOrder);
        broker.takeOrder(sellStockCommandOrder);

        broker.placeOrders();
    }

}
