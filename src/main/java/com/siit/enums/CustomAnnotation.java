package com.siit.enums;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;

@Target({FIELD, METHOD, TYPE}) // defineste pe ce elemente poate fi folosita annotarea
@Retention(value = RetentionPolicy.RUNTIME)
@Documented // face ca annotarea noastra(CustomAnnotation) sa apara in documentatia claselor unde e folosita
public @interface CustomAnnotation {


}
