public class BankAccount {

    private  long accountNumber;
    private  String owner;
    private   String branch;
    private  double balance;
    private  double interestRate;


//    private BankAccoun(Builder builder) {
//        this.accountNumber = accountNumber;
//        this.owner = owner;
//        this.branch = branch;
//        this.balance = balance;
//        this.interestRate = interestRate;
//
//    }

    private BankAccount(Builder builder){
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.branch = builder.branch;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }



    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", owner='" + owner + '\'' +
                ", branch='" + branch + '\'' +
                ", balance=" + balance +
                ", interestRate=" + interestRate +
                '}';
    }

    //simulate bank account creation

    public static class Builder{
        private final long accountNumber;
        private  String owner;
        private   String branch;
        private  double balance;
        private  double interestRate;


        public Builder (long accountNumber){
            this.accountNumber = accountNumber;
        }

        public Builder accountOwner( String owner){
            this.owner = owner;
            return this;
        }

        public Builder bankBranch(String branch ){
            this.branch = branch;
            return  this;
        }

        public Builder openingBalance( double balance){
            this.balance = balance;
            return this;
        }

        public Builder interestRate( double interestRate){
            this.interestRate = interestRate;
            return this;
        }


        public BankAccount build(){
            BankAccount account = new BankAccount();
            account.accountNumber = this.accountNumber;
            account.owner = this.owner;
            account.balance = this.balance;
            account.branch = this.branch;
            account.interestRate = this.interestRate;

            return account;
        }



    }

    private BankAccount(){

    }


    public static void main(String [] args){

        BankAccount newAccount1 = new Builder(232434343434344L)
                .accountOwner("Eugene Kamadi")
                .bankBranch("Queens way")
                .openingBalance(1000)
                .interestRate(2.5)
                .build();



        System.out.println("Account Details +++++++++" +newAccount1);



    }







}
