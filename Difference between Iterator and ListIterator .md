# Difference between Iterator and ListIterator

The main difference between Iterator and ListIterator in Java is that ListIterator extends Iterator and 
provides additional functionalities for traversing a list.

Here are some differences:

Direction - An Iterator can traverse elements in only one direction, which is forward direction, 
whereas ListIterator can traverse elements in both forward and backward directions.

Position - An Iterator can only get the next element in the collection, while ListIterator can access next as well as previous elements,
and can also return the index of the current element.

Operations - ListIterator provides additional operations like add() and set() that are not available in Iterator.

In summary, Iterator is more generic and can be used for traversing any collection, 
whereas ListIterator is specific to lists and provides additional functionalities for traversing and modifying elements.
