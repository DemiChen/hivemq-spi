/*
 * Copyright 2014 dc-square GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hivemq.spi.callback.lowlevel;

import com.hivemq.spi.callback.AsynchronousCallback;
import com.hivemq.spi.callback.LowlevelCallback;
import com.hivemq.spi.message.PUBCOMP;
import com.hivemq.spi.security.ClientData;

/**
 * The OnPubcompSend callback gets executed after a PUBCOMP message was sent by HiveMQ
 * to a client.
 *
 * @author Christian Goetz
 * @since 1.4
 */
public interface OnPubcompSend extends AsynchronousCallback, LowlevelCallback {

    /**
     * This method gets called when HiveMQ sends a PUBCOMP message to a client. It's not possible to interfere
     * with HiveMQ in this callback and this callback is for information purposes only
     *
     * @param pubcomp    the PUBCOMP message HiveMQ sends to a client
     * @param clientData the ClientData for the client HiveMQ sends the PUBCOMP message to
     */
    void onPubcompSend(PUBCOMP pubcomp, ClientData clientData);
}
