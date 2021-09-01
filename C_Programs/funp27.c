//28	create a function to calculate volume of a box.	
//length x width x height.
int main()
{
	int length , width,height;
	printf("Enter length , width and height of box..");
	scanf("%d%d%d",&length,&width,&height);
	vol_box(length , width, height);
	
}
void vol_box(int l, int w, int h)
{
	int vol;
	vol  =   l * w * h ;
	printf(" Volume of box = %dcubbic mm",vol);
}
