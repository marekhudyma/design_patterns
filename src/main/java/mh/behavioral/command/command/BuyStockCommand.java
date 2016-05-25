package mh.behavioral.command.command;

import mh.behavioral.command.Stock;

public class BuyStockCommand implements OrderCommand {

    private Stock stock;

    public BuyStockCommand(Stock stock){
        this.stock = stock;
    }

    public void execute() {
        stock.buy();
    }

}
