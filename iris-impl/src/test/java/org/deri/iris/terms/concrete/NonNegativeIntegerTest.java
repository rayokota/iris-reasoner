/*
 * Integrated Rule Inference System (IRIS):
 * An extensible rule inference system for datalog with extensions.
 * 
 * Copyright (C) 2008 Semantic Technology Institute (STI) Innsbruck, 
 * University of Innsbruck, Technikerstrasse 21a, 6020 Innsbruck, Austria.
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, 
 * MA  02110-1301, USA.
 */

package org.deri.iris.terms.concrete;

import java.net.URI;

import org.deri.iris.api.terms.INumericTerm;
import org.deri.iris.api.terms.concrete.XmlSchemaDatatype;
import org.deri.iris.terms.AbstractConcreteTermTest;

/**
 * <p>
 * Test the implementation of the NonNegativeInteger data-type.
 * </p>
 * 
 * @author Adrian Marte
 */
public class NonNegativeIntegerTest extends AbstractConcreteTermTest {

	@Override
	protected INumericTerm createBasic() {
		return new NonNegativeInteger(0);
	}

	@Override
	protected String createBasicString() {
		return "0";
	}

	@Override
	protected INumericTerm createEqual() {
		return new NonNegativeInteger(0);
	}

	@Override
	protected String createEqualString() {
		return "0";
	}

	@Override
	protected INumericTerm createGreater() {
		return new NonNegativeInteger(1337);
	}

	@Override
	protected String createGreaterString() {
		return "1337";
	}

	@Override
	protected URI getDatatypeIRI() {
		return XmlSchemaDatatype.NON_NEGATIVE_INTEGER.toUri();
	}
	
	public void testValidity() {
		try {
			new NonNegativeInteger(0);
		} catch (IllegalArgumentException e) {
			fail("0 is a valid value for nonNegativeInteger");
		}
		
		try {
			new NonNegativeInteger(-1);
			fail("Did not recognize invalid value");
		} catch (IllegalArgumentException e) {
		}
		
		try {
			new NonNegativeInteger(-12131);
			fail("Did not recognize invalid value");
		} catch (IllegalArgumentException e) {
		}
	}

}
