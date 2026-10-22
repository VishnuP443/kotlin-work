# Task 12.1: Point class
class Point():
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def hypot(self):
        distance = ( (self.x ** 2) + (self.y ** 2) ) ** 0.5
        return distance

    def distanceTo(self, other):
        distance = ( (other.x - self.x) ** 2 + (other.y - self.y) ** 2 ) ** 0.5 
        return distance

    def getCoordinates(self):
        print(f"Coordinates: ({self.x}, {self.y})")

    
    