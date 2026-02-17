package com.mycompany.agency;

// TODO 1: Make TempEmployee a child of StaffEmployee
public class TempEmployee extends StaffEmployee
{
    private int hoursWorked;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this hourly employee using the specified
    //  information.
    //-----------------------------------------------------------------
    public TempEmployee(String eName, String eAddress, String ePhone,
            String socSecNumber, double rate)
    {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        hoursWorked = 0;
    }

    //-----------------------------------------------------------------
    // TODO 2: Adds the specified number of hours to this employee's
    //  accumulated hours.
    //-----------------------------------------------------------------
    public void addHours(int moreHours)
    {
        hoursWorked += moreHours;
    }

    //-----------------------------------------------------------------
    // TODO 3: Computes and returns the pay for this hourly employee.
    //-----------------------------------------------------------------
    public double pay()
    {
        double payment = payRate * hoursWorked;
        hoursWorked = 0; // reset hours after being paid
        return payment;
    }

    //-----------------------------------------------------------------
    // TODO 4: Returns information about this hourly employee as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        return super.toString() + "\nHours Worked: " + hoursWorked;
    }
}

