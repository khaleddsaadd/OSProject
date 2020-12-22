package com.company;

public class LOOK {

    public void bubbleSort(int ar[]) {
        int x = ar.length;
        for (int i = 0; i < x - 1; i++) {
            for (int j = 0; j < x - i - 1; j++) {
                if (ar[j] > ar[j + 1]) {
                    int replace = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = replace;
                }
            }
        }
    }

    public void LOOK(int seq[], int HeadNo, int ds, int dir) {


        int seek = 0;
        int seekup = 0;
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
        for (int c = 0; c < seq.length; c++) {
            if (seq[c] > HeadNo) {
                right[c] = seq[c];
            }
        }


        if (dir == 1) {
            bubbleSort(seq);
            int j = 0;
            for (int l = left.length - 1; l >= 0; l--) {

                if (left[l] > 0) {
                    squence_S[j] = left[l];
                    j++;

                }

            }


            for (int r = 0; r < right.length; r++) {
                if (right[r] > 0) {

                    squence_S[j] = right[r];
                    j++;

                }

            }

            System.out.println("Lower: ");

            for (int c = 0; c < squence_S.length; c++) {
                if (squence_S[c] != 0) {

                    System.out.print(squence_S[c] + " ");

                }

                distance = Math.abs(squence_S[c] - HeadNo);
                seek += distance;
                HeadNo = squence_S[c];


            }
            System.out.println();
            System.out.println("Number of seeks = " + seek);
        }


        if (dir == 2) { //60 79 92 114 176 41 34 11
            bubbleSort(seq);
            int u = 0;

            for (int r = 0; r < right.length; r++)
            {

                if (right[r] > 0) {
                    S[u] = right[r];
                    u++;


                }

            }


            for (int l = left.length - 1; l >= 0; l--)
            {

                if (left[l] > 0)
                {
                    u++;
                    S[u] = left[l];

                }

            }

            System.out.println("Sequence of Upper Bound :");
            for (int uq = 0; uq < S.length; uq++) {


                if (S[uq] != 0)
                {
                    System.out.print(S[uq] + " ");
                }
                distance = Math.abs(S[uq] - HeadNo);
                seekup += distance;
                HeadNo = S[uq];

            }
        }
        System.out.println();
        System.out.println("Number of seeks : " + (seekup));
    }

}