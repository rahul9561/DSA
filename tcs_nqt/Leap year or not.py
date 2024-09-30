year=2016

if year%400==0:
    print("leap year hai")

elif year%4==0 and year%100!=0:
    print("leap year hai")
else:
     print("leap year nhi hai")