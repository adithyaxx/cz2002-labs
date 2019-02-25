package pw.adithya;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Plane {
    private PlaneSeat[] seat = new PlaneSeat[12];
    private int numEmptySeat = 12;

    public Plane()
    {
    }

    private PlaneSeat[] sortSeats()
    {
        ArrayList<PlaneSeat> seatsArrayList = new ArrayList<>(Arrays.asList(seat));
        seatsArrayList.sort(Comparator.nullsLast(Comparator.comparingInt(PlaneSeat::getCustomerID)));

        return seatsArrayList.toArray(new PlaneSeat[12]);
    }

    private PlaneSeat[] sortSeatsBySeatId()
    {
        ArrayList<PlaneSeat> seatsArrayList = new ArrayList<>(Arrays.asList(seat));
        seatsArrayList.sort(Comparator.nullsLast(Comparator.comparingInt(PlaneSeat::getSeatID)));

        return seatsArrayList.toArray(new PlaneSeat[12]);
    }

    public void showNumEmptySeats()
    {
        System.out.printf("There are %d empty seats\n\n", numEmptySeat);
    }

    public void showEmptySeats()
    {
        seat = sortSeatsBySeatId();
        System.out.println("The following seats are empty:\n");

        for(int i=0; i < seat.length; i++)
        {
            if (seat[i] == null || !seat[i].isOccupied())
                System.out.printf("SeatID %d\n", i+1);
        }
    }

    public void showAssignedSeats(boolean bySeatId)
    {
        System.out.println("The seat assignments are as follows:\n");

        if (bySeatId) {
            seat = sortSeatsBySeatId();
            for (PlaneSeat planeSeat : seat) {
                if (planeSeat != null)
                    System.out.printf("SeatID %d assigned to CustomerId %d\n", planeSeat.getSeatID(), planeSeat.getCustomerID());
            }
        }
        else
        {
            seat = sortSeats();
            for (PlaneSeat planeSeat : seat) {
                if (planeSeat != null)
                    System.out.printf("SeatID %d assigned to CustomerId %d\n", planeSeat.getSeatID(), planeSeat.getCustomerID());
            }
        }
    }

    public void assignSeat(int seatId, int cust_id)
    {
        int index = -1;

        for (int i=0; i < seat.length; i++)
        {
            if (seat[i] != null && seat[i].getSeatID() == seatId)
                index = i;
        }

        if (index == -1 || !seat[index].isOccupied())
        {
            PlaneSeat planeSeat = new PlaneSeat(seatId);
            planeSeat.assign(cust_id);
            seat[12 - numEmptySeat] = planeSeat;
            numEmptySeat--;
            System.out.println("Seat Assigned!\n");
        }
        else
            System.out.println("Seat already assigned to a customer.\n");
    }

    public void unAssignSeat(int seatId)
    {
        for (PlaneSeat planeSeat : seat) {
            if (planeSeat != null && planeSeat.getSeatID() == seatId) {
                planeSeat.unAssign();
                System.out.println("Seat Unassigned!\n");
            }
        }
    }
}
