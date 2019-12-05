package com.training.beans;

import javax.inject.Inject;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class BookManager {
/*    @Inject
    private DiscountService service;*/

    @Inject
    private Service service;

    public double findPrice(Book book){
        double discountPercentage=service.findDiscount(book);
        double netAmount=book.getPrice()-book.getPrice()*discountPercentage;
        return netAmount;
    }

    public String getDetails(){
        Book bk=new Book();

        Class clsRef=bk.getClass();
        Annotation annotation=clsRef.getAnnotation(SampleBook.class);
        SampleBook anotRef=((SampleBook)annotation);
        bk.setBookName(anotRef.name());
        bk.setBookId(anotRef.id());
        bk.setPrice(anotRef.price());
        return bk.toString();
    }

}
