package com.oshovskii.practice.other.lesson9;

public class ExecutableComment {
    /**
     * Комментарий ниже будет выполнен!
     * Если набрать код этой задачи по джава в IDE, вот что мы получим:
     * <p>
     * выполняемый комментарий
     * <p>
     * Причина в том, что компилятор Java считывает Unicod-символ  \u000d как новую строку, и читает наш код следующим образом:
     * <p>
     * Расшифрованный компилятором код решения задачи на Java:
     * <p>
     * public class ExecutableComment {
     * public static void main(String[] args) {
     * // the line below this gives an output
     * // \u000d
     * System.out.println("comment executed");
     * }
     * }
     */
    public static void main(String[] args) {
        // \u000d System.out.println("выполняемый комментарий");
    }
}
