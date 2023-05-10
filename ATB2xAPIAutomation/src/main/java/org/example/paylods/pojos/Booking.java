package org.example.paylods.pojos;

public class Booking {
    private String firstname;
    private String lastname;
    private double totalprice;
    private boolean depositpaid;
    private String additionalneeds;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public double getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(double totalprice) {
        this.totalprice = totalprice;
    }

    public boolean isDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

    public Bookindates getBookingdates() {
        return bookingdates;
    }

    public void setBookingdates(Bookindates bookingdates) {
        this.bookingdates = bookingdates;
    }

    private Bookindates bookingdates;

}
