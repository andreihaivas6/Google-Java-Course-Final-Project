# Final Project for Google Java Course 

This final project consists in implementation of two design patterns alongside with the problems they solve.

# 1. Adapter

## Description
An Adapter pattern acts as a connector between two incompatible interfaces that otherwise cannot be connected directly. An Adapter wraps an existing class with a new interface so that it becomes compatible with the client’s interface. This design pattern should be used when an outside component provides captivating functionality that we'd like to reuse, but it's incompatible with our current application.

## The problem
Given a number of American cars whose speed is measured in miles per hour, a solution must be found to adapt the speed to the European unit of measurement (kilometers per hour).

## Solution
In order to represent the cars, it was developed an abstract class **Car** that implements the interface **Movable**. Every new family of cars (ex. **Mustang**) must extends this class. In order to *Adapt* the speed it must be written an interface **MovableAdapter** which will be implemented by **MovableAdapterImplementation** that provides an implementation for converting the speed with method **convertMPHtoKMPH**.


# 2. Composite

## Description
The composite pattern is meant to allow treating individual objects and compositions of objects, or **composites** in the same way. 
It can be viewed as a tree structure made up of types that inherit a base type, and it can represent a single part or a whole hierarchy of objects.

## The problem
Given a company and its components, it must be developed a solution in order to provide a good management of company's departments.

## Solution
**Departament** is an abstract class that is a base class for every new department. It has the main role in developing the family of departments. The *Composite* element is represented by **HeadDepartment** class which contains the leaf elements (ex. **FinancialDepartment**, **HumanResourcesDepartment**) and defines the child-related operations.

