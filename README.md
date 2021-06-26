# sort-jeans
USING COMPARATOR INTERFACE

https://www.geeksforgeeks.org/comparator-interface-java/

In the package ..jeans you will find a class Jeans with the attributes type ( type ), width ( waist ), length ( inseam ) and color ( color ). Add to the jeans class so that a list of objects of type jeans are sorted first by type (alphabetically), then by width (ascending), then by length (ascending), then by color (ascending according to the order in the enumeration type) with the following call:

List<Jeans> jeans = new ArrayList<Jeans>(); 

jeans.add(new Jeans(...));

...

Collections.sort(jeans);

Add the second class SizeComparator, so that it allows sorting first by width, then by length (each in ascending order), then by color (ascending), and then by type (al- phabetically):

List<Jeans> jeans = new ArrayList<Jeans>(); 

jeans.add(new Jeans(...));

...

Collections.sort(jeans, new SizeComparator());

Both calls are prepared as an example in the JeansDemo class.
