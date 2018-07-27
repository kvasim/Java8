package com.java.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(value=RetentionPolicy.RUNTIME)
@Illustrate( {
   Illustrate.Feature.annotation,
   Illustrate.Feature.enumeration,
   Illustrate.Feature.forLoop,
   Illustrate.Feature.generics} )
public @interface Illustrate {
    enum Feature {
        annotation, enumeration, forLoop,
        generics, autoboxing, varargs;

        @Override public String toString() {
            return "the " + name() + " feature";
        }
    };
    Feature[] value() default {Feature.annotation};
}
