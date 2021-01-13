/**
 * Copyright (c) 2019 The Bohr Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.bohr.api.http;

public class HttpConstants {
    public static final int MAX_BODY_SIZE = 4 * 1024 * 1024;

    public static final int MAX_INITIAL_LINE_LENGTH = 2 * 1024 * 1024;
    public static final int MAX_HEADER_SIZE = 2 * 1024 * 1024;
    public static final int MAX_CHUNK_SIZE = 2 * 1024 * 1024;
}
