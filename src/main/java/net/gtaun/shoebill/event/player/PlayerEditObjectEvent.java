/**
 * Copyright (C) 2012 MK124
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.gtaun.shoebill.event.player;

import net.gtaun.shoebill.constant.ObjectEditResponse;
import net.gtaun.shoebill.data.Location;
import net.gtaun.shoebill.object.Player;
import net.gtaun.shoebill.object.SampObject;
import net.gtaun.util.event.Interruptable;

/**
 * 
 * 
 * @author MK124
 */
public class PlayerEditObjectEvent extends PlayerEvent implements Interruptable
{
	private SampObject object;
	private ObjectEditResponse editResponse;
    private Location oldLocation;

    public PlayerEditObjectEvent(Player player, SampObject object, ObjectEditResponse response, Location oldLocation) {
		super(player);
		this.object = object;
		this.editResponse = response;
        this.oldLocation = oldLocation;
    }
	
	@Override
	public void interrupt()
	{
		super.interrupt();
	}
	
	public SampObject getObject()
	{
		return object;
	}

    public Location getOldLocation() {
        return oldLocation;
    }

    public ObjectEditResponse getEditResponse() {
		return editResponse;
	}
}
