package BehaviralDesignPatterns.ObserverDesignPattern;

public interface Subject {
    void RegisterObserver(Obsever obsever);
    void UnRegisterObserver(Obsever observer);
    void notifyObservers();
}
