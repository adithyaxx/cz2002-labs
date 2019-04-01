package pw.adithya.Qn1;

public class SalePerson implements Comparable {
    private String firstName, lastName;
    private int totalSales;

    public SalePerson(String firstName, String lastName, int totalSales) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.totalSales = totalSales;
    }

    public String toString()
    {
        return String.format("%s, %s : %d", lastName, firstName, totalSales);
    }

    public boolean equals(Object o)
    {
        return (((SalePerson) o).getFirstName().equals(firstName) && ((SalePerson) o).getLastName().equals(firstName));
    }

    public int compareTo(Object o)
    {
        if (totalSales < ((SalePerson) o).getTotalSales())
            return -1;
        else if (totalSales > ((SalePerson) o).getTotalSales())
            return 1;
        else
        {
            if (lastName.compareTo(((SalePerson) o).getLastName()) < 0)
                return 1;
            else
                return -1;
        }
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public int getTotalSales()
    {
        return totalSales;
    }
}
