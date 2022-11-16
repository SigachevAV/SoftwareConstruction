import java.util.ArrayList;
import java.util.List;

public abstract class Pizza
{
    public ArrayList<String> ingridients = new ArrayList<>();
    public boolean isHot;
    public boolean isOpen;
    protected abstract void MakeIngridients();
    protected abstract void MakeType();
    protected abstract void MakeHotnes();
    Pizza()
    {
        MakeIngridients();
        MakeType();
        MakeHotnes();
    }
}
