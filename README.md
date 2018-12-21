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
- Whenever you call one class from another class there is a potential cohesion problem, think deeply about it before moving.
- Orthogonal(ity) : two things are orthogonal when changing one doesn't impact another

## Fragile base classes
- Classes should be designed such a way that its change shouldn't affect its child in any way.
- These kind of bugs are very hard to find and they show up exactly at runtime(at least use interfaces whenever you need extends).
- Whenever possible stop using extends and go for implements. Also to make sure classes are not extended by some one, start using final for class declarations.
- If you feel its dangerous to extend classes, make it final, if its necessary and some overriding some of the methods seems risky, make methods final so it cannot be overridden.
