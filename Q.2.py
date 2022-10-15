n=int(input())
l=[]
for i in range(1,n+1):
    if n%1==0:
        l.append(i)
s=[]
for i in l:
    for j in l:
        if i!=j and i*j==n:
            s.append((i,j))
print(int(len(s)/2))
for i in range(int((len(s)/2))):
    print(s[i][0],s[i][1])
