package com.oshovskii.practice.yandex.lesson4;

import java.util.ArrayList;
import java.util.List;

public class VerificationWork {

    public static List calculateWork(int students, int countTasks, int petyaRow, int schoolDesk) {
        int variantVasya = verificationWork(students, countTasks, petyaRow, schoolDesk);
        List<Integer> result = new ArrayList();
        if (variantVasya == -1) {
            result.add(-1);
            return result;
        }
        if (variantVasya % 2 == 0) {
            result.add(variantVasya / 2);
            result.add(2);
        } else {
            result.add((variantVasya + 1) / 2);
            result.add(1);
        }
        return result;
    }

    public static int verificationWork(int students, int countTasks, int petyaRow, int schoolDesk) {

        if (countTasks >= students) {
            return -1;
        }

        int repeatVariant = students % countTasks;
        int petyaVariant;

        if (schoolDesk == 1) {
            petyaVariant = petyaRow * 2 - 1;
        } else {
            petyaVariant = petyaRow * 2;
        }

        if (petyaVariant <= repeatVariant || repeatVariant == 0) {

        } else {
            return -1;
        }

        return countTasks + petyaVariant;
    }
}
