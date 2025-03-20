/*
 * Sanele Zondi (221602011)
 * Date: 20/03/2025
 * */

package za.ac.cput.domain;

    public class Payment {
        protected int paymentID;
        protected String bookingID;
        protected double amount;
        protected String paymentMethod;



        private Payment(){}
        private Payment(Builder builder) {
            this.bookingID = builder.bookingID;
            this.paymentID = builder.paymentID;
            this.amount = builder.amount;
            this.paymentMethod = builder.paymentMethod;
        }

        public int getPaymentID() {
            return paymentID;
        }
        public String getBookingID() {
            return bookingID;
        }
        public double getAmount() {
            return amount;
        }
        public String getPaymentMethod() {
            return paymentMethod;
        }

        @Override
        public String toString() {
            return "Payment{" +
                    "paymentID='" + paymentID + '\'' +
                    ", bookingID='" + bookingID + '\'' +
                    ", amount=" + amount +
                    ", paymentMethod='" + paymentMethod + '\'' +
                    '}';
        }
        public static class Builder {
            private int paymentID;
            private String bookingID;
            private double amount;
            private String paymentMethod;

            public Builder setPaymentID(int paymentID) {
                this.paymentID = paymentID;
                return this;
            }
            public Builder setBookingID(String bookingID) {
                this.bookingID = bookingID;
                return this;
            }
            public Builder setAmount(double amount) {
                this.amount = amount;
                return this;
            }
            public Builder setPaymentMethod(String paymentMethod) {
                this.paymentMethod = paymentMethod;
                return this;
            }
            public Builder copy (Payment payment) {
                this.paymentID = payment.getPaymentID();
                this.bookingID = payment.getBookingID();
                this.amount = payment.getAmount();
                this.paymentMethod = payment.getPaymentMethod();
                return this;
            }
            public Payment build() {
                return new Payment(this);
            }
        }

    }

