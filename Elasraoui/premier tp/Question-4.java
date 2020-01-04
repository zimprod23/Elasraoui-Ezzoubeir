public class Entier 
{
  public static void main(String [] args)
  {
    Entier o = new Entier();
    o.a=3;o.b=3;o.c=785;
      System.out.println("la somme est :"+o.Somme());
    System.out.println("la soustraction est :"+o.Soustraction());
    System.out.println("La multiplication est :"+o.Soustraction());
    o.multiple();
    o.Est_premier();
    o.Est_pair();
    o.factoriel();
    o.liste_divisuer();
    }
    private int a;
    private short b;
    private long  c;
    public long Somme()
    {
      return a+b+c;
    }
    public long Soustraction()
    {
      return a-b-c;
    }
    public long Multiplication()
    {
      return a*b*c;
    }
    public void Est_premier()
    {
      int v=0;
       for(int i=1;i<=a;i++)
         {
         if(a%i==0)
         {
         v++;
         }
        
         }
       if(v==2)
       System.out.println(a+" C'est un nombre premier.");
       else
       System.out.println(a+" Ce n'est pas un nombre premier.");
    }
    public void Est_pair()
    {
      int v=0;
        for(int i=1;i<=a;i++)
       {
       if(a==2*i)
       {
       v++;
       }
      
       }
     if(v==1)
     System.out.println(a+" est pair.");
    }
    public void factoriel()
    {   
      long S=1;
      for(int i=1;i<=a;i++)
      {
        S=S*i;
      }
      System.out.println(a+"!="+S);
    }
    public void liste_divisuer()
    {
       System.out.print("les diviseurs de "+a +" sont :");
       for(int i=1;i<=a;i++)
         {
         if(a%i==0)
         {
         System.out.print(i+"/");
         }
        
         }
    }
    public void multiple()
    {
      int v=0,d=1;
      for(int i=1;i<Math.pow(a,a);i++)
      {
         if(i%a==0)
         {
           System.out.println(a+"*"+d+"="+i);
               v++;
               d++;
         }
         if(v==11)
         {
           break;
         }
      }   
    }  
      
}
