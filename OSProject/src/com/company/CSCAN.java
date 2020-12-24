package com.company;

public class CSCAN {

    public void bubbleSort(int ar[])
    {
        int x = ar.length;
        for (int i = 0; i < x - 1; i++)
        {
            for (int j = 0; j < x - i - 1; j++)
            {
                if (ar[j] > ar[j + 1]) {

                    int replace = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = replace;
                }
            }
        }
    }

    public void CSCAN(int seq[], int HeadNo, int ds, int dir)
    {

        int seek = 0;
        int seekup = 0;
        int seekR=0;
        int seekL=0;
        int distance;

        int left[] = new int[seq.length];
        int right[] = new int[seq.length];
        int squence_S[] = new int[seq.length + 1];
        int S[] = new int[seq.length + 1];
        bubbleSort(seq);

        for (int i = 0; i < seq.length; i++) {
            if (seq[i] < HeadNo) {
                left[i] = seq[i];
            }
        }
        for (int c = 0; c < seq.length; c++)
        {
            if (seq[c] > HeadNo) {
                right[c] = seq[c];
            }
        }



        if (dir == 2)
        {   //65 67 98 122 124 183 199 0 14 41
            //60 79 92 114 176 199 0 11 34 41

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
                    distance = Math.abs((S[u]- HeadNo) +S[u]-0);
                    seekR = distance;
                }
            }

            for (int l = 0; l <= left.length - 1; l++)
            {

                if (left[l] > 0)
                {
                    u++;
                    S[u] = left[l];

                    distance = Math.abs((S[u]-0));
                    seekL = distance;
                }
            }


            System.out.println("Sequence :");

            for (int uq = 0; uq < S.length; uq++)
            {
                if (S[uq] != 0)
                {
                    System.out.print(S[uq] + " ");

                    if (S[uq] == ds - 1)
                    {
                        System.out.print("0 ");
                    }
                }
            }

            seekup =seekR+seekL;
            System.out.println();
            System.out.println("Number of seeks = " + seekup);
        }

    }

}