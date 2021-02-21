from math import sqrt

def distance (p, q):
    return print(sqrt((p[0] - q[0])**2 + (p[1] - q[1])**2 + (p[2] - q[2])**2))

p = tuple(map(int, input().split(" ")))
q = tuple(map(int, input().split(" ")))

distance(p, q)
