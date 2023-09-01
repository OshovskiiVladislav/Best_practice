# Tasks from other sources

+ [Lesson 1. С помощью какой коллекции можно отсортировать массив ?](#other-Lesson-1) ![icon][done]
+ [Lesson 2. Lost number in number sequence ?](#other-Lesson-2) ![icon][done]
+ [Lesson 3. Метод который меняет ключи и значениями местами map](#other-Lesson-3) ![icon][done]
+ [Lesson 4. Получить Map, где ключи и значения поменяны местами](#other-Lesson-4) ![icon][done]
+ [Lesson 5. Метод получающий строку из чисел и сумирующий все числа](#other-Lesson-5) ![icon][done]
+ [Lesson 6. Метод сколько повторяется каждое из чисел](#other-Lesson-6) ![icon][done]
+ [Lesson 7. Развернуть собственный лист](#other-Lesson-7) ![icon][done]
+ [Lesson 8. C помощью какой коллекции можно развернуть массив](#other-Lesson-8) ![icon][done]
+ [Lesson 9. Cоздайте комментарий который будет выполнятся](#other-Lesson-9) ![icon][done]
+ [Lesson 10. Создание бесконечного цикла на пустом месте](#other-Lesson-10) ![icon][done]
+ [Lesson 11. Cоздать именованный цикл](#other-Lesson-11) ![icon][done]
+ [Lesson 12. Вычисление квадратного корня без библиотечных методов](#other-Lesson-12) ![icon][done] 
+ [Lesson 13. Развернуть строку](#other-Lesson-13) ![icon][done]
+ [Lesson 14. Вычисление арифметического выражения из строки методом рекурсивного спуска](#other-Lesson-14) ![icon][done]
+ [Lesson 15. Многопоточность.Разделить и перевернуть строку](#other-Lesson-15) ![icon][done]
+ [Lesson 16. Реализация задачи о ферзях в многопотоке](#other-Lesson-16) ![icon][done]
+ [Lesson 17. Получить Map, где ключи и значения поменяны местами](#other-Lesson-16) ![icon][done]

[Список разделов](README.md)

[done]:src/main/resources/image/done.png


## other Lesson 1

С помощью какой коллекции можно отсортировать массив ?
-
C помощью какой коллекции можно отсортировать массив ?
- Stack
- Queue
- Priority Queue

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 2

Lost number in number sequence ?
-
An ordered sequence of numbers from 1 to N is given. One number might have deleted from it, then the remaining numbers 
were mixed. Find the number that was deleted.

**Example:**

The starting array sequence is [1,2,3,4,5,6,7,8,9]
The mixed array with one deleted number is [3,2,4,6,7,8,1,9]
Your function should return the int 5.
If no number was deleted from the array and no difference with it, your function should return the int 0.

Note: N may be 1 or less (in the latter case, the first array will be []).

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 3

Set Alarm
-
L1: Set Alarm

Write a function named setAlarm which receives two parameters. The first parameter, employed, is true whenever you 
are employed and the second parameter, vacation is true whenever you are on vacation. The function should return true 
if you are employed and not on vacation (because these are the circumstances under which you need to set an alarm). 
It should return false otherwise. Examples:

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

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 4

Получить Map, где ключи и значения поменяны местами
-
```
Пишем метод, который на вход Map <K,V> и возвращет Map, где ключи и значения поменяны местами
Так как значения могут совпадать, то тип значения в Map будет уже не K, а Collection<K>
```

[к оглавлению](#Tasks-from-other-sources)


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

[к оглавлению](#Tasks-from-other-sources)


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

[к оглавлению](#Tasks-from-other-sources)


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

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 8

C помощью какой коллекции можно развернуть массив
-
C помощью какой коллекции можно развернуть массив ?
- Stack
- Queue
- Priority Queue

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 9

Cоздайте комментарий который будет выполнятся
-
Создайте комментарий, который будет выполнятся</br>
Ну вот, приехали! С самых первых лекций мы слышали о том, что комментарии не выполняются.</br>
На то они и комментарии. Думаем, решение этой задачи для Java-программиста,</br>
даже опытного, — не всегда очевидно. Тем не менее, есть один хитрый способ,</br>
как заставить Java-машину «легально» запустить комментарий на выполнение.</br>
Чувствуете, откуда ветер дует? Попробуйте предположить!</br>

[к оглавлению](#Tasks-from-other-sources)


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

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 11
Cоздать именованный цикл
-
Создать именованный цикл</br>
Ещё один представитель серии «практические задачи по программированию,</br>
Java в сферическом вакууме». В том смысле, что непонятно, зачем это нужно,</br>
вряд ли цикл чувствует обиду от того, что он обезличен. Ну да ладно, важно другое: язык позволяет дать циклу имя.</br>
Решение</br>
Примечание: кому-то такие "имена" известны как "метки", которые не рекомендуется использовать на практике.</br>

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 12
Вычисление квадратного корня без библиотечных методов
-
```java
class Sqrt {
    public int calculateSqrt(int input){
    
    }
}
```
Реализовать метод calculateSqrt(int input) вычесление квадратного корня из числа. При этом мы
читаем только целые части этого квадратного корня, т.е.:</br>
Если передать 9, то ответом будет 3</br>
Если передать 4, то ответом будет 2</br>
Если передать 5, то ответом будет 2

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 13
Развернуть строку
-
Задача: развернуть строку:</br>
abc -> cba

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 14
Вычисление арифметического выражения из строки методом рекурсивного спуска
-
необходимо написать алгоритм, который вычислит значение любого, синтаксически правильного выражения в строке

* PARSER RULES:
1. expr : plusminus* EOF ;
2. plusminus: multdiv ( ( '+' | '-' ) multdiv )* ;
3. multdiv : factor ( ( '*' | '/' ) factor )* ; 
4. factor : NUMBER | '(' expr ')' ;

Пояснения:</br>
"определение" : "что это"</br>
"( )*" - это выражение может повторятся 1 или более раз</br>
Все, что удовлетворяет этим 4-м правилам является корректным арифметическим выражением, которое можно вычеслить.</br>
EOF - end of file

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 15
Многопоточность.Разделить и перевернуть строку
-

Задача с собеседования. Используя многопоточность принять на вход строку и вернуть её назад перевернутой.
Пример:
input: 12345678
output: 21436587

[к оглавлению](#Tasks-from-other-sources)


## other Lesson 16
Реализация задачи о ферзях в многопотоке
-
Есть стандартная задача о расстановки ферзей на шахматной доске,чтобы они не били друг друга(все возможные расстановки)
Code:
```java
public class ferzi {
    private int SIZE ;
    private int board[][];
    private int results_count = 0;
    private int threadsCount;
    public ferzi(int N,int potok){
        SIZE=N;
        board=new int [N][N];
        //zan=new boolean [N][N];
        results_count=0;
        threadsCount=potok;
    }
    public boolean tryQueen(int a, int b) {
        for (int i = 0; i < a; ++i)
            if (board[i][b]==1)
                return false;
 
        for (int i = 1; i <= a && b - i >= 0; ++i)
            if (board[a - i][b - i]==1)
                return false;
 
        for (int i = 1; i <= a && b + i < SIZE; i++)
            if (board[a - i][b + i]==1)
                return false;
 
        return true;
    }
    public void setQueen(int a){
        if (a == SIZE) {
            ++results_count;
            System.out.print("Result #" + results_count +'\n');
            showBoard();
            return;
        }
        for(int i = 0; i < SIZE; ++i){
            if (tryQueen(a, i)) {
                board[a][i] = 1;
                setQueen(a + 1);
                board[a][i] = 0;
            }
        }
 
        return;
    }
    public  void showBoard(){
        for (int a = 0; a < SIZE; ++a)
        {
            for (int b = 0; b < SIZE; ++b)
            {
                System.out.print((board[a][b]==1) ? "Q " : ". ");
            }
            System.out.print('\n');
        }
    }
```

Main method:
```java
public class Main {
    public static void main(String args[]) {
         ferzi fer = new ferzi(4,5);
         fer. setQueen(0);
        }
}
```

Необходимо сделать из обычной реализацию,реализацию на потоках.

[к оглавлению](#Tasks-from-other-sources)
