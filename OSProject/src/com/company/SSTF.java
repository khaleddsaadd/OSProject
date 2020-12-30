package com.company;
class values
{
    int d = 0;
    boolean acc = false;
}

public class SSTF
{

    public static void diff(int seq[], int head, values difference[])
    {
        for (int i = 0; i < difference.length; i++)
        {
            difference[i].d = Math.abs(seq[i] - head);
        }
    }
    public static int closeElement(values difference[])
    {
        int ii = -1, min = Integer.MAX_VALUE;

        for (int i = 0; i < difference.length; i++) {
            if (!difference[i].acc && min > difference[i].d) {

                min = difference[i].d;
                ii = i;
            }
        }
        return ii;
    }
    public static void SSTF(int seq[], int head)
    {
        values difference[] = new values[seq.length];
        for (int i = 0; i < difference.length; i++)
        {
            difference[i] = new values();
        }
        int moves = 0;
        int[] newseq = new int[seq.length + 1];
        for (int i = 0; i < seq.length; i++)
        {
            newseq[i] = head;
            diff(seq, head, difference);
            int ind = closeElement(difference);
            difference[ind].acc = true;
            moves += difference[ind].d;
            head = seq[ind];
        }
        newseq[newseq.length - 1] = head;
        System.out.println("The Sequence is");
        for (int i = 0; i < newseq.length; i++)
        {
            System.out.print(newseq[i] + " ");
        }
        System.out.println();
        System.out.println("Total Head Movements = " + moves + "Cylinder");
    }
}