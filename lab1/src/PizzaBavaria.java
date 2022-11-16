public class PizzaBavaria  extends Pizza
{
    @Override
    protected void MakeIngridients()
    {
        this.ingridients.add("Колабаски");
        this.ingridients.add("Сыр");
        this.ingridients.add("Маслины");
        this.ingridients.add("Укроп");
        this.ingridients.add("Перец");
    }

    @Override
    protected void MakeType()
    {
        this.isOpen = true;
    }

    @Override
    protected void MakeHotnes()
    {
        this.isHot = true;
    }

    PizzaBavaria()
    {
        super();
    }
}
