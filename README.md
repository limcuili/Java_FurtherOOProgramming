# Java_FurtherOOProgramming

Firstly, my apologies to my coaches at Makers who taught me that code should speak for itself and therefore should not contain many comments.  
I argue that my training as a mathematician steers me towards putting more information than is necessary - since the math is getting complicated, I am including comments to make my thought process and future referencing easier. 

Def<sup>n</sup>: A **greedy algorithm** works in iterations as such  
      (i) In each iteration, we choose what is optimal at that point.  
      (ii) We pray that choosing a local optimum each time will give us a global optimum at the end.  

*Example: [Fractional Knapsack Problem](https://en.wikipedia.org/wiki/Knapsack_problem)*  
Given a set of items and a knapsack which can carry weight C, each item has a weight and a value, where the items are divisible. How much should we pack of each item to maximuse the value in our knapsack?  
     We use the greedy algorithm as such: Choose the item with maximual value/weight and take as much as possible of it. If there is room left, continue with the item with next highest value/weight, etc.
     
*Example: Optimal Merging*  
Recall that merging two arrays of size n and m takes time c(n+m). Say we want to merge k arrays by first merging two of them (and so we have k-1 arrays), then merging two again (and so we have k-2 arrays), etc. In which order should we merge them to be most efficient?  
      We use the greedy algorithm as such: In each step, choose the two arrays of minimal length and merge them.

Let's talk about this thing called 'Huffman encoding'.  
Consider the steps for MP3 encoding, where we encode an audio signal:  
1. digitize the audio signal by samping at regular intervals, yielding a sequence of real numbers c<sub>1</sub>,..., c<sub>T</sub>.  
2. quantize each real-valued sample c<sub>t</sub>: approximate c<sub>t</sub> by a nearby number from a finite set S.  
3. encode the resulting string of length T in binary.  
For step 3, we use a method called Huffman encoding.  

Def<sup>n</sup>: A code C is a [prefix code](https://en.wikipedia.org/wiki/Prefix_code) if for each pair w, w' in C of distinct codewords, w is not a prefix of w'. Observe that prefix codes are uniquely decodeable.  

## [Huffman Algorithm](https://en.wikipedia.org/wiki/Huffman_coding)
We construct a tree using the Huffman algorithm, where each node is known as a Huffman node. Here, a node is a (value, frequency) pair.
Here are the simplified [steps of the algorithm](https://www.siggraph.org/education/materials/HyperGraph/video/mpeg/mpegfaq/huffman_tutorial.html) of constructing a tree bottom up: 
1. Sort the nodes by frequency, giving us an ordered sequence *L* of (value, frequency) pairs.  
2. Take the two elements x = (value<sub>x</sub>, frequency<sub>x</sub>) and y = (value<sub>y</sub>, frequency<sub>y</sub>) of lowest frequencies and assign them to be leaves of the tree.  
3. Create a parent node z = (value<sub>z</sub>, frequency<sub>x</sub> + frequency<sub>y</sub>), where the parent node has frequency equal the sum of its 2 child nodes. Do not assign a value for z.  
4. Remove x and y from the ordered sequence *L* and insert z.  
5. Repeat until all nodes have been used up.  
