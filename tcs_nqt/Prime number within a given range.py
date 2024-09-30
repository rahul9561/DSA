num=23
count=0
for i in range(1,num):
    count=0
    for j in range(2,i):
        if i%j==0:
            count+=1
    if count<1:
        print(i ,end=" ")


    