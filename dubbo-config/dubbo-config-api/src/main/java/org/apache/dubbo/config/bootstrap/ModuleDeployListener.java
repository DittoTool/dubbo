/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.dubbo.config.bootstrap;

import org.apache.dubbo.common.extension.ExtensionScope;
import org.apache.dubbo.common.extension.SPI;
import org.apache.dubbo.rpc.model.ModuleModel;

/**
 * Module deploy listener
 */
@SPI(scope = ExtensionScope.MODULE)
public interface ModuleDeployListener {

    /**
     * Notify after module is started (export/refer services)
     * @param moduleModel
     */
    void onModuleStarted(ModuleModel moduleModel);

    /**
     * Notify after module is stopped
     * @param moduleModel
     */
    void onModuleStopped(ModuleModel moduleModel);

}
