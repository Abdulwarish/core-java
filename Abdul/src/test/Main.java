package test;

class A
{
int x;
int d, c;
int y;
  A ()
  {
    System.out.println ("hello a");
  }
  A ( int x, int y)
  {
     x=this.d;
      y=this.c;
    //this();
      System.out.println("ssssss  :"+this.d);
    System.out.println("wwwwww :"+(x+y));
    
    //System.out.println(A1(x,y));
    
  }
  
  void A1 ( int a, int b)
  {
    //this();
    System.out.println(x+y);
    
    System.out.println("here method : "+a+b);
    
  }
}

class Main
{
  public static void main (String args[])
  {
    A a = new A(33,23);
    A b = new A();
    a.A1(33,23);
}
    
}

