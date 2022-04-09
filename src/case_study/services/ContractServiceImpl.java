package case_study.services;

import case_study.models.Booking;
import case_study.models.Contract;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static Scanner input = new Scanner(System.in);
    static Set<Contract> contractList = new LinkedHashSet<>();

    public static Set<Contract> getContractList() {
        return contractList;
    }

    @Override
    public void displayList() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void addNew() {
        Queue<Booking> bookingsQueue = new LinkedList<>();
        for (Booking booking : BookingServiceImpl.bookingList) {
            bookingsQueue.add(booking);
        }
//        String contractNumber, Booking booking, int deposit, int totalBookingValue
        Booking booking = bookingsQueue.poll();

        try {
            System.out.println("Input contract number");
            String contractNumber = input.nextLine();

            System.out.println("Input deposit");
            int deposit = Integer.parseInt(input.nextLine());

            System.out.println("Input total booking value");
            int totalBookingValue = Integer.parseInt(input.nextLine());

            Contract contract = new Contract(contractNumber, booking, deposit, totalBookingValue);
            contractList.add(contract);
        } catch (Exception e) {
            System.out.println("Input wrong data");
        }
    }

    @Override
    public void edit() {
        try {
            System.out.println("Input contract number to edit");
            String contractNumber = input.nextLine();

            for (Contract contract : contractList) {
                if (contract.getContractNumber().equals(contractNumber)) {
                    System.out.println("Input deposit");
                    int deposit = Integer.parseInt(input.nextLine());
                    contract.setDeposit(deposit);

                    System.out.println("Input total booking value");
                    int totalBookingValue = Integer.parseInt(input.nextLine());
                    contract.setTotalBookingValue(totalBookingValue);
                } else {
                    System.out.println("Contract number does not exist");
                }
            }
        } catch (Exception e) {
            System.out.println("Input wrong data type");
        }

    }
}
