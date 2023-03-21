def get_z_sum(matrix, i, j):
    return sum([matrix[i][j], matrix[i][j+1], matrix[i+1][j], matrix[i+1][j+1]])
m = int(input())
n = int(input())
matrix = []
for i in range(m):
    row = list(map(int, input().split()))
    matrix.append(row)
max_z_sum = float('-inf')
max_z_positions = []
for i in range(m-1):
    for j in range(n-1):
        z_sum = get_z_sum(matrix, i, j)
        if z_sum > max_z_sum:
            max_z_sum = z_sum
            max_z_positions = [(i,j)]
        elif z_sum == max_z_sum:
            max_z_positions.append((i,j))
print(max_z_sum)
for pos in max_z_positions:
    i, j = pos
    print(f"{i+1}\t{j+1}\n{matrix[i][j]}\t{matrix[i][j+1]}\t{matrix[i+1][j]}\t{matrix[i+1][j+1]}")
