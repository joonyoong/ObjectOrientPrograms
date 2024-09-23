class SortedListLL implements SortedList
{
  private class node
  {
    public Comparable data;
    public node next;
  }
  node head;
  int count;

  public SortedListLL()
  {
    head=null; count=0;
  }
  public void insert(Comparable x)
  {
    node before, after;
    after=head;
    before=null;
    while(after!=null && after.data.compareTo(x)<0)
    {
      before=after;
      after=after.next;
    }
    node newnode=new node();
    newnode.data=x;
    newnode.next=after;
    if(before==null) // inserting at the beginning
      { head=newnode; }
    else // inserting in the middle or on the end
      { before.next=newnode; }
    count++;
  }
  public Comparable get(int position)
  {
    if(position<0 || position>=count) { return null; }
    node pointer=head;
    for(int i=0; i<position; i++)
      { pointer=pointer.next; }
    return pointer.data;
  }
  public Comparable delete(int position) { return null; }
  public Comparable lookup(Comparable x)
  {
    for(node p=head; p!=null; p=p.next)
    {
      if(p.data.compareTo(x)==0) // if it matches
        { return p.data; }
      if(p.data.compareTo(x)>0) // if p.data is larger than x
        { return null; }
    }
    return null;
  }
  public int size() { return count; }
  public void makeEmpty()
  {
    head=null; count=0;
  }
  public boolean isEmpty() { return count<=0; }
  public boolean isFull() { return false; }





}



