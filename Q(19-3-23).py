n=int(input())
n1=int(input())
m=int(input())
t=['Monday','Tuesday','Wednesday','Thrusday','Friday','Saturday','Sunday']
if m>n:
    q=(m-n+n1)%7
    print(t[q-1])
else :
    q=((n-m-n1)%7)+1
    print(t[7-q])
