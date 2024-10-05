num = 6
ori=num
sum=0

while num!=0:
    d=num%10
    sum+=d
    num=num//10
    
print(sum)

if  ori==sum:
    print("perfect Score")
    
else:
    
    print("not perfect Score")