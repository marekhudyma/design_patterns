package mh.behavioral.mediator;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Mediator {

    private Map<Notifiable, List<Notifiable>> map = new HashMap<>();

    public void register(Notifiable n1, Notifiable n2) {
        if (map.containsKey(n1)) {
            List<Notifiable> notifiables = map.get(n1);
            notifiables.add(n2);
            map.put(n1, notifiables);
        } else {
            List<Notifiable> notifiables = new LinkedList<>();
            notifiables.add(n2);
            map.put(n1, notifiables);
        }
    }

    public void unregister(Notifiable n1, Notifiable n2) {
        if (map.containsKey(n1)) {
            List<Notifiable> notifiables = map.get(n1);
            notifiables.remove(n2);
            map.put(n1, notifiables);
            if (notifiables.size() == 0) {
                map.remove(n1);
            }
        }
    }

    public void changed(Notifiable notifiable) {
        if (map.containsKey(notifiable)) {
            List<Notifiable> notifiables = map.get(notifiable);
            for (int i = 0; i < notifiables.size(); i++) {
                notifiables.get(i).update(notifiable);
            }
        }
    }

}
