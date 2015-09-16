/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fr.insset.ccm.m1.util;

/**
 *
 * @author jldeleage
 */
public class ExceptionDepassementIterationBag extends Exception {

    public ExceptionDepassementIterationBag(Bag bag) {
        this.bag = bag;
    }

    public ExceptionDepassementIterationBag(Bag bag, String message) {
        super(message);
        this.bag = bag;
    }

    public ExceptionDepassementIterationBag(Bag bag, String message, Throwable cause) {
        super(message, cause);
        this.bag = bag;
    }

    public ExceptionDepassementIterationBag(Bag bag, Throwable cause) {
        super(cause);
        this.bag = bag;
    }

    public ExceptionDepassementIterationBag(Bag bag, String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.bag = bag;
    }

    public ExceptionDepassementIterationBag() {
    }

    public ExceptionDepassementIterationBag(String message) {
        super(message);
    }

    public ExceptionDepassementIterationBag(String message, Throwable cause) {
        super(message, cause);
    }

    public ExceptionDepassementIterationBag(Throwable cause) {
        super(cause);
    }

    public ExceptionDepassementIterationBag(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    public Bag      bag;

}
