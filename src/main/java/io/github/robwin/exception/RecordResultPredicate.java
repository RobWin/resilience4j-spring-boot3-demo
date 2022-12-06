package io.github.robwin.exception;

import java.util.function.Predicate;

public class RecordResultPredicate implements Predicate<Integer> {
    @Override
    public boolean test(Integer status) {
        if(status==404)
            return true;
        return false;

    }
}