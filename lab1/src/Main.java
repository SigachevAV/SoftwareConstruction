public class Main
{
    public static void main(String[] args)
    {
        Pizza p = new PizzaEvilRussian();
        System.out.println(p.ingridients);
        System.out.println(p.isHot);
        System.out.println(p.isOpen);
    }
}