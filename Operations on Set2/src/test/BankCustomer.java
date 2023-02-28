package test;

@SuppressWarnings("rawtypes")
public class BankCustomer extends Object implements Comparable{
	public long accNo;
    public String custName,accType;
    public float balance;
    public BankCustomer(long accNo,String custName,float balance,String accType) {
    	this.accNo=accNo;
    	this.custName=custName;
    	this.balance=balance;
    	this.accType=accType;
    }
    @Override
    public String toString() {
    	return accNo+"\t"+custName+"\t"+balance+"\t"+accType;
    }
    @Override
    public int compareTo(Object o) 
    {
    	BankCustomer bc = (BankCustomer)o;
    	if(accNo==bc.accNo) return 0;
    	else if(accNo>bc.accNo) return 1;
    	else return -1;
    }

}
