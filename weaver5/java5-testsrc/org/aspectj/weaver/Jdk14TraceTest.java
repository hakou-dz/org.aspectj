/*******************************************************************************
 * Copyright (c) 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Matthew Webster - initial implementation
 *******************************************************************************/
package org.aspectj.weaver;

import org.aspectj.weaver.tools.DefaultTrace;
import org.aspectj.weaver.tools.Jdk14Trace;

import junit.framework.TestCase;

public class Jdk14TraceTest extends TestCase {

	private Jdk14Trace trace; 
	
	protected void setUp() throws Exception {
		super.setUp();
		trace = new Jdk14Trace(getClass());
		trace.setTraceEnabled(true);
	}

	public void testJdk14Trace() {
		Jdk14Trace trace = new Jdk14Trace(getClass());
	}

	public void testEnterWithThisAndArgs() {
		trace.enter("testEnterWithThisAndArgs",this,new Object[] { "arg1", "arg2" });
	}

	public void testEnterWithThis() {
		trace.enter("testEnterWithThis",this);
	}

	public void testEnter() {
		trace.enter("testEnter");
	}

	public void testExitWithReturn() {
		trace.exit("testExitWithReturn","ret");
	}

	public void testExitWithThrowable() {
		trace.exit("testExitWithThrowable",new RuntimeException());
	}

	public void testExit() {
		trace.exit("testExit");
	}

	public void testIsTraceEnabled() {
		DefaultTrace trace = new DefaultTrace(getClass());
		assertFalse(trace.isTraceEnabled());
	}

	public void testSetTraceEnabled() {
		DefaultTrace trace = new DefaultTrace(getClass());
		trace.setTraceEnabled(true);
		assertTrue(trace.isTraceEnabled());
	}

}