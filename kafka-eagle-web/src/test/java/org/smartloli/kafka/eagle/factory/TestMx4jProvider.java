/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 *
 */
package org.smartloli.kafka.eagle.factory;

import org.smartloli.kafka.eagle.core.factory.Mx4jFactory;
import org.smartloli.kafka.eagle.core.factory.Mx4jService;

/**
 * Test Provider clazz.
 *
 * @author smartloli.
 *
 *         Created by Jul 17, 2017
 */
public class TestMx4jProvider {

    public static void main(String[] args) {
        Mx4jService mx4j = new Mx4jFactory().create();
        System.out.println(mx4j.bytesInPerSec("cluster1", "slave01:9999 "));
    }

}
