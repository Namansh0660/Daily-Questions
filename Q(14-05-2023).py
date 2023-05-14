def smash_fruits(fruits):
    i = 0
    while i + 2 < len(fruits):
        if fruits[i] != fruits[i+1] and fruits[i] != fruits[i+2] and fruits[i+1] != fruits[i+2]:
            return True
        i += 1
    return False

def find_leftover_fruits(fruits):
    while smash_fruits(fruits):
        i = 0
        while i + 2 < len(fruits):
            if fruits[i] != fruits[i+1] and fruits[i] != fruits[i+2] and fruits[i+1] != fruits[i+2]:
                fruits = fruits[:i] + fruits[i+3:]
                break
            i += 1
    if len(fruits) == 0:
        print("No fruit is left over")
    else:
        print(''.join(fruits))
        
fruits = input().strip()
find_leftover_fruits(fruits)
