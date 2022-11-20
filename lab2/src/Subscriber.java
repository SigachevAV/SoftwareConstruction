public class Subscriber implements Observer
{
    String name;
    Subscriber(String _name)
    {
        this.name = _name;
    }
    @Override
    public void handleEvent(String _news)
    {
        System.out.println(_news);
    }
}
