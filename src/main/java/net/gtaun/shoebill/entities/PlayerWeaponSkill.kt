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

package net.gtaun.shoebill.entities

import net.gtaun.shoebill.constant.WeaponSkill

/**
 * This class has functions and methods to handle the WeaponSkill of a [Player].
 *
 * @author MK124
 * @author Marvin Haschker
 */
interface PlayerWeaponSkill : PlayerRelated {
    fun setLevel(type: WeaponSkill, level: Int)
    fun getLevel(type: WeaponSkill): Int
}
