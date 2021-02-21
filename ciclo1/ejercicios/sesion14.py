a = int(input())
cal = map(int, input().split(" "))

if sum(cal) == 0:
    print("FACIL")
else:
    print("DIFICIL")