# Java_FurtherOOProgramming

Note to self: This repo is saved as the directory "LSE/Term 1/MA407 Algorithms & Computation/Week 8/MyCode_Week8"  

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

Please don't make me type a whole article on the Huffman algorithm. [Here's a link](https://en.wikipedia.org/wiki/Huffman_coding)!
