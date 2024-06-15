n: int = int(input())
builder: str = ""
aux: int = n
for i in range(2,int(n/2),1):
    while aux % i == 0:
        aux //= i
        builder += "x" + str(i)

if builder == "":
    print(n)
else:
    print(builder[1:])