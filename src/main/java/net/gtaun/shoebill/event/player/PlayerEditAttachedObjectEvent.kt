/**
 * Copyright (C) 2015-2016 MK124

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

import net.gtaun.shoebill.data.Vector3D
import net.gtaun.shoebill.entities.Player
import net.gtaun.shoebill.entities.PlayerAttach.PlayerAttachSlot

/**
 * This event represents the OnPlayerEditAttachedObject of Pawn.
 *
 * @author MK124
 * @author Marvin Haschker
 * @see [OnPlayerEditAttachedObject](https://wiki.sa-mp.com/wiki/OnPlayerEditAttachedObject)
 */
class PlayerEditAttachedObjectEvent(player: Player,
                                    /**
                                     * The associated slot for whom player the testing was attached for this event.
                                     */
                                    val slot: PlayerAttachSlot,
                                    /**
                                     * The response of the event.
                                     */
                                    val response: Int,
                                    /**
                                     * The associated offset for this event.
                                     */
                                    val offset: Vector3D,
                                    /**
                                     * The associated rotation for this event.
                                     */
                                    val rotation: Vector3D,
                                    /**
                                     * The associated scale for this event.
                                     */
                                    val scale: Vector3D) : PlayerEvent(player)