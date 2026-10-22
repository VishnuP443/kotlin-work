# Task 12.1: program that uses a Point object
from point import Point
# Remember that you'll need an import statement to access the class!

def main():
    p1.getCoordinates()
    p2.getCoordinates()

    d1 = p1.hypot()
    d2 = p2.hypot()

    print(f'P1 distance: {d1}\nP2 distance: {d2}')

    d3 = p1.distanceTo(p2)
    print(f'Distance from P1 to P2: {d3}')

p1 = Point(x = 3.0, y = 4.0)
p2 = Point(x = 9.0, y = 7.0)

if __name__ == "__main__":
    main()