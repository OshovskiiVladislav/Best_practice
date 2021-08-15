# Tasks from leetcode

+ [Lesson 1. 1961.Check If String Is a Prefix of Array](#Leetcode-Lesson-1) ![icon][done]
+ [Lesson 2. Group Anagrams](#Leetcode-Lesson-2) ![icon][done]
+ [Lesson 3. Plus One](#Leetcode-Lesson-3) ![icon][done]
+ [Lesson 4. Container With Most Water](#Leetcode-Lesson-4) ![icon][done]


[Список разделов](README.md)

[done]:src/main/resources/image/done.png

## Leetcode Lesson 1 

1961.Check If String Is a Prefix of Array (Easy)
-
Given a string s and an array of strings words, determine whether s is a prefix string of words.

A string s is a prefix string of words if s can be made by concatenating the first k strings in words for some positive k no larger than words.length.

Return true if s is a prefix string of words, or false otherwise.



Example 1:
```java
Input: s = "iloveleetcode", words = ["i","love","leetcode","apples"]
Output: true
Explanation:
s can be made by concatenating "i", "love", and "leetcode" together.
Example 2:
```

```java
Input: s = "iloveleetcode", words = ["apples","i","love","leetcode"]
Output: false
Explanation:
It is impossible to make s using a prefix of arr.
```

Constraints:
```java
1 <= words.length <= 100
1 <= words[i].length <= 20
1 <= s.length <= 1000
words[i] and s consist of only lowercase English letters.
```



## Leetcode Lesson 2 

Group Anagrams (Medium)
-
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

Example 1:
```java
Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:
```

```java
Input: strs = [""]
Output: [[""]]
Example 3:
```

```java
Input: strs = ["a"]
Output: [["a"]]
```

Constraints:
```java
1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lower-case English letters.
```


## Leetcode Lesson 3

Plus One (Medium)
-

Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.

The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.

You may assume the integer does not contain any leading zero, except the number 0 itself.

Example 1:
```java
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
```
Example 2:
```java
Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
```
Example 3:
```java
Input: digits = [0]
Output: [1]
```

Constraints:
```java
1 <= digits.length <= 100
0 <= digits[i] <= 9
```

#Leetcode Lesson 4

Container With Most Water (Medium)
-
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints
of the line i is at (i, ai) and (i, 0). Find two lines, which, together with the x-axis forms a container, such that the container contains the most water.

Notice that you may not slant the container.

![Leetcode 3](src/main/resources/image/leetcode4.png)

```java
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
```


Example 2:
```java
Input: height = [1,1]
Output: 1
```

Example 3:
```java
Input: height = [4,3,2,1,4]
Output: 16
```
Example 4:
```java
Input: height = [1,2,1]
Output: 2
```

Constraints:
```java
n == height.length
2 <= n <= 105
0 <= height[i] <= 104
```
        