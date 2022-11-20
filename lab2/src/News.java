import java.util.ArrayList;

public class News implements Observed
{
    ArrayList<Observer> subsribers = new ArrayList<>();
    String lastNews = "";

    public void NewNews(String _news)
    {
        this.lastNews=_news;
        Broadcast();
    }

    @Override
    public void AddObserver(Observer _observer)
    {
        subsribers.add(_observer);
    }

    @Override
    public void RemoveObserver(Observer _observer)
    {
        subsribers.remove(_observer);
    }

    @Override
    public void Broadcast()
    {
        for(int i=0; i<subsribers.size(); i++)
        {
            subsribers.get(i).handleEvent(this.lastNews);
        }
    }
}
