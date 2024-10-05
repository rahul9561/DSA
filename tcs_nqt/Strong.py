num = 147
ori=num
sum=0
while num != 0:
    d=num%10;
    x=1
    for i in range(1,d+1):
        x*=i
    num=num//10
    sum+=x



if ori==sum:
    print("stronge number")
else:
    print("not stronge number")


