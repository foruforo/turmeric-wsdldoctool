/*******************************************************************************
 * Copyright (c) 2006-2010 eBay Inc. All Rights Reserved.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *******************************************************************************/
package org.ebayopensource.turmeric.tools.annoparser.outputgenerator.impl;

import org.ebayopensource.turmeric.tools.annoparser.WSDLDocInterface;
import org.ebayopensource.turmeric.tools.annoparser.XSDDocInterface;
import org.ebayopensource.turmeric.tools.annoparser.context.OutputGenaratorParam;
import org.ebayopensource.turmeric.tools.annoparser.outputgenerator.OutputGenerator;

/**
 * The Class TestOpGenClass is just a test implementation to check if Custom
 * Class is getting Instantiated.
 * 
 * @author sdaripelli
 */
public class TestOpGenClass implements OutputGenerator {

	/**
	 * {@inheritDoc}
	 */
	public void generateWsdlOutput(WSDLDocInterface wsdlDoc,
			OutputGenaratorParam outputGenaratorParam) {
		System.out.println(" IN Handle WSDL Doc");

	}

	/**
	 * {@inheritDoc}
	 */
	public void generateXsdOutput(XSDDocInterface xsdDoc,
			OutputGenaratorParam outputGenaratorParam) {
		System.out.println(" IN Handle XSD Doc");

	}

	/**
	 * {@inheritDoc}
	 */
	public void completeProcessing() {
		// TODO Auto-generated method stub

	}

}
