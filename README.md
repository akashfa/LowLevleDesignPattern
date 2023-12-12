# LowLevleDesignPattern
The Factory Design Pattern is a creational pattern used in object-oriented programming to create objects without exposing the instantiation logic to the client. It provides an interface for creating objects in a superclass but allows subclasses to alter the type of objects that will be created.
Let assume we have an interface Shape 
And we have concrete classes implementing the Shape interface
Now, let's create a factory class ShapeFactory responsible for creating objects of different shapes
The Factory Design Pattern, where the ShapeFactory creates objects of different shapes based on the input provided. The client code uses the factory to create objects without knowing the specific class implementation.
