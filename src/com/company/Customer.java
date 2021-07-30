package com.company;

public class Customer {
    public int yIncome;
    public int tncAmount;
    public int yCharge;
    public  int mIncome;
    public  int tncCount;
}
    public void  card(int yIncome,int mIncome,int transaction, int yCharge)
    {
        this.mIncome = mIncome;

        this.yIncome = yIncome;
        this.yCharge = yCharge;

        while(1)
        {
            this.tncAmount = tncAmount;
            if(tncAmount>1000)
            {
                tncCount++;
            }
            else if( tncAmount==0 ) break;
        }
    }
    public static void main(String[] args) {
       Customer c = new Customer();
       CreditCard cd = new CreditCard();


    }
}
