package glazov;

public class CachDesk {
    private String name;
    private double performance;
    private int queueLength;

    public CachDesk(String name, double performance) {
        this.name = name;
        this.performance = performance;
        queueLength = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerformance() {
        return performance;
    }

    public void setPerformance(double performance) {
        this.performance = performance;
    }

    public int getQueueLength() {
        return queueLength;
    }

    public void setQueueLength(int queueLength) {
        this.queueLength = queueLength;
    }

    public double getExpectatedTime() {
        if(performance == 0) {
            throw new RuntimeException("Performance equals zero");
        }
        return queueLength / performance;
    }

    public void addClient() {
        queueLength++;
    }

    public void serveClient() {
        if(queueLength > 0) {
            queueLength--;
        }
    }
}
