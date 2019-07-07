#include<stdio.h>
int main()
{
  int first,third,sum,num;
  scanf("%d",&num);
  first=num/100;
  third=num%10;
  sum=first+third;
  printf("%d",sum);
  return 0;
}