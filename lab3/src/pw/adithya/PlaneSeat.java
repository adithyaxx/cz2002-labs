package pw.adithya;

public class PlaneSeat {
    private int seatId;
    private boolean assigned = false;
    private int customerId;

    public PlaneSeat(int seat_id)
    {
        this.seatId = seat_id;
    }

    public int getSeatID()
    {
        return seatId;
    }

    public int getCustomerID()
    {
        return customerId;
    }

    public boolean isOccupied()
    {
        return assigned;
    }

    public void assign(int cust_id)
    {
        this.customerId = cust_id;
        this.assigned = true;
    }

    public void unAssign()
    {
        this.assigned = false;
    }
}
