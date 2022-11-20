public class Main
{
    public static void main(String[] args)
    {
        News news = new News();
        Subscriber firstSub = new Subscriber("Вася");
        Subscriber secondSub = new Subscriber("Витя");
        news.AddObserver(firstSub);
        news.AddObserver(secondSub);
        news.NewNews("Хаю хай, с вами Ивангай");
    }
}