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

package net.gtaun.shoebill.event.player

import net.gtaun.shoebill.entities.Player
import net.gtaun.util.event.Interruptable

/**
 * This event represents the OnPlayerCommandText of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerCommandText](https://wiki.sa-mp.com/wiki/OnPlayerCommandText)
 *
 * @property command The associated command for this event.
 */
class PlayerCommandEvent(player: Player, val command: String) : PlayerEvent(player), Interruptable {
    /**
     * Returns the current response value
     * @return Current response value
     */
    var response = 0
        private set

    /**
     * This method is an alias for the interrupt() method.
     * @see PlayerCommandEvent.interrupt
     */
    fun setProcessed() {
        this.response = 1
        interrupt()
    }

}
