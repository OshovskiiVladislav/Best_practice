package com.oshovskii.practice.yandex.lesson2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class BeautifulString {
    public static void main(String[] args) throws IOException {
        findBeautifulStringStupid();
    }

    public static void findBeautifulStringStupid() throws IOException {
        String content = Files
                .readString(Paths.get("src/main/java/com/oshovskii/practice/yandex/lesson2/input.txt"));

        String[] lines = content.split("\\r?\\n");

        Integer max = Integer.valueOf(lines[0]);

        String[] parts = lines[1].split("");

        HashMap<Integer, Integer> hashMap = new HashMap<>((int) (parts.length * 1.5));

        HashMap<Integer, Integer> resultMap = twoPointerSearch(hashMap, max, parts);

        int answer = 0;
        for (Integer value : resultMap.values()) {
            if (answer < value) {
                answer = value;
            }
        }
        System.out.println("Answer: " + answer);
    }

    private static HashMap<Integer, Integer> twoPointerSearch(HashMap<Integer, Integer> hashMap, Integer max,
                                                              String[] parts) {
        // Replacement
        int index2;
        // Count each letter
        int result;

        for (int i = 0, tmp; i < parts.length; i = i + 1 + tmp) {
            System.out.println("External cycle - part[i] = " + parts[i]);
            // index2 - remaining replacements
            index2 = max;
            result = 1;
            // j - movies "while"
            int j = 1;
            // previousElements - elements to be skipped
            int previousElements = 0;
            tmp = 0;

            while (index2 >= 0) {
                if ((i + j < parts.length)) {
                    if (parts[i].equals(parts[i + j])) {
                        hashMap.put(i, ++result);
                        // If we haven't made a replacement yet
                        if (index2 == max) {
                            tmp++;
                        }
                    } else {
                        index2--;
                        if (index2 == -1) {
                            break;
                        }
                        hashMap.put(i, ++result);
                        previousElements = tmp;
                    }
                    j++;
                } else {
                    break;
                }
            }
            System.out.println("tmp = " + tmp);
            checkLastLetterAndSkipElements(hashMap, parts, i, index2, j, previousElements);
        }
        return hashMap;
    }

    private static HashMap<Integer, Integer> checkLastLetterAndSkipElements(HashMap<Integer, Integer> resultMap,
                                                                            String[] parts, int i, int index2,
                                                                            int j, int previousElements) {
        resultMap.putIfAbsent(i, 1);

        if (i + j != i) {
            resultMap.put(i, resultMap.get(i) + previousElements);
        }
        // If we are at the end, but there are still free replacements
        if (i + j == parts.length && index2 > 0) {
            int elementsNotReplacements = parts.length - resultMap.get(i);
            if (elementsNotReplacements >= index2) {
                resultMap.put(i, resultMap.get(i) + index2);
            } else {
                resultMap.put(i, resultMap.get(i) + elementsNotReplacements);
            }
        }
        return resultMap;
    }

    public static Integer findBeautifulFromString2(Integer max, String input) {
        int index1;
        int index2;
        int result;

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        String[] parts = input.split("");

        System.out.println("Parts: " + Arrays.toString(parts));
        System.out.println("Parts length: " + parts.length);

        for (int i = 0; i < parts.length; i++) {
            index1 = i;
            index2 = max;
            result = 1;
            int j = 0;

            System.out.println("parts[" + i + "] = " + parts[i]);

            while (index2 >= 0) {
                if ((i + j + 1 < parts.length)) {

                    if (parts[i].equals(parts[i + j + 1])) {
                        hashMap.put(index1, ++result);
                        j++;
                        System.out.println("IF | hashMap.put(" + index1 + "): " + hashMap.get(index1));
                        System.out.println("INDEX2 = " + index2);
                    } else {
                        index2--;
                        if (index2 == -1) {
                            break;
                        }
                        hashMap.put(index1, ++result);
                        j++;
                        System.out.println("ELSE | hashMap.put(" + index1 + "): " + hashMap.get(index1));
                        System.out.println("INDEX2 = " + index2);
                    }
                } else {
                    break;
                }
            }
            // If we have reached the end of the line but there are still free substitutions
            if (i + j + 1 == parts.length && index2 > 0 && hashMap.containsKey(index1)) {
                System.out.println("If the end");
                // That seems like a miss by the developers...
                int remainingReplacements = parts.length - hashMap.get(index1) - index2;
                System.out.println("RemainingReplacements = " + parts.length + "-" + hashMap.get(index1) + "-" + index2 + "=" + remainingReplacements);
                if (remainingReplacements <= 0) {
                    continue;
                } else {
                    hashMap.put(index1, hashMap.get(index1) + index2);
                    System.out.println("Replenishment | hashMap.put: " + hashMap.get(index1));
                }
            }
            System.out.println("j: " + j);
            System.out.println("*********************************************************");
        }

        int answer = 0;
        for (Integer value : hashMap.values()) {

            if (answer < value) {
                answer = value;

            }
        }
        return answer;
    }

    public static <T, E> Set<T> getKeysByValue(Map<T, E> map, E value) {
        Set<T> keys = new HashSet<T>();
        for (Map.Entry<T, E> entry : map.entrySet()) {
            if (Objects.equals(value, entry.getValue())) {
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}
