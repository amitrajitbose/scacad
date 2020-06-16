public class BankAccount {
    private long accountNumber;
    private String ownerName;
    private String branch;
    private double balance;
    private double interestRate;
    private String phoneNumber;
    private String email;
    private String nomineeName;

    private BankAccount(Builder b) {
        accountNumber = b.accountNumber;
        ownerName = b.ownerName;
        branch = b.branch;
        balance = b.balance;
        interestRate = b.interestRate;
        phoneNumber = b.phoneNumber;
        email = b.email;
        nomineeName = b.nomineeName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "BankAccount\n{" +
                "\naccountNumber=" + accountNumber +
                ", \nownerName='" + ownerName + '\'' +
                ", \nbranch='" + branch + '\'' +
                ", \nbalance=" + balance +
                ", \ninterestRate=" + interestRate +
                ", \nphoneNumber='" + phoneNumber + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nnomineeName='" + nomineeName + '\'' +
                "\n}";
    }

    public static class Builder {
        private long accountNumber;
        private String ownerName;
        private String branch;
        private double balance;
        private double interestRate;
        private String phoneNumber;
        private String email;
        private String nomineeName;

        public Builder setAccountNumber(long accountNumber) {
            this.accountNumber = accountNumber;
            return this;
        }

        public Builder setOwnerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public Builder setBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder setBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder setInterestRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setNomineeName(String nomineeName) {
            this.nomineeName = nomineeName;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}