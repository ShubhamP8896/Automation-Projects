package com.qa.pages;

import com.qa.utilities.BrowserUtility;
import com.qa.utilities.ElementsUtility;
import com.qa.utilities.JavaScriptExecutorUtility;
import com.qa.utilities.WaitsUtility;


/**
 * This is our base page class, we will add all the utility class objects here with proctected access modifier
 * and we will extend this class with Page classes so they no need to create the objects in each page class
 * They directly able to use the objectRef directly.
 */

public abstract class P_001_BasePage 
{
	protected final ElementsUtility elementsUtility =
            new ElementsUtility();

    protected final BrowserUtility browserUtility =
            new BrowserUtility();

    protected final WaitsUtility waitsUtility =
            new WaitsUtility();

    protected final JavaScriptExecutorUtility jsUtility =
            new JavaScriptExecutorUtility();
}
