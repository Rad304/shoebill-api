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
import net.gtaun.shoebill.entities.PlayerKeyState
import net.gtaun.util.event.Disallowable

/**
 * This event represents the OnPlayerKeyStateChange of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerKeyStateChange](https://wiki.sa-mp.com/wiki/OnPlayerKeyStateChange)
 *
 * @property oldState The associated old PlayerKeyState for this event.
 */
class PlayerKeyStateChangeEvent(player: Player, val oldState: PlayerKeyState) : PlayerEvent(player), Disallowable {
    /**
     * The current response value
     */
    var response = 1
        private set

    /**
     * Disallows the further execution of this event in the whole abstract machine (also Pawn and other Plugins).
     */
    override fun disallow() {
        this.response = this.response and 0
        interrupt()
    }

}
