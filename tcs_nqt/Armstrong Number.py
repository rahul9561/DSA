num=153;
length=len(str(num))
ori=num
sum=0
while num!=0:
    n=num%10
    sum+=n**length
    num//=10

if ori==sum:
    print("hai")

else:
    print("nahi hai")



