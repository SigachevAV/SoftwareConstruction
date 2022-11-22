import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        CollectionDecorator col = new CollectionDecorator(new ArrayList<String>());
        System.out.print(col.size());
        col.add("bbb");
        System.out.print(col.size());
    }
}
