package com.company;

public class CLook
{
    public void bubbleSort(int ar[])
    {
        int x = ar.length;
        for (int i = 0; i < x - 1; i++)
        {
            for (int j = 0; j < x - i - 1; j++)
            {
                if (ar[j] > ar[j + 1])
                {
                    int replace = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = replace;
                }
            }
        }
    }
    public  void CLook(int seq[] , int headNo)
    {
        int leftseq[] = new int[seq.length];
        int rightseq[] = new int[seq.length];
        bubbleSort(seq);

        for(int i=0 ; i<seq.length;i++)
        {
            if(seq[i] < headNo)
            {
                leftseq[i] = seq[i];
            }
        }
        int j=0;
        for(int i=0 ; i<seq.length;i++)
        {
            if(seq[i]>headNo)
            {
                rightseq[j] = seq[i];
                j++;
            }
        }

        int allSeq[] = new int[seq.length];
        // 176 79 34 60 92 11 41 114
        for(int i=0;i<allSeq.length;i++)
        {
                allSeq[i]=rightseq[i];
        }
        int z=0;
       for(int i=0;i<allSeq.length;i++)
        {
            if(allSeq[i] == 0)
            {
                allSeq[i] = leftseq[z];
                z++;
            }
        }
        System.out.println("The Sequence is : ");
        for(int i = 0;i<allSeq.length;i++)
        {
            System.out.print(allSeq[i]+" ");
        }
        System.out.println();
        int totalmov=0;
        for(int i=0 ; i<allSeq.length ; i++)
        {
            totalmov += Math.abs(allSeq[i] - headNo);
            headNo = allSeq[i];
        }
        System.out.println("Total Head Movements = " + totalmov + "Cylinder");
    }
}
