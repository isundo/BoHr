/**
 * Copyright (c) 2019 The Bohr Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.bohr.util.exception;

public class UnreachableException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public UnreachableException() {
        super("Should never reach here");
    }

    public UnreachableException(String message, Throwable cause, boolean enableSuppression,
            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public UnreachableException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnreachableException(String message) {
        super(message);
    }

    public UnreachableException(Throwable cause) {
        super(cause);
    }
}
