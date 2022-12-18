public class ColaAdvertising extends Advertising
{
    public int count = 0;
    @Override
    public void ShowAd(String _ad)
    {
        _ad="Это рекламма колы\n";
        count++;
        super.ShowAd(_ad);
    }
}
