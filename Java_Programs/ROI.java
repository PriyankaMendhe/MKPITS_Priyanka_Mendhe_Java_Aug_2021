class Calculate{

    //private data member
    private float roi;


    public void setRoi(float roi){
    this.roi=roi;
    }
    public float calinterest(float pa,int nom)
    {
		float pi=pa * roi * nom;
		return pi;
	}

    }

class ROI
{
	public static void main(String[] arg) {

		Calculate t=new Calculate();

		t.setRoi(20);
		//System.out.println("roi = " + t.getRoi() );
		float totalAmount=t.calinterest(1000,12);

		System.out.println("total amount with interest " + totalAmount);

	}

}
