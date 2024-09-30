num=2332  
orin=num
rev=0
while num!=0:
    n=num%10
    rev=rev*10+n
    num//=10

if orin == rev:
    print("plindrome hai")
else:
    print("plindrom nhi hn")