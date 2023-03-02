# Difference between Comparable and Comparator

In Java, both Comparable and  are Comparator interfaces used for sorting collections.

1-Comparable is in java.lang package.
1-Comparator is in java.util Package. 

2-Comparable is current object and argument compared.
2-Comparator is first argument and second argument compared.

3-in Comparable comparison logic must be present in the same class.
3-in Comparator comparison logic can be in any other class also.

4-Comparable contains the following methord to compare elements:-int compareTo(T).
4-Comparator contains the following methord to compare elements:-int compare(T,T).
