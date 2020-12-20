package com.company;
public class SCAN
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

    public void SCAN(int seq[], int HeadNo, int ds , int dir)
    {

        int seek = 0;
        int seekup = 0;
        int distance;

        int left[] = new int[seq.length];
        int right[] = new int[seq.length];
        int squence_S[] = new int[seq.length + 1];
        int S[] = new int[seq.length + 1];
        bubbleSort(seq);

        for (int i = 0; i < seq.length; i++)
        {
            if (seq[i] < HeadNo)
            {
                left[i] = seq[i];
            }
        }
        for (int c = 0; c < seq.length; c++)
        {
            if (seq[c] > HeadNo)
            {
                right[c] = seq[c];
            }
        }
        if(dir==1)
        {
            int j = 0;
            for (int l = left.length - 1; l >= 0; l--)
            {

                if (left[l] != 0)
                {
                    squence_S[j] = left[l];
                    j++;
                }
                distance = Math.abs(squence_S[j] - HeadNo);
                seek += distance;
                HeadNo = squence_S[j];
            }

            squence_S[j] = 0;

            for (int r = 0; r < right.length; r++)
            {
                if (right[r] != 0)
                {
                    j++;
                    squence_S[j] = right[r];

                }
                distance = Math.abs(squence_S[j] - HeadNo);
                seek += distance;
                HeadNo = squence_S[j];
            }

            System.out.println("sequence: ");

            for (int c = 0; c < squence_S.length; c++)
            {

                System.out.print(squence_S[c] + " ");

            }
            System.out.println();
            System.out.println("Number of seeks = " + seek);

        }




        if(dir==2)
        {
            bubbleSort(seq);


            int u = 0;
            for (int r = 0; r < right.length; r++)
            {

                if (right[r] > 0)
                {
                    S[u] = right[r];
                    u++;


                    if (right[r] == right[right.length - 1])
                    {
                        S[u] = ds - 1;
                    }

                    distance = Math.abs(S[u] - HeadNo);
                    seekup += distance;
                    HeadNo = S[u];

                }

            }


            for (int l = left.length - 1; l >= 0; l--)
            {

                if (left[l] > 0)
                {
                    u++;
                    S[u] = left[l];

                }
                distance = Math.abs(S[u] - HeadNo);
                seekup += distance;
                HeadNo = S[u];


            }

            System.out.println("Sequence of Upper Bound :");

            for(int uq=0;uq< S.length;uq++)
            {
                System.out.print(S[uq] + " ");

            }
            System.out.println();
            System.out.println("Number of seeks : "+(seekup - 100));

        }


    }

}