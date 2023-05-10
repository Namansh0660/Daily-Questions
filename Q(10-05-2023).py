n = int(input())
initial = [input().strip() for i in range(n)]
rotated = [input().strip() for i in range(n)]
index = rotated.index(initial[0])
for i in range(n):
    if initial[i] != rotated[(index + i) % n]:
        print("Shuffled")
        break
else:
    print("Not Shuffled")
