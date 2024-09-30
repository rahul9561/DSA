num=5
count=0
for i in range(2,num-1):
    if num%i==0:
        count+=1

    
if count>1:
    print("not prime number")
else:
    print("prime num hai")

