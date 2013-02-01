/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2008, Red Hat Middleware LLC, and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.picketlink.common.exceptions.fed;

import java.security.GeneralSecurityException;

/**
 * Exception indicating that the IssueInstant is missing
 *
 * @author Anil.Saldhana@redhat.com
 * @since Jun 3, 2009
 */
public class IssueInstantMissingException extends GeneralSecurityException {
    private static final long serialVersionUID = 1L;

    public IssueInstantMissingException() {
        super();
    }

    public IssueInstantMissingException(String message, Throwable cause) {
        super(message, cause);
    }

    public IssueInstantMissingException(String msg) {
        super(msg);
    }

    public IssueInstantMissingException(Throwable cause) {
        super(cause);
    }
}