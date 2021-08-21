//7-Write a C program to find the eligibility of admission for a professional course based on the following criteria: Go to the editor
//Eligibility Criteria : Marks in Maths >=65 and Marks in Phy >=55 and Marks in Chem>=50 
//and Total in all three subject >=190 or Total in Maths and Physics >=140 ------------------------------------- 
#include<stdio.h>
int main()
{
	int marks_maths, marks_physics,marks_chemistry,t_pcm,t_mp;
	printf("\nEnter the marks:" );
	printf("\n Input the marks obtained in Physics :");
	scanf("%d",&marks_physics);
	printf("\n Input the marks obtained in Chemistry : ");
	scanf("%d",&marks_chemistry);
	printf("\n Input the marks obtained in Mathematics : ");
	scanf("%d",&marks_maths);
	t_pcm =  marks_maths + marks_physics + marks_chemistry;
	printf("\nTotal Marks in Physics, Chemistry, Mathmatics is : %d",t_pcm);
	t_mp= marks_maths + marks_physics;
	printf("\nTotal Marks in Physics & Mathmatics is : %d",t_mp);
	if((marks_maths >=65 && marks_physics >=55 && marks_chemistry>=50 ))
	{
		if( t_pcm>=190|| t_mp>=140)
		{
			printf("\nCongratulation!!!You are eligible for admission in professional course...");
		}
		else
		{
			printf("\n\nSorry!!!You are eligible for admission in professional course...");
			
		}
	}
	
	return 0;
}

