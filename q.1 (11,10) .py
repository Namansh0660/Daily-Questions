s = input()
n = int(input())
i = 0
l = [0 for x in range(n)]
r = -1
while i<2*n:
    if i<n:
        l[i]=s[i%len(s)]
    else :
        l[(n-i)-1] = l[(n-i)-1] + '-' + (s[i%len(s)])
        if l[(n-i)-1][0]==l[(n-i)-1][2]:
            r=(n-i)+n
            break
    i+=1
