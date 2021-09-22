//ROI = Net Profit / Cost of the investment * 100

class ROI
{

   private float roi;
   private int netProfit;
   private int costOfInvestement;

   public void setNetProfit(int netProfit)
   {this.netProfit = netProfit;}
   public int getNetProfit()
   { return netProfit; }

   public void setCostOfInvestement(int costOfInvestement)
   {this.costOfInvestement = costOfInvestement;}
   public int getCostOfInvestement()
   { return costOfInvestement; }

   public float getROI()
   {

        roi = (float) (netProfit * 100) / costOfInvestement  ;

        return roi;

   }


}
class CalculateRoI{

public static void main(String abc[]){

ROI r = new ROI();
r.setNetProfit(5000);
r.setCostOfInvestement(50000);


System.out.println("Rate of Interest is: "+ r.getROI()+"%");

}}