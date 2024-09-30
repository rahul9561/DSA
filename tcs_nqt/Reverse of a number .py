num=4325
reverse_num=0
while num!=0:
    n=num%10
    reverse_num = reverse_num * 10 + n
    num=num//10

print(reverse_num)