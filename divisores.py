n = int(input())

for i in range(0, n, 1):
    sum = 0
    sum2 = 0
    flag2 = 0
    flag3 = 0
    num = int(input())

    for j in range(1, num, 1):
        if num % j == 0:
            sum = sum + j
    if sum == num:
        print(f"{num} perfecto")
    else:
        for i in range(1, sum, 1):
            if sum % i == 0:
                sum2 = sum2 + i
        if sum2 == num:
            flag2 = 1

        if sum > num:
            flag3 = 1

        if flag2 != 0 and flag3 != 0:
            print(f"{num} romantico abundante")

        elif flag2 != 0:
            print(f"{num} romantico")

        elif flag3 != 0:
            print(f"{num} abundante")

        else:
            print(f"{num} complicado")



def isPrime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True