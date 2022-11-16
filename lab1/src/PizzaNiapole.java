public class PizzaNiapole extends Pizza
{

    @Override
    protected void MakeIngridients()
    {

        this.ingridients.add("Колаба");
        this.ingridients.add("Сыр");
        this.ingridients.add("Оливки");
        this.ingridients.add("Укроп");
        this.ingridients.add("Розмарин");
    }

    @Override
    protected void MakeType()
    {
        this.isOpen = false;
    }

    @Override
    protected void MakeHotnes()
    {
        this.isHot = false;
    }

    PizzaNiapole()
    {
        super();
    }
}
