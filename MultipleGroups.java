public class MultipleGroups  
{
    private list<numberGroups> groupList;

    public boolean contains(int y)
    {
        for(int x: groupList)
        {
            if (x == y)
            return true;
        }
        return false;
    }
}
