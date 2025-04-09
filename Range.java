public class Range implements numberGroups
{
    private int min;
    private int max;

    public Range()
    {
        min = 1;
        max = 2;
    }

    public Range(int newMin, int newMax)
    {
        min = newMin;
        max = newMax;
    }

    public int contains (int y)
    {
        int[] ray = new int[max - min];
        for(int i = 0; min < max;i++, min++)
        {
            ray[i] = min; 
        }
        return ray;
    }
}
