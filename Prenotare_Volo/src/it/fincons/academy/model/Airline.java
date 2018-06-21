package it.fincons.academy.model;

import java.util.Scanner;

public class Airline 
{
    boolean[] seating = new boolean[11]; /* create 10 seat numbers (array[0] will not be used). Empty seat indicated by false*/
    Scanner input = new Scanner(System.in);

    public void start()
    {       
        while ( true )
        {
            makeReservation();
        }   
    }

    public void makeReservation()
    {
        System.out.println("Premi 1 per prenotare: ");
        int section = input.nextInt();
        if ( section == 1 )
        {
            firstClassSeat();
        }
        
    }

    public void firstClassSeat() // assign a first class seat
    {
        for ( int count = 1; count <= 5; count++ )
        {
            if ( seating[count] == false )  // if false, then a seat is available for assignment
            {
                seating[count] = true;  // assign seat
                System.out.printf("Posto# %d\n", count);
                break;
            }
            else if ( seating[5] == true ) // If seating[5] is true then first class is fully booked
            {
                if ( seating[10] == true) // If seating[10] is true then economy (and therefore whole flight) is fully booked
                {
                    System.out.println("Siamo spiacenti,posti terminati");
                }
                else // ask passenger if they would like an economy ticket instead
                {
                    System.out.println("Tutti posti prenotati. Premi 2 per uscire");
                    int choice = input.nextInt();
                    if ( choice == 2 )
                    {
                        
                    	System.out.println("Arrivederci");
                        System.exit(0);
                    }
                    
                }
            }
        }
    }
    } 