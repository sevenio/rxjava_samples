package com.example.main;

import io.reactivex.Observable;

public class MyClass {
    public static void main(String[] args) {
        Observable<String> myStrings =
                Observable.just("Alpha", "Beta", "Gamma", "Delta",
                        "Epsilon");
        myStrings.map(String::length).subscribe(System.out::println);
    }
}