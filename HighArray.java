public class HighArray {
    private long[] a;
    private int nElems;

    public HighArray(int max) 
    {
        a = new long[max];
        nElems=0;

    }

    public boolean find(long searchKey)
    {
        int j;
        for(j=0; j<nElems;j++)
            if(a[j] == searchKey)
                break;
            if (j == nElems)
                return false;
            else
                return true;

    }

    public void insert(long value)
    {
        a[nElems] = value;
        nElems++;

    }

    public boolean delete(long value) 
    {
        int j;
        for(j=0; j<nElems;j++)
            if(value == a[j])
                break;
        if(j==nElems)
            return false;
        else
        {
            for (int k=j; k<nElems; k++)
                a[k] = a[k+1];
                nElems --;
                return true;

        }


    }

    public void display()
    {
        for(int j=0; j<nElems; j++)
            System.out.print(a[j]+" ");
            System.out.println(" ");

    }

    //problem 1
    public void getmax()
    {
        long max=0;
        for(int j=0; j<a.length; j++)
        {
            if(a[j]>max)
            max=a[j];

        }

        System.out.println("The max value is "+ max);

        
    } 

    //problem 2
    public void removeMax()
    {
        long arrayMax =  a[0];

        for (int i = 0; i < nElems; i++) {
           if (a[i] > arrayMax) {
              arrayMax =  a[i];
      
              for (int k = i; k < nElems;k++) {
                 a[k] = a[k + 1];
                 nElems--;
      
                 break;
               }
            }
         }  
      
    }
}
