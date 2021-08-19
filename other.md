# Tasks from other sources

+ [Lesson 1. С помощью какой коллекции можно отсортировать массив ?](#other-Lesson-1) ![icon][done]
+ [Lesson 2. Lost number in number sequence ?](#other-Lesson-2) ![icon][done]
+ [Lesson 3. Метод который меняет ключи и значениями местами map](#other-Lesson-3) ![icon][done]
+ [Lesson 4. Метод получающий строку из чисел и сумирующий все числа](#other-Lesson-4) ![icon][done]
+ [Lesson 5. Метод получающий строку из чисел и сумирующий все числа](#other-Lesson-5) ![icon][done]
+ [Lesson 6. Метод сколько повторяется каждое из чисел](#other-Lesson-6) ![icon][done]
+ [Lesson 7. Развернуть собственный лист](#other-Lesson-7) ![icon][done]
+ [Lesson 8. C помощью какой коллекции можно развернуть массив](#other-Lesson-8) ![icon][done]
+ [Lesson 9. Cоздайте комментарий который будет выполнятся](#other-Lesson-9) ![icon][done]
+ [Lesson 10. Создание бесконечного цикла на пустом месте](#other-Lesson-10) ![icon][done]
+ [Lesson 11. Cоздать именованный цикл](#other-Lesson-11) ![icon][done]


[Список разделов](README.md)

[done]:src/main/resources/image/done.png

## other Lesson 1

С помощью какой коллекции можно отсортировать массив ?
-
C помощью какой коллекции можно отсортировать массив ?
- Stack
- Queue
- Priority Queue

## other Lesson 2

Lost number in number sequence ?
-
An ordered sequence of numbers from 1 to N is given. One number might have deleted from it, then the remaining numbers were mixed. Find the number that was deleted.

Example:

The starting array sequence is [1,2,3,4,5,6,7,8,9]

The mixed array with one deleted number is [3,2,4,6,7,8,1,9]

Your function should return the int 5.

If no number was deleted from the array and no difference with it, your function should return the int 0.

Note: N may be 1 or less (in the latter case, the first array will be []).



## other Lesson 3

Set Alarm
-
L1: Set Alarm

Write a function named setAlarm which receives two parameters. The first parameter, employed, is true whenever you are employed and the second parameter, vacation is true whenever you are on vacation.

The function should return true if you are employed and not on vacation (because these are the circumstances under which you need to set an alarm). It should return false otherwise. Examples:

```java
 setAlarm(true, true) -> false
 setAlarm(false, true) -> false
 setAlarm(false, false) -> false
 setAlarm(true, false) -> true
```

```java
import static org.junit.Assert.*;
import org.junit.Test;

public class AlarmTest {
 
 @Test
  public void setAlarmTest() {
    assertTrue("Should be true.", Alarm.setAlarm(true, false));
    assertFalse("Should be false.", Alarm.setAlarm(true, true));
    assertFalse("Should be false.", Alarm.setAlarm(false, false));
    assertFalse("Should be false.", Alarm.setAlarm(false, true));
  }
}
```


## other Lesson 4

Метод который меняет ключи и значениями местами map
-
Пишем метод, который на вход Map <K,V> и возвращет Map, где ключи и значения поменяны местами
Так как значения могут совпадать, то тип значения в Map будет уже не K, а Collection<K>



## other Lesson 5

Метод получающий строку из чисел и сумирующий все числа
-
```java
public class Solution {
    // Написать метод, который получает на вход строку(напрмер "42324137") и суммирует все числа, которые есть в этой строке, возвращет сумму
    public static Integer calculateSum(String input) {
        return null;
    }
}
```



## other Lesson 6

Метод сколько повторяется каждое из чисел
-
Реализовать метод, по условиям нам на вход приходит List<Integer> и на выходе</br>
я хочу получить Map<>, которая объяснит мне сколько раз повторяется каждое из чисел</br>
Например: на вход // 1,2,3,4,2,3,4,100</br>
Выход: [{1,1}, {2,2}, {3,3}, {4,2} и тд...]
```java
public Map<Integer, Integer> calculateRepeats(List<Integer> input) {
    Map<Integer, Integer>
}
```



## other Lesson 7

Развернуть собственный лист
-
Есть ListNode некоторый и есть у него какое-то значение</br>
int val. Я хочу реализовать метод reverseListNode(ListNode head),</br>
который возвращает ListNode. Мы хотим развернуть, т.е</br>
если на вход я получил:</br>
1 -> 2 -> 3 -> null</br>
то на выход я должен получить:</br>
3 -> 2 -> 1 -> null</br>

```java
public class ListNode {
    ListNode next;
    int val;
}

public ListNode reverseListNode(ListNode head) {
    return null;
}
```

## other Lesson 8

C помощью какой коллекции можно развернуть массив
-
C помощью какой коллекции можно развернуть массив ?
- Stack
- Queue
- Priority Queue


## other Lesson 9

Cоздайте комментарий который будет выполнятся
-
Создайте комментарий, который будет выполнятся</br>
Ну вот, приехали! С самых первых лекций мы слышали о том, что комментарии не выполняются.</br>
На то они и комментарии. Думаем, решение этой задачи для Java-программиста,</br>
даже опытного, — не всегда очевидно. Тем не менее, есть один хитрый способ,</br>
как заставить Java-машину «легально» запустить комментарий на выполнение.</br>
Чувствуете, откуда ветер дует? Попробуйте предположить!</br>



## other Lesson 10

Создание бесконечного цикла на пустом месте
-
```java
class ToInfinity {
    public static void main(String[] args) {


// впишите код сюда


        for (int i = start; i <= start + 1; i++) {
            /* тут должен быть бесконечный цикл, менять ничего нельзя */
        }
    }
}

```


## other Lesson 11
Cоздать именованный цикл
-
Создать именованный цикл</br>
Ещё один представитель серии «практические задачи по программированию,</br>
Java в сферическом вакууме». В том смысле, что непонятно, зачем это нужно,</br>
вряд ли цикл чувствует обиду от того, что он обезличен. Ну да ладно, важно другое: язык позволяет дать циклу имя.</br>
Решение</br>
Примечание: кому-то такие "имена" известны как "метки", которые не рекомендуется использовать на практике.</br>
