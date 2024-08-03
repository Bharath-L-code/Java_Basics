
class SimCardRunner {
    public static void main(String[] args) {
        SimCard sim1 = new SimCard("Verizon", "Prepaid", 50.0);
        System.out.println("Carrier: " + sim1.carrier);
        System.out.println("Type: " + sim1.type);
        System.out.println("Balance: " + sim1.balance);

        SimCard sim2 = new SimCard("AT&T", "Postpaid", 100.0);
        System.out.println("Carrier: " + sim2.carrier);
        System.out.println("Type: " + sim2.type);
        System.out.println("Balance: " + sim2.balance);

        SimCard sim3 = new SimCard("T-Mobile", "Prepaid", 75.0);
        System.out.println("Carrier: " + sim3.carrier);
        System.out.println("Type: " + sim3.type);
        System.out.println("Balance: " + sim3.balance);

        SimCard sim4 = new SimCard("Sprint", "Postpaid", 150.0);
        System.out.println("Carrier: " + sim4.carrier);
        System.out.println("Type: " + sim4.type);
        System.out.println("Balance: " + sim4.balance);

        SimCard sim5 = new SimCard("Vodafone", "Prepaid", 80.0);
        System.out.println("Carrier: " + sim5.carrier);
        System.out.println("Type: " + sim5.type);
        System.out.println("Balance: " + sim5.balance);

        SimCard sim6 = new SimCard("Orange", "Postpaid", 130.0);
        System.out.println("Carrier: " + sim6.carrier);
        System.out.println("Type: " + sim6.type);
        System.out.println("Balance: " + sim6.balance);

        SimCard sim7 = new SimCard("O2", "Prepaid", 60.0);
        System.out.println("Carrier: " + sim7.carrier);
        System.out.println("Type: " + sim7.type);
        System.out.println("Balance: " + sim7.balance);

        SimCard sim8 = new SimCard("Three", "Postpaid", 120.0);
        System.out.println("Carrier: " + sim8.carrier);
        System.out.println("Type: " + sim8.type);
        System.out.println("Balance: " + sim8.balance);

        SimCard sim9 = new SimCard("EE", "Prepaid", 90.0);
        System.out.println("Carrier: " + sim9.carrier);
        System.out.println("Type: " + sim9.type);
        System.out.println("Balance: " + sim9.balance);

        SimCard sim10 = new SimCard("BT Mobile", "Postpaid", 110.0);
        System.out.println("Carrier: " + sim10.carrier);
        System.out.println("Type: " + sim10.type);
        System.out.println("Balance: " + sim10.balance);
    }
}