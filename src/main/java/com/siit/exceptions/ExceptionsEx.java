package com.siit.exceptions;

import lombok.extern.log4j.Log4j;

@Log4j
public class ExceptionsEx {

    public static void main(String[] args) {
        try {
            ageInMonths(Integer.parseInt(args[0]));
        } catch (NumberFormatException | IndexOutOfBoundsException numberFormatExceptionReference) {
            System.out.println("first program argument needs to be an int:    " + numberFormatExceptionReference.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            try {
                ageInMonths(12);
            } catch (CustomCheckedException customCheckedException) {
                customCheckedException.printStackTrace();
            }
            throw new NumberFormatException();
        } catch (CustomRuntimeException ex){
            System.err.println(ex.getMessage());
//            ex.printStackTrace();
//            log.error(ex);
        } catch (CustomCheckedException ex){
            System.err.println(ex.getMessage());
//            ex.printStackTrace();
//            log.error(ex);
        }
//        StringIndexOutOfBoundsException
    }

    static int ageInMonths(int age) throws CustomRuntimeException, CustomCheckedException {
        if (age < 0) {
//            throw new CustomRuntimeException("age should be >= 0");
            throw new CustomCheckedException("age should be >= 0");
        }
        return age * 12;
    }

}
