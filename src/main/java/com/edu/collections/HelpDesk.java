package com.edu.collections;

import java.util.ArrayDeque;
import java.util.Queue;

import static com.edu.collections.Category.PRINTER;


public class HelpDesk {
    private final Queue<Enquiry> enquiries = new ArrayDeque();

    public boolean enquire(Customer customer, final Category category) {
        return enquiries.offer(new Enquiry(customer, category));
    }

    public void processPrinterEnquiry() {
        final String message = "It is out of paper?";
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && enquiry.getCategory() == PRINTER) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do");
        }
    }

    public void processGeneralEnquiry() {
        final Enquiry enquiry = enquiries.peek();
        final String message = "Have you tried turning t off and on again?";
        if (enquiry != null && enquiry.getCategory() != PRINTER) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println("No work to do");
        }
    }

    public static void main(String[] args) {
        HelpDesk helpDesk = new HelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, PRINTER);

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
