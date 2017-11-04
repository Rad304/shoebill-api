/**
 * Copyright (C) 2012-2014 MK124

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 * http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.service

import net.gtaun.shoebill.Shoebill

/**
 * @author MK124
 * @author Marvin Haschker
 */
interface ServiceStore {

    fun <T : Service> getService(type: Class<T>): T?
    fun <T : Service> getServiceEntry(type: Class<T>): ServiceEntry?

    fun <T : Service> isServiceAvailable(type: Class<T>): Boolean

    val serviceEntries: Collection<ServiceEntry>

    companion object {
        fun get(): ServiceStore = Shoebill.get().serviceStore
    }
}
