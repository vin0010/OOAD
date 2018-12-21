# OOAD
- Learnings from https://www.pluralsight.com/courses/java-fundamentals-object-oriented-design

## Simplicity
- The code should do exactly what's necessary, nothing more
- For any problem, go for simpler solution, if it needs to be modified in some time again, go for a better design pattern since it will have make further modification easier(Fool me once, shame on you, fool me twice shame on me)
- Using Design patterns in every place is not a good idea, use it in places where you are going to modify code more than once.    
- Design incrementally, Build incrementally(imagine constructing multiple houses in apartment, dont go for painting in the first place after finishing the one side wall).

## Cohesion/coherence and coupling
- Cohesion : All public methods of a class form a cohesive group. They should be related to each other, no random methods should be grouped to form a class
- Coupling : If one global variable is used by two objects, changing it in one place might affect other place too, avoid coupling as much as possible. Lot of things can go wrong when there are too much coupling in programming.
- Idea is to isolate the objects as much as possible to make it easier to maintain.
- Conclusion : Maximize Cohesion, minimize Coupling
- If tightly coupled, change becomes hard
