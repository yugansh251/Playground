#include<stdio.h>
int main()
{
  int f,s,sum,num;
  scanf("%d",&num);
  f=num/10;
  s=num%10;
  sum=f+s;
  printf("%d",sum);
  return 0;
}