package glazov;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    private List<CachDesk> cachDesks = new ArrayList();

    public List<CachDesk> getCachDesks() {
        return cachDesks;
    }

    public void setCachDesks(List<CachDesk> cachDesks) {
        this.cachDesks = cachDesks;
    }

    public void serveClient(String name) {
        CachDesk cachDesk = cachDesks.stream().filter(cachDesk1 -> cachDesk1.getName().equals(name)).findAny().orElse(null);
        cachDesk.serveClient();
        System.out.println("Client served at cachDesk " + cachDesk.getName() + ", queueLength is " + cachDesk.getQueueLength());
    }

    public void addClient() {
        List<CachDesk> sortedCachDesks = cachDesks.stream().filter(cachDesk -> cachDesk.getQueueLength() < 20).collect(Collectors.toList());
        sortedCachDesks.sort(Comparator.comparingDouble(CachDesk::getExpectatedTime));
        CachDesk cachDesk = sortedCachDesks.get(0);
        cachDesk.addClient();
        System.out.println("Client added to cachDesk " + cachDesk.getName() + ", queueLength is " + cachDesk.getQueueLength());
    }
}
