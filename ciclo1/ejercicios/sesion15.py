n, m = map(int, input().split("/"))
a, b = n, m

def reduceFraction (a, b):
    '''Return a simplified fraction using global variables n and m.
    Using the Euclidian algorithm too'''
    if a == 0 or b == 0:
        if a == 0:
            return 0
        else:
            global n, m
            n //= a
            m //= a
            return f"{n}/{m}"
    else: #Euclidian algorithm
        c = b
        b = a % b
        a = c
        return reduceFraction(a, b)

print(reduceFraction(a, b))