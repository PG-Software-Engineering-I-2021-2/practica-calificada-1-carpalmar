package app;
public interface Publisher {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String area);
}
