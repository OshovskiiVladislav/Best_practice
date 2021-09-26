# Tasks from leetcode

+ [Lesson 1. 1961.Check If String Is a Prefix of Array](#Leetcode-Lesson-1) ![icon][done]
+ [Lesson 2. Group Anagrams](#Leetcode-Lesson-2) ![icon][done]
+ [Lesson 3. Plus One](#Leetcode-Lesson-3) ![icon][done]
+ [Lesson 4. Container With Most Water](#Leetcode-Lesson-4) ![icon][done]
+ [Lesson 5. Longest Common Prefix](#Leetcode-Lesson-5) ![icon][done]
+ [Lesson 6. Palindrome Number](#Leetcode-Lesson-6) ![icon][done]
+ [Lesson 7. Two Sum](#Leetcode-Lesson-7) ![icon][done]
+ [Lesson 8. Reverse Integer](#Leetcode-Lesson-8) ![icon][done]
+ [Lesson 9. Reverse String](#Leetcode-Lesson-9) ![icon][done]
+ [Lesson 10. Fibonacci Number](#Leetcode-Lesson-10) ![icon][done]
+ [Lesson 11. Power of Two](#Leetcode-Lesson-11) ![icon][done]
+ [Lesson 12. Contains Duplicate](#Leetcode-Lesson-12) ![icon][done]
+ [Lesson 13. Length of Last Word](#Leetcode-Lesson-13) ![icon][done]
+ [Lesson 14. Valid Parentheses](#Leetcode-Lesson-14) ![icon][done]
+ [Lesson 15. Remove Duplicates from Sorted List](#Leetcode-Lesson-15) ![icon][done]
+ [Lesson 16. Remove Element](#Leetcode-Lesson-16) ![icon][done]
+ [Lesson 17. Base 7](#Leetcode-Lesson-17) ![icon][done]
+ [Lesson 18. Single Number](#Leetcode-Lesson-18) ![icon][done]
+ [Lesson 19. Majority Element](#Leetcode-Lesson-19) ![icon][done]

+ [Lesson 20. 1920.Build Array from Permutation](#Leetcode-Lesson-20) ![icon][done]

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
```       

Example 2:
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

[к оглавлению](#Tasks-from-leetcode)

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

[к оглавлению](#Tasks-from-leetcode)

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

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 4

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

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 5 

Longest Common Prefix (Easy)
-
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:
```java
Input: strs = ["flower","flow","flight"]
Output: "fl"
```
Example 2:
```java
Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
```

Constraints:
```java
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lower-case English letters.
```

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 6

Palindrome Number (Easy)
-
Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.

Example 1:
```java

Input: x = 121
Output: true
```
Example 2:
```java
Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
```
Example 3:
```java
Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
```
Example 4:
```java
Input: x = -101
Output: false
```

Constraints:
```java
-231 <= x <= 231 - 1
```

Follow up: Could you solve it without converting the integer to a string?

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 7

Two Sum (Easy)
-
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
You may assume that each input would have **exactly one solution**, and you may not use the same element twice.

You can return the answer in any order.

Example 1:
```java
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```
Example 2:
```java
Input: nums = [3,2,4], target = 6
Output: [1,2]
```
Example 3:
```java
Input: nums = [3,3], target = 6
Output: [0,1]
```

Constraints:
```java
2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.
```

Follow-up: Can you come up with an algorithm that is less than `O(n2)` time complexity?

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 8

Reverse Integer (Easy)
-
Given a signed 32-bit integer `x`, return `x` with its digits reversed. 
If reversing `x` causes the value to go outside the signed 32-bit integer range `[-231, 231 - 1]`, then return `0`.

**Assume the environment does not allow you to store 64-bit integers (signed or unsigned).**

Example 1:
```java
Input: x = 123
Output: 321
```
Example 2:
```java
Input: x = -123
Output: -321
```
Example 3:
```java
Input: x = 120
Output: 21
```
Example 4:
```java
Input: x = 0
Output: 0
```

Constraints:
```java
-231 <= x <= 231 - 1
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 9

Reverse String (Easy)
-
Write a function that reverses a string. The input string is given as an array of characters `s`.

Example 1:
```java
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
```
Example 2:
```java
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
```

Constraints:
```java
1 <= s.length <= 105
s[i] is a printable ascii character.
```

Follow up: Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 10

Fibonacci Number (Easy)
-
The **Fibonacci numbers**, commonly denoted `F(n)` form a sequence, called the **Fibonacci sequence**, such that each number is the sum of the two preceding ones, starting from `0` and `1`. That is,
```java
F(0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), for n > 1.
Given n, calculate F(n).
```


Example 1:
```java
Input: n = 2
Output: 1
Explanation: F(2) = F(1) + F(0) = 1 + 0 = 1.
```
Example 2:
```java
Input: n = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = 1 + 1 = 2.
```
Example 3:
```java
Input: n = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = 2 + 1 = 3.
```

Constraints:
```java
0 <= n <= 30
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 11

Power of Two (Easy)
-
Given an integer `n`, return `true` if it is a power of two. Otherwise, return `false`.

An integer `n` is a power of two, if there exists an integer `x` such that `n == 2x`.



Example 1:
```java
Input: n = 1
Output: true
Explanation: 20 = 1
```
Example 2:
```java
Input: n = 16
Output: true
Explanation: 24 = 16
```
Example 3:
```java
Input: n = 3
Output: false
```
Example 4:
```java
Input: n = 4
Output: true
```
Example 5:
```java
Input: n = 5
Output: false
```

Constraints:
```java
-231 <= n <= 231 - 1
```


[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 12

Contains Duplicate (Easy)
-
Given an integer array `nums`, return `true` if any value appears **at least twice** in the array, and return `false` if every element is distinct.

Example 1:
```java
Input: nums = [1,2,3,1]
Output: true
```
Example 2:
```java
Input: nums = [1,2,3,4]
Output: false
```
Example 3:
```java
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
```

Constraints:
```java
1 <= nums.length <= 105
-109 <= nums[i] <= 109
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 13

Length of Last Word (Easy)
-
Given a string `s` consisting of some words separated by some number of spaces, return the length of the **last** word in the string.
A **word** is a maximal substring consisting of non-space characters only.

Example 1:
```java
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
```
Example 2:
```java
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
```
Example 3:
```java
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.
```

Constraints:
```java
1 <= s.length <= 104
s consists of only English letters and spaces ' '.
There will be at least one word in s.
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 14

Valid Parentheses (Easy)
-
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is valid if:

1. Open brackets must be closed by the same type of brackets.
2. Open brackets must be closed in the correct order.

Example 1:
```java
Input: s = "()"
Output: true
```
Example 2:
```java
Input: s = "()[]{}"
Output: true
```
Example 3:
```java
Input: s = "(]"
Output: false
```
Example 4:
```java
Input: s = "([)]"
Output: false
```
Example 5:
```java
Input: s = "{[]}"
Output: true
```
Constraints:
```java
1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 15

Remove Duplicates from Sorted List (Easy)
-
Given the `head` of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list **sorted** as well.

Example 1:
![Leetcode 15.1](src/main/resources/image/leetcode15-1.png)
```java
Input: head = [1,1,2]
Output: [1,2]
```

Example 2:
![Leetcode 15.2
](src/main/resources/image/leetcode15-2.png)
```java
Input: head = [1,1,2,3,3]
Output: [1,2,3]
```

Constraints:
```java
The number of nodes in the list is in the range [0, 300].
-100 <= Node.val <= 100
The list is guaranteed to be sorted in ascending order.
```

[к оглавлению](#Tasks-from-leetcode)



## Leetcode Lesson 16

Remove Element (Easy)
-
Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` **in-place**. The relative order of the elements may be changed.</br>
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the **first part** of the array `nums`. More formally, if there are `k` elements after removing the duplicates, then the first `k` elements of `nums` should hold the final result. It does not matter what you leave beyond the first `k` elements.</br>
Return `k` after placing the final result in the first `k` slots of `nums`.</br>

Do **not** allocate extra space for another array. You must do this by **modifying the input array in-place** with O(1) extra memory.

**Custom Judge:**

The judge will test your solution with the following code:
```java
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.
                            // It is sorted with no values equaling val.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < actualLength; i++) {
    assert nums[i] == expectedNums[i];
}
```
If all assertions pass, then your solution will be **accepted**.

Example 1:
```java
Input: nums = [3,2,2,3], val = 3
Output: 2, nums = [2,2,_,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 2.
It does not matter what you leave beyond the returned k (hence they are underscores).
```
Example 2:
```java
Input: nums = [0,1,2,2,3,0,4,2], val = 2
Output: 5, nums = [0,1,4,0,3,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
Note that the five elements can be returned in any order.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

Constraints:
```java
0 <= nums.length <= 100
0 <= nums[i] <= 50
0 <= val <= 100
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 17

Base 7 (Easy)
-
Given an integer `num`, return a string of its **base 7** representation.

Example 1:
```java
Input: num = 100
Output: "202"
```
Example 2:
```java
Input: num = -7
Output: "-10"
```

Constraints:
```java
-107 <= num <= 107
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 18

Single Number (Easy)
-
Given a **non-empty** array of integers `nums`, every element appears twice except for one. Find that single one.
You must implement a solution with a linear runtime complexity and use only constant extra space.

Example 1:
```java
Input: nums = [2,2,1]
Output: 1
```
Example 2:
```java
Input: nums = [4,1,2,1,2]
Output: 4
```
Example 3:
```java
Input: nums = [1]
Output: 1
```

Constraints:
```java
1 <= nums.length <= 3 * 104
-3 * 104 <= nums[i] <= 3 * 104
Each element in the array appears twice except for one element which appears only once.
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 19

Majority Element (Easy) 
-
Given an array `nums` of size `n`, return the majority element.
The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.



Example 1:
```java
Input: nums = [3,2,3]
Output: 3
```

Example 2:
```java
Input: nums = [2,2,1,1,1,2,2]
Output: 2
```

Constraints:
```java
n == nums.length
1 <= n <= 5 * 104
-231 <= nums[i] <= 231 - 1
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 20

1920.Build Array from Permutation
-

Given a **zero-based permutation** `nums` (**0-indexed**), build an array `ans` of the **same length** where `ans[i] = nums[nums[i]]` for each `0 <= i < nums.length` and return it.

A **zero-based permutation** `nums` is an array of **distinct** integers from `0` to `nums.length - 1` (**inclusive**).

Example 1:
```java
Input: nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
= [nums[0], nums[2], nums[1], nums[5], nums[3], nums[4]]
= [0,1,2,4,5,3]
```
Example 2:
```java
Input: nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
Explanation: The array ans is built as follows:
ans = [nums[nums[0]], nums[nums[1]], nums[nums[2]], nums[nums[3]], nums[nums[4]], nums[nums[5]]]
= [nums[5], nums[0], nums[1], nums[2], nums[3], nums[4]]
= [4,5,0,1,2,3]
```

Constraints:
```java
1 <= nums.length <= 1000
0 <= nums[i] < nums.length
The elements in nums are distinct.
```

Follow-up: Can you solve it without using an extra space (i.e., `O(1)` memory)?

[к оглавлению](#Tasks-from-leetcode)