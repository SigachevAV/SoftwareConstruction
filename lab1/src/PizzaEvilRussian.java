public class PizzaEvilRussian extends Pizza
{
    @Override
    protected void MakeIngridients()
    {
        this.ingridients.add("Колбаса");
        this.ingridients.add("Картошка");
        this.ingridients.add("Сыр");
        this.ingridients.add("Маслины");
        this.ingridients.add("Укроп");
        this.ingridients.add("Перец");
    }

    @Override
    protected void MakeType()
    {
        this.isOpen = false;
    }

    @Override
    protected void MakeHotnes()
    {
        this.isHot = true;
    }

    PizzaEvilRussian()
    {
        super();
    }
}
