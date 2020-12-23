package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        System.out.println("-----------------------------");
        System.out.println("Choose algorithm to apply : ");
        System.out.println("1-FCFS Disk Scheduling Algorithm");
        System.out.println("2-SCAN Disk Scheduling Algorithm");
        System.out.println("3-SSTF Disk Scheduling Algorithm");
        System.out.println("4-C-SCAN Disk Scheduling Algorithm");
        System.out.println("5-LOOK Disk Scheduling Algorithm");
        System.out.println("6-C-LOOK Disk Scheduling Algorithm");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        if(choice == 1)
        {
            System.out.println("Enter number of Sequences");
            int numOfSeq = sc.nextInt();
            int [] seq = new int[numOfSeq];
            int x=1;
            for(int i=0;i<numOfSeq;i++)
            {
                System.out.println("Enter sequence number "+x);
                seq[i] = sc.nextInt();
                x++;
            }
            System.out.println("Enter Head Number");
            int headNumber=sc.nextInt();

            FCFS f=new FCFS();
            f.FCFS(seq,headNumber);
        }
        else if(choice==2)
        {
            System.out.println("1 - Lower Bound ");
            System.out.println("2 - Upper Bound ");
            int dir=sc.nextInt();

            System.out.println("Enter size of disk");
            int ds = sc.nextInt();
            //String dirc ="left";
            System.out.println("Enter number of Sequences");
            int numOfSeq = sc.nextInt();
            int [] seq = new int[numOfSeq];
            int x=1;
            for(int i=0;i<numOfSeq;i++)
            {
                System.out.println("Enter sequence number "+x);
                seq[i] = sc.nextInt();
                x++;
            }
            System.out.println("Enter Head Number");
            int headNumber=sc.nextInt();
            SCAN s=new SCAN();
            s.SCAN(seq,headNumber,ds,dir);

        }
        else if(choice ==3)
        {
            System.out.println("Enter number of Sequences");
            int numOfSeq = sc.nextInt();
            int [] seq = new int[numOfSeq];
            int x=1;
            for(int i=0;i<numOfSeq;i++)
            {
                System.out.println("Enter sequence number "+x);
                seq[i] = sc.nextInt();
                x++;
            }
            System.out.println("Enter Head Number");
            int headNumber=sc.nextInt();
            SSTF sstf = new SSTF();
            sstf.SSTF(seq,headNumber);
        }

        else if(choice==4)
        {
            System.out.println("1 - Lower Bound ");
            System.out.println("2 - Upper Bound ");
            int dir=sc.nextInt();

            System.out.println("Enter size of disk");
            int ds = sc.nextInt();
            //String dirc ="left";
            System.out.println("Enter number of Sequences");
            int numOfSeq = sc.nextInt();
            int [] seq = new int[numOfSeq];
            int x=1;
            for(int i=0;i<numOfSeq;i++)
            {
                System.out.println("Enter sequence number "+x);
                seq[i] = sc.nextInt();
                x++;
            }
            System.out.println("Enter Head Number");
            int headNumber=sc.nextInt();
            //CSCAN s=new CSCAN();
            //s.CSCAN(seq,headNumber,ds,dir);

        }

        else if(choice==5)
        {
            System.out.println("1 - Lower Bound ");
            System.out.println("2 - Upper Bound ");
            int dir=sc.nextInt();

            System.out.println("Enter size of disk");
            int ds = sc.nextInt();
            //String dirc ="left";
            System.out.println("Enter number of Sequences");
            int numOfSeq = sc.nextInt();
            int [] seq = new int[numOfSeq];
            int x=1;
            for(int i=0;i<numOfSeq;i++)
            {
                System.out.println("Enter sequence number "+x);
                seq[i] = sc.nextInt();
                x++;
            }
            System.out.println("Enter Head Number");
            int headNumber=sc.nextInt();
            LOOK s=new LOOK();
            s.LOOK(seq,headNumber,ds,dir);

        }
        else if(choice==6)
        {
            System.out.println("Enter number of Sequences");
            int numOfSeq = sc.nextInt();
            int [] seq = new int[numOfSeq];
            int x=1;
            for(int i=0;i<numOfSeq;i++)
            {
                System.out.println("Enter sequence number "+x);
                seq[i] = sc.nextInt();
                x++;
            }
            System.out.println("Enter Head Number");
            int headNumber=sc.nextInt();
            CLook cl = new CLook();
            cl.CLook(seq,headNumber);

        }
    }
}
