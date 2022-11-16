import java.util.ArrayList;

public class PizzaMargarita extends Pizza
{
    PizzaMargarita()
    {
        super();
    }
    @Override
    protected void MakeIngridients()
    {
        this.ingridients.add("Сыр");
        this.ingridients.add("Помидора");
        this.ingridients.add("Лук");
        this.ingridients.add("ветчиной");
    }

    @Override
    protected void MakeType()
    {
        this.isOpen = true;
    }

    @Override
    protected void MakeHotnes()
    {
        this.isHot = false;
    }
}
