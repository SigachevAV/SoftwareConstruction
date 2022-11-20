public interface Observed
{
    public void AddObserver(Observer _observer);
    public void RemoveObserver(Observer _observer);
    public void Broadcast();
}
