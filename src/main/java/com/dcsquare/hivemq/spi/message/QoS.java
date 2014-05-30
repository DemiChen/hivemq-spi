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

package com.dcsquare.hivemq.spi.message;

/**
 * @author Dominik Obermaier
 * @since 1.4
 */
public enum QoS {

    AT_MOST_ONCE(0), AT_LEAST_ONCE(1), EXACTLY_ONCE(2);
    private final int qosNumber;

    QoS(final int qosNumber) {

        this.qosNumber = qosNumber;
    }

    public int getQosNumber() {
        return qosNumber;
    }

    public static QoS valueOf(final int i) {

        for (final QoS qoS : QoS.values()) {
            if (qoS.getQosNumber() == i) {
                return qoS;
            }
        }
        return null;
    }
}
