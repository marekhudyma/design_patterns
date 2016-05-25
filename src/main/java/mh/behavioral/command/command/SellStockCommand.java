package mh.behavioral.command.command;

import mh.behavioral.command.Stock;

public class SellStockCommand implements OrderCommand {

    private Stock stock;

    public SellStockCommand(Stock stock){
        this.stock = stock;
    }

    public void execute() {
        stock.sell();
    }
}
