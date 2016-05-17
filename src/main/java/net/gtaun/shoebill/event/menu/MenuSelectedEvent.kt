/**
 * Copyright (C) 2011 MK124

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

package net.gtaun.shoebill.event.menu

import net.gtaun.shoebill.entities.Menu
import net.gtaun.shoebill.entities.Player
import net.gtaun.util.event.Interruptable

/**
 * This event will be called when the [player] selected a row from the [menu].
 *
 * @author MK124
 * @author Marvin Haschker
 */
class MenuSelectedEvent(menu: Menu, player: Player,
                        /**
                         * The selected row that has been selected by the [player].
                         */
                        val row: Int) : MenuEvent(menu, player), Interruptable {

    /**
     * This method stops further execution of this event in Shoebill.
     */
    override fun interrupt() {
        super.interrupt()
    }

    /**
     * This method is an alias for the [interrupt] method.
     */
    fun setProcessed() = interrupt()
}
