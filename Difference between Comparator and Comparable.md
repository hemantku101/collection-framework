# Difference between Comparator and Comparable

In Java, both Comparator and Comparable are interfaces used for sorting collections.

Comparable interface is implemented by a class whose objects need to be sorted. 
The Comparable interface provides a single method compareTo(Object obj) which compares the object to another object of the same type. 
The implementing class must define the logic for comparing two objects.

Comparator interface, on the other hand, provides a way to sort objects of a class that doesn't implement Comparable, 
or to provide an alternate way of sorting objects of a class that does implement Comparable. 
The Comparator interface has two methods: compare(Object obj1, Object obj2) and equals(Object obj). 
The compare method takes two objects to be compared and returns a negative, zero, or positive integer depending on whether the first object is less than, equal to, 
or greater than the second object.
