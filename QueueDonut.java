class QueueDonut implements Queue
{
  Object [] donut;
  int front;
  int back;
  int count;

  public QueueDonut(int maxsize)
  {
    donut=new Object[maxsize];
    count=0;
    front=0;
    back=donut.length-1;
  }

  public void enqueue(Object x)
  {
    if(isFull())
    { return; }
    else
    {
      back++;
      if(back>=donut.length) { back=0; }
      donut[back]=x;
      count++;
    }
  }
  public Object dequeue()
  {
    if(isEmpty()) 
    { return null; }
    else
    {
      int oldfront=front;
      front++;
      if(front>=donut.length) { front=0; }
      count--;
      return donut[oldfront];
    }
  }
  public Object getFront()
  {
    if(isEmpty()) { return null; }
    else { return donut[front]; }
  }

  public int size() { return count; }
  public void makeEmpty()
  {
    count=0;
    front=0;
    back=donut.length-1;
  }
  public boolean isEmpty() { return (count<=0); }
  public boolean isFull() { return (count>=donut.length); }

}





