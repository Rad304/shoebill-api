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

package net.gtaun.shoebill.event.checkpoint

import net.gtaun.shoebill.entities.Player

/**
 * This event will be called when the [player] enters a RaceCheckpoint.
 *
 * @author MK124
 * @author Marvin Haschker
 */
class RaceCheckpointLeaveEvent(player: Player) : RaceCheckpointEvent(player, player.raceCheckpoint!!) {

    /**
     * This method is an alias for the interrupt() method.
     * @see RaceCheckpointLeaveEvent.interrupt
     */
    fun setProcessed() = interrupt()
}
