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
+ [Lesson 21. Valid Sudoku](#Leetcode-Lesson-21) ![icon][done]
+ [Lesson 22. Split Linked List in Parts](#Leetcode-Lesson-22) ![icon][done]
+ [Lesson 23. Keyboard Row](#Leetcode-Lesson-23) ![icon][done]
+ [Lesson 24. Fizz Buzz](#Leetcode-Lesson-24) ![icon][done]
+ [Lesson 25. Day of the Week](#Leetcode-Lesson-25) ![icon][done]
+ [Lesson 26. Check If N and Its Double Exist](#Leetcode-Lesson-26) ![icon][done]
+ [Lesson 27. Roman to Integer](#Leetcode-Lesson-27) ![icon][done]
+ [Lesson 28. Merge Two Sorted Lists](#Leetcode-Lesson-28) ![icon][done]
+ [Lesson 29. Remove Duplicates from Sorted Array](#Leetcode-Lesson-29) ![icon][done]
+ [Lesson 30. Implement strStr()](#Leetcode-Lesson-30) ![icon][done]
+ [Lesson 31. Maximum Subarray](#Leetcode-Lesson-31) ![icon][done]
+ [Lesson 32. Sqrt(x)](#Leetcode-Lesson-32) ![icon][done]
+ [Lesson 33. Climbing Stairs](#Leetcode-Lesson-33) ![icon][done]
+ [Lesson 34. Merge Sorted Array](#Leetcode-Lesson-34) ![icon][done]
+ [Lesson 35. Binary Tree Inorder Traversal](#Leetcode-Lesson-35) ![icon][done]
+ [Lesson 36. Pascal's Triangle](#Leetcode-Lesson-36) ![icon][done]
+ [Lesson 37. Delete Node in a Linked List](#Leetcode-Lesson-37) ![icon][done]
+ [Lesson 38. Best Time to Buy and Sell Stock](#Leetcode-Lesson-38) ![icon][done]
+ [Lesson 39. Valid Palindrome](#Leetcode-Lesson-39) ![icon][done]
+ [Lesson 40. Missing Number](#Leetcode-Lesson-40) ![icon][done]
+ [Lesson 41. Min Stack](#Leetcode-Lesson-41) ![icon][done]
+ [Lesson 42. Excel Sheet Column Number](#Leetcode-Lesson-42) ![icon][done]
+ [Lesson 43. Move Zeroes](#Leetcode-Lesson-43) ![icon][done]
+ [Lesson 44. First Unique Character in a String](#Leetcode-Lesson-44) ![icon][done]
+ [Lesson 45. Happy Number](#Leetcode-Lesson-45) ![icon][done]

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
The digits are stored such that the most significant digit is at the head of the list, and each element 
in the array contains a single digit.
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
Given the `head` of a sorted linked list, delete all duplicates such that each element appears only once. 
Return the linked list **sorted** as well.

Example 1:

![Leetcode 15.1](src/main/resources/image/leetcode15-1.png)
```java
Input: head = [1,1,2]
Output: [1,2]
```

Example 2:

![Leetcode 15.2](src/main/resources/image/leetcode15-2.png)
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

1920.Build Array from Permutation (Easy)
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


## Leetcode Lesson 21

Valid Sudoku (Medium)
-
Determine if a `9 x 9` Sudoku board is valid. Only the filled cells need to be validated **according to the following rules**:

1. Each row must contain the digits `1-9` without repetition.
2. Each column must contain the digits `1-9` without repetition.
3. Each of the nine `3 x 3` sub-boxes of the grid must contain the digits `1-9` without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.


Example 1:

![Valid Sudoku](src/main/resources/image/validSudokuLeetcode21.png)

```java
Input: board =
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true
```

Example 2:
```java
Input: board =
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
```
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.


Constraints:
```java
board.length == 9
board[i].length == 9
board[i][j] is a digit 1-9 or '.'.
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 22

Split Linked List in Parts (Medium)
-
Given the `head` of a singly linked list and an integer `k`, split the linked list into `k` consecutive linked list parts.
The length of each part should be as equal as possible: no two parts should have a size differing by more than one. This may lead to some parts being null.
The parts should be in the order of occurrence in the input list, and parts occurring earlier should always have a size greater than or equal to parts occurring later.
Return an array of the `k` parts.

Example 1:
![Split Linked List in Parts 1](src/main/resources/image/leetcode22.1.png)

```java
Input: head = [1,2,3], k = 5
Output: [[1],[2],[3],[],[]]
Explanation:
The first element output[0] has output[0].val = 1, output[0].next = null.
The last element output[4] is null, but its string representation as a ListNode is [].
```

Example 2:

![Split Linked List in Parts 2](src/main/resources/image/leetcode22.2.png)

```java
Input: head = [1,2,3,4,5,6,7,8,9,10], k = 3
Output: [[1,2,3,4],[5,6,7],[8,9,10]]
Explanation:
The input has been split into consecutive parts with size difference at most 1, and earlier parts are a larger size than the later parts.
```

Constraints:
```java
The number of nodes in the list is in the range [0, 1000].
0 <= Node.val <= 1000
1 <= k <= 50
```

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 23

Keyboard Row (Easy)
-
Given an array of strings `words`, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

In the **American keyboard**:

- the first row consists of the characters `"qwertyuiop"`,
- the second row consists of the characters `"asdfghjkl"`, and
- the third row consists of the characters `"zxcvbnm"`.

![Keyboard](src/main/resources/image/leetcode23.png)

Example 1:
```java
Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]
```
Example 2:
```java
Input: words = ["omk"]
Output: []
```
Example 3:
```java
Input: words = ["adsdf","sfd"]
Output: ["adsdf","sfd"]
```

Constraints:
```java
1 <= words.length <= 20
1 <= words[i].length <= 100
words[i] consists of English letters (both lowercase and uppercase).
```

[к оглавлению](#Tasks-from-leetcode)



## Leetcode Lesson 24

Fizz Buzz (Easy)
-
Given an integer n, return a string array answer (1-indexed) where:

- answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
- answer[i] == "Fizz" if i is divisible by 3.
- answer[i] == "Buzz" if i is divisible by 5.
- answer[i] == i if non of the above conditions are true.

Example 1:
```java
Input: n = 3
Output: ["1","2","Fizz"]
```
Example 2:
```java
Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
```
Example 3:
```java
Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
```

Constraints:
```java
1 <= n <= 104
```

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 25

Day of the Week (Easy)
-
Given a date, return the corresponding day of the week for that date.
The input is given as three integers representing the day, month and year respectively.
Return the answer as one of the following values {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}.

Example 1:
```java
Input: day = 31, month = 8, year = 2019
Output: "Saturday"
```
Example 2:
```java
Input: day = 18, month = 7, year = 1999
Output: "Sunday"
```
Example 3:
```java
Input: day = 15, month = 8, year = 1993
Output: "Sunday"
```

Constraints:
```java
The given dates are valid dates between the years 1971 and 2100.
```

[к оглавлению](#Tasks-from-leetcode)



## Leetcode Lesson 26

Check If N and Its Double Exist (Easy)
-
Given an array arr of integers, check if there exists two integers N and M such that N is the double of M ( i.e. N = 2 * M).
More formally check if there exists two indices i and j such that :
```java
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]
```

Example 1:
```java
Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
```
Example 2:
```java
Input: arr = [7,1,14,11]
Output: true
Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7.
```
Example 3:
```java
Input: arr = [3,1,7,11]
Output: false
Explanation: In this case does not exist N and M, such that N = 2 * M.
```

Constraints:
```java
2 <= arr.length <= 500
-10^3 <= arr[i] <= 10^3
```

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 27

Roman to Integer (Easy)
-
Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

- `I` can be placed before `V` (5) and `X` (10) to make 4 and 9.
- `X` can be placed before `L` (50) and `C` (100) to make 40 and 90.
- `C` can be placed before `D` (500) and `M` (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.



Example 1:
```java
Input: s = "III"
Output: 3
```
Example 2:
```java
Input: s = "IV"
Output: 4
```
Example 3:
```java
Input: s = "IX"
Output: 9
```
Example 4:
```java
Input: s = "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.
```
Example 5:
```java
Input: s = "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

Constraints:
```java
1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
```

[к оглавлению](#Tasks-from-leetcode)



## Leetcode Lesson 28

Merge Two Sorted Lists (Easy)
-
Merge two sorted linked lists and return it as a **sorted** list. The list should be made by splicing together the nodes of the first two lists.

Example 1:

![Leetcode 28](src/main/resources/image/leetcode28.png)

```java
Input: l1 = [1,2,4], l2 = [1,3,4]
Output: [1,1,2,3,4,4]
```
Example 2:
```java
Input: l1 = [], l2 = []
Output: []
```
Example 3:
```java
Input: l1 = [], l2 = [0]
Output: [0]
```

Constraints:
```java
The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both l1 and l2 are sorted in non-decreasing order.
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 29

Remove Duplicates from Sorted Array (Easy)
-
Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.
Return k after placing the final result in the first k slots of nums.
Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

Custom Judge:

The judge will test your solution with the following code:
```java
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
assert nums[i] == expectedNums[i];
}
```

If all assertions pass, then your solution will be accepted.



Example 1:
```java
Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]
Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```
Example 2:
```java
Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
It does not matter what you leave beyond the returned k (hence they are underscores).
```

Constraints:
```java
0 <= nums.length <= 3 * 104
-100 <= nums[i] <= 100
nums is sorted in non-decreasing order.
```

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 30

Implement strStr() (Easy)
-
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

**Clarification:**

What should we return when needle is an empty string? This is a great question to ask during an interview.
For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().

Example 1:
```java
Input: haystack = "hello", needle = "ll"
Output: 2
```
Example 2:
```java
Input: haystack = "aaaaa", needle = "bba"
Output: -1
```
Example 3:
```java
Input: haystack = "", needle = ""
Output: 0
```

Constraints:
```java
0 <= haystack.length, needle.length <= 5 * 104
haystack and needle consist of only lower-case English characters.
```

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 31

Maximum Subarray (Easy)
-
Given an integer array `nums`, find the contiguous subarray (containing at least one number) which has the largest sum 
and return its sum.</br>
A **subarray** is a **contiguous** part of an array.

Example 1:
```java
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
```
Example 2:
```java
Input: nums = [1]
Output: 1
```
Example 3:
```java
Input: nums = [5,4,-1,7,8]
Output: 23
```

Constraints:
```java
1 <= nums.length <= 105
-104 <= nums[i] <= 104
```

**Follow up:** If you have figured out the `O(n)` solution, try coding another solution using the **divide and conquer** 
approach, which is more subtle.

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 32

Sqrt(x) (Easy)
-

Given a non-negative integer `x`, compute and return the square root of `x`.</br>
Since the return type is an integer, the decimal digits are **truncated**, and only **the integer part** of the result 
is returned.</br>
**Note:** You are not allowed to use any built-in exponent function or operator, such as `pow(x, 0.5)` or `x ** 0.5`.

Example 1:
```java
Input: x = 4
Output: 2
```
Example 2:
```java
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
```

Constraints:
```java
0 <= x <= 231 - 1
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 33

Climbing Stairs (Easy)
-
You are climbing a staircase. It takes `n` steps to reach the top.
Each time you can either climb `1` or `2` steps. In how many distinct ways can you climb to the top?



Example 1:
```java
Input: n = 2
Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
```
Example 2:
```java
Input: n = 3
Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step
```

Constraints:
```java
1 <= n <= 45
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 34

Merge Sorted Array (Easy)
-
You are given two integer arrays nums1 and nums2, sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
Merge nums1 and nums2 into a single array sorted in non-decreasing order.
The final sorted array should not be returned by the function, but instead be stored inside the array nums1. 
To accommodate this, nums1 has a length of m + n, where the first m elements denote the elements that should be merged,
and the last n elements are set to 0 and should be ignored. nums2 has a length of n.

Example 1:
```java
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
```
Example 2:
```java
Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
```
Example 3:
```java
Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.
```

Constraints:
```java
nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109
```

**Follow up:** Can you come up with an algorithm that runs in O(m + n) time?




## Leetcode Lesson 35

Binary Tree Inorder Traversal (Easy)
-
Given the `root` of a binary tree, return the inorder traversal of its nodes' values.

Example 1:
![leetcode 35.1](src/main/resources/image/leetcode35.png)

```java
Input: root = [1,null,2,3]
Output: [1,3,2]
```
Example 2:
```java
Input: root = []
Output: []
```
Example 3:
```java
Input: root = [1]
Output: [1]
```
Example 4:
![leetcode 35.2](src/main/resources/image/leetcode35.2.png)
```java
Input: root = [1,2]
Output: [2,1]
```
Example 5:
![leetcode 35.3](src/main/resources/image/leetcode35.3.png)
```java
Input: root = [1,null,2]
Output: [1,2]
```

Constraints:
```java
The number of nodes in the tree is in the range [0, 100].
-100 <= Node.val <= 100
```

**Follow up:** Recursive solution is trivial, could you do it iteratively?

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 36

Pascal's Triangle (Easy)
-
Given an integer numRows, return the first numRows of Pascal's triangle.
In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

![leetcode 36](src/main/resources/image/leetcode36.png)

Example 1:
```java
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
```
Example 2:
```java
Input: numRows = 1
Output: [[1]]
```

Constraints:
```java
1 <= numRows <= 30
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 37

Delete Node in a Linked List (Easy)
-
Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, 
instead you will be given access to the node to be deleted directly.
It is guaranteed that the node to be deleted is not a tail node in the list.

Example 1:
![leetcode 37](src/main/resources/image/leetcode37.1.png)
```java
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, 
the linked list should become 4 -> 1 -> 9 after calling your function.
```

Example 2:
![leetcode 37](src/main/resources/image/leetcode37.2.png)
```java
Input: head = [4,5,1,9], node = 1
Output: [4,5,9]
Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.
```
Example 3:
```java
Input: head = [1,2,3,4], node = 3
Output: [1,2,4]
```
Example 4:
```java
Input: head = [0,1], node = 0
Output: [1]
```
Example 5:
```java
Input: head = [-3,5,-99], node = -3
Output: [5,-99]
```
Constraints:
```java
The number of the nodes in the given list is in the range [2, 1000].
-1000 <= Node.val <= 1000
The value of each node in the list is unique.
The node to be deleted is in the list and is not a tail node
```

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 38

Best Time to Buy and Sell Stock (Easy)
-
You are given an array prices where prices[i] is the price of a given stock on the ith day.

You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.

Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.



Example 1:
```java
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
```
Example 2:
```java
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done and the max profit = 0.
```

Constraints:
```java
1 <= prices.length <= 105
0 <= prices[i] <= 104
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 39

Valid Palindrome (Easy)
-
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters 
and removing all non-alphanumeric characters, it reads the same forward and backward. 
Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.



Example 1:
```java
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
```
Example 2:
```java
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
```
Example 3:
```java
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
```

Constraints:
```java
1 <= s.length <= 2 * 105
s consists only of printable ASCII characters.
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 40

Missing Number (Easy)
-

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.



Example 1:
```java
Input: nums = [3,0,1]
Output: 2
Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
```
Example 2:
```java
Input: nums = [0,1]
Output: 2
Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
```
Example 3:
```java
Input: nums = [9,6,4,2,3,5,7,0,1]
Output: 8
Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
```
Example 4:
```java
Input: nums = [0]
Output: 1
Explanation: n = 1 since there is 1 number, so all numbers are in the range [0,1]. 1 is the missing number in the range since it does not appear in nums.
```


Constraints:
```java
n == nums.length
1 <= n <= 104
0 <= nums[i] <= n
All the numbers of nums are unique.
```

Follow up: Could you implement a solution using only O(1) extra space complexity and O(n) runtime complexity?

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 41

Min Stack
-
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
Implement the `MinStack` class:

- `MinStack()` initializes the stack object.
- `void push(int val)` pushes the element val onto the stack.
- `void pop()` removes the element on the top of the stack.
- `int top()` gets the top element of the stack.
- `int getMin()` retrieves the minimum element in the stack.

Example 1:
```java
Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
```

Constraints:
```java
-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin.
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 42

Excel Sheet Column Number
-
Given a string `columnTitle` that represents the column title as appear in an Excel sheet, 
return its corresponding column number.

For example:
```java
A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28
...
```

Example 1:
```java
Input: columnTitle = "A"
Output: 1
```
Example 2:
```java
Input: columnTitle = "AB"
Output: 28
```
Example 3:
```java
Input: columnTitle = "ZY"
Output: 701
```
Example 4:
```java
Input: columnTitle = "FXSHRXW"
Output: 2147483647
```

Constraints:
```java
1 <= columnTitle.length <= 7
columnTitle consists only of uppercase English letters.
columnTitle is in the range ["A", "FXSHRXW"].
```

[к оглавлению](#Tasks-from-leetcode)

## Leetcode Lesson 43

Move Zeroes
-
Given an integer array `nums`, move all `0's` to the end of it while maintaining the relative order of the non-zero elements.

**Note** that you must do this in-place without making a copy of the array.

Example 1:
```java
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
```
Example 2:
```java
Input: nums = [0]
Output: [0]
```

Constraints:
```java
1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1
```

**Follow up:** Could you minimize the total number of operations done?

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 44

First Unique Character in a String
-
Given a string `s`, find the first non-repeating character in it and return its index. If it does not exist, return `-1`.



Example 1:
```java
Input: s = "leetcode"
Output: 0
```
Example 2:
```java
Input: s = "loveleetcode"
Output: 2
```
Example 3:
```java
Input: s = "aabb"
Output: -1
```

Constraints:
```java
1 <= s.length <= 105
s consists of only lowercase English letters.
```

[к оглавлению](#Tasks-from-leetcode)


## Leetcode Lesson 45

Happy Number
-
Write an algorithm to determine if a number n is happy.

A **happy number** is a number defined by the following process:

- Starting with any positive integer, replace the number by the sum of the squares of its digits.
- Repeat the process until the number equals 1 (where it will stay), or it **loops endlessly in a cycle** which does not include 1.
- Those numbers for which this process ends in 1 are happy. 

Return `true` if `n` is a happy number, and `false` if not.



Example 1:

```java
Input: n = 19
Output: true
Explanation:
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
```

Example 2:
```java
Input: n = 2
Output: false
```

Constraints:
```java
1 <= n <= 231 - 1
```

[к оглавлению](#Tasks-from-leetcode)