/**
 * Copyright (c) 2019 The Bohr Developers
 *
 * Distributed under the MIT software license, see the accompanying file
 * LICENSE or https://opensource.org/licenses/mit-license.php
 */
package org.bohr.net.msg.p2p;

import org.bohr.net.msg.Message;
import org.bohr.net.msg.MessageCode;
import org.bohr.util.SimpleEncoder;

// NOTE: GetNodesMessage is encoded into a single empty frame.

public class GetNodesMessage extends Message {

    /**
     * Create a GET_NODES message.
     *
     */
    public GetNodesMessage() {
        super(MessageCode.GET_NODES, NodesMessage.class);

        SimpleEncoder enc = new SimpleEncoder();
        this.body = enc.toBytes();
    }

    /**
     * Parse a GET_NODES message from byte array.
     * 
     * @param body
     */
    public GetNodesMessage(byte[] body) {
        super(MessageCode.GET_NODES, NodesMessage.class);

        this.body = body;
    }

    @Override
    public String toString() {
        return "GetNodesMessage";
    }
}
