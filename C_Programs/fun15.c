////15 - wap to create a function calculate area of circle  , calculate area and return the area.
#include<stdio.h>
float area_cir();
int main()
{
	float area;
	area = area_cir();
	printf("area of circle=%f",area);
	
	
}
float area_cir()
{
 int r,area;
	printf("enter radius");
	scanf("%d",&r);
	area = (float) 3.14f * r *r;
	return area;
}

