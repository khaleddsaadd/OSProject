package com.company;

public class FCFS
{
    public  void FCFS(int seq[],int HeadNo) {
        int seek = 0;
        int distance, targetingSeq;
        int i=0;
        int y=0;
        while(i < seq.length)
        {
            targetingSeq = seq[i];
            distance = Math.abs(targetingSeq - HeadNo);
            seek = seek + distance;
            HeadNo = targetingSeq;
            i++;

        }
        System.out.println("The Sequence is");

        while(y < seq.length)
        {
            System.out.print(seq[y] + " ");
            y++;
        }
        System.out.println();
        System.out.println("Number of seeks = " + seek);


    }
}
