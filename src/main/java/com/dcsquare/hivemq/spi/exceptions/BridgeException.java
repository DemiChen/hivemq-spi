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

package com.dcsquare.hivemq.spi.exceptions;

/**
 * An exception which indicates that a bridge error occurred or a bridge configuration
 * was invalid
 *
 * @author Dominik Obermaier
 * @since 2.0
 */
public class BridgeException extends RuntimeException {
    public BridgeException(final String message) {
        super(message);
    }

    public BridgeException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BridgeException(Throwable cause) {
        super(cause);
    }

    protected BridgeException(final String message, final Throwable cause, final boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
