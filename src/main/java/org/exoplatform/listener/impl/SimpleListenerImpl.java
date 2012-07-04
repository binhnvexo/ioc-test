/*
 * Copyright (C) 2003-2012 eXo Platform SAS.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package org.exoplatform.listener.impl;

import org.exoplatform.listener.SimpleListener;

/**
 * Created by The eXo Platform SAS
 * Author : BinhNV
 *          binhnv@exoplatform.com
 * Jul 3, 2012  
 */
public class SimpleListenerImpl implements SimpleListener {

  /* (non-Javadoc)
   * @see org.exoplatform.container.component.ComponentPlugin#getName()
   */
  @Override
  public String getName() {
    return null;
  }

  /* (non-Javadoc)
   * @see org.exoplatform.container.component.ComponentPlugin#setName(java.lang.String)
   */
  @Override
  public void setName(String s) {

  }

  /* (non-Javadoc)
   * @see org.exoplatform.container.component.ComponentPlugin#getDescription()
   */
  @Override
  public String getDescription() {
    return null;
  }

  /* (non-Javadoc)
   * @see org.exoplatform.container.component.ComponentPlugin#setDescription(java.lang.String)
   */
  @Override
  public void setDescription(String s) {

  }

  /* (non-Javadoc)
   * @see org.exoplatform.listener.SimpleListener#doExecute()
   */
  @Override
  public void doExecute() {
    System.out.println("+=============================================================================+");
    System.out.println("+                       Test Container successful                             +");
    System.out.println("+=============================================================================+");
  }

}
