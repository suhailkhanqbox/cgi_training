package com.stackroute;

public class question8
{



    public void nullPointer()
    {
        String ptr = null;
        // Checking if ptr.equals null or works fine.
            try {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
                }
            catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
                }
    }

    public void negativeArray()
    {
        int arrSize = -8;
        try {
            int[] myArray = new int[arrSize];
            }

        catch (NegativeArraySizeException ex)
        {
            System.out.println("Can't create array of negative size");
        }

    }

    public void outOfBound()

    {
        int marks[] = {40, 50, 60};

        try
        {
            System.out.println(marks[3]);
        }
        catch (ArrayIndexOutOfBoundsException e)

        {
            System.out.println("Wrong index number, please enter correct number. " + e);
        }


    }


    }




