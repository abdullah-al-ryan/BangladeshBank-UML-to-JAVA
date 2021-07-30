package com.company;

public class CreditCard implements MasterCard, VisaCard{
    public int mIncome;
    public int tncCount;
    public int yIncome;
    public  int yCharge;
    double total = 0;

    public void card(int yIncome, int mIncome, int yCharge)
    {
        this.mIncome = mIncome;
        this.yIncome = yIncome;
        this.yCharge = yCharge;
        double total = 0;

        if(mIncome>=200000)
        {
            System.out.println("Master Card user");)

            if(tncCount>=12) {
                total = yIncome;
            }
            else if(tncCount>5 && tncCount<12)
                total= yIncome- yIncome*.4;
            else if(tncCount>=1 && tncCount<=5)
                total= yIncome- yIncome*.6;
            else total= yIncome-5000;
        }
        else if(mIncome>=100000 && mIncome<200000)
        {
            System.out.println("Visa Card user");
            if(tncCount>=18) {
                total = yIncome;
            }
            else if(tncCount>9 && tncCount<18)
                total= yIncome- yIncome*.4;
            else if(tncCount>0 && tncCount<10)
                total= yIncome- yIncome*.6;
            else total= yIncome-3000;
        }

        System.out.println(total);
    }

}
