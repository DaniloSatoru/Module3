package com.mycompany.agency;




public class Staff
{
     private StaffMember[] staffList;

    //-----------------------------------------------------------------
    //  Constructor: Sets up the list of staff members.
    //-----------------------------------------------------------------
    public Staff()
    {
        staffList = new StaffMember[6];

        // TODO 1: Add 6 employees to the staffList
        // i honestly didnt know what names to give them so i just used super hero names
        staffList[0] = new Executive("Tony Stark", "123 Iron Way", "555-1234",
                                     "123-45-6789", 5000.00);

        staffList[1] = new StaffEmployee("Bruce Banner", "456 Gamma Rd", "555-5678",
                                          "987-65-4321", 3000.00);

        staffList[2] = new StaffEmployee("Natasha Romanoff", "789 Shield Ave", "555-9012",
                                          "111-22-3333", 3500.00);

        staffList[3] = new TempEmployee("Clint Barton", "321 Arrow Ln", "555-3456",
                                         "444-55-6666", 20.00);

        staffList[4] = new Intern("Peter Parker", "12 Spidey St", "555-7890");

        staffList[5] = new Volunteer("Steve Rogers", "1 Shield Blvd", "555-2345");

        ((Executive)staffList[0]).awardBonus(500.00);

        ((TempEmployee)staffList[3]).addHours(40);
    }

    //-----------------------------------------------------------------
    //  Pays all staff members.
    //-----------------------------------------------------------------
    public void payday()
    {
        double amount;

        for (int count = 0; count < staffList.length; count++)
        {
            System.out.println(staffList[count]);

            amount = staffList[count].pay();  // polymorphic

            if (amount == 0.0)
                System.out.println("Thanks!");
            else
                System.out.println("Paid: " + amount);

            System.out.println("-----------------------------------");
        }
    }
}
