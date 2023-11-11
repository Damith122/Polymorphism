public class Bank {
    void savingsBalance(){
        //Meaningless Method
    }
}
class BOC extends Bank{
    @Override
    void savingsBalance() {
        System.out.println("5000$");
    }
}
class peoplesBank extends Bank{
    @Override
    void savingsBalance() {
        System.out.println("4000$");
    }
}
class NSB extends Bank{
    @Override
    void savingsBalance() {
        System.out.println("3000$");
    }
}
class Test{
    public static void main(String[] args) {
        Bank b;
        b=new Bank();
        b.savingsBalance();
        b= new peoplesBank();
        b.savingsBalance();
        b = new NSB();
        b.savingsBalance();
    }
}
