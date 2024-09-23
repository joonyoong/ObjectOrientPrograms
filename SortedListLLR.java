class SortedListLLR implements SortedList
{
  private class node
  {
    public Comparable data;
    public node next;
  }
  node head;
  int count;

  public SortedListLLR()
  {
    head=null; count=0;
  }
  public void insert(Comparable x)
  {
    head=inserthelp(head,x); // we're faking pass by reference
  }
  private node inserthelp(node h,Comparable x)
  {
    // base cases: empty list or insert at front
    if(h==null || h.data.compareTo(x)>0)
    {
      node newnode=new node();
      newnode.data=x;
      newnode.next=h;
      count++;
      return newnode;
    }
    else // recursive case: insert in the rest of the list
    {
      h.next=inserthelp(h.next,x);
      return h;
    }
  }
/*
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
*/
  private Comparable gethelp(node h, int pos)
  {
    // base case
    if(pos==0) { return h.data; }
    // recursive case
    else { return gethelp(h.next,pos-1); }
  }
  public Comparable get(int position)
  {
    if(position<0 || position>=count) { return null; }
    return gethelp(head,position);
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




