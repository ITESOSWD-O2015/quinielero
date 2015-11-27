package observer.copy;

public interface iSubject {
	 void registerObserver(iObserver observer);
	    void removeObserver(iObserver observer);
	    void notifyObservers();
}
