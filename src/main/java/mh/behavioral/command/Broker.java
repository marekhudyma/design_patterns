package mh.behavioral.command;

import mh.behavioral.command.command.OrderCommand;

import java.util.ArrayList;
import java.util.List;

public class Broker {

    private List<OrderCommand> orderCommands = new ArrayList<>();

    public void takeOrder(OrderCommand orderCommand) {
        orderCommands.add(orderCommand);
    }

    public void placeOrders() {
        for (OrderCommand orderCommand : orderCommands) {
            orderCommand.execute();
        }
        orderCommands.clear();
    }
}
