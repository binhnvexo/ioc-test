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
package exoplatform;

import org.exoplatform.listener.SimpleListener;

/**
 * Created by The eXo Platform SAS
 * Author : BinhNV
 *          binhnv@exoplatform.com
 * Jul 3, 2012  
 */
public class ClassOne {

  private SimpleListener listener;
  private ClassTwo two;
  
  /**
   * 
   */
  public ClassOne(ClassTwo two) {
    this.two = two;
  }

  /**
   * @return the listener
   */
  public SimpleListener getListener() {
    return listener;
  }

  /**
   * @param listener the listener to set
   */
  public void setListener(SimpleListener listener) {
    this.listener = listener;
  }

  public void listenerAction() {
    listener.doExecute();
  }
  
  /**
   * @return the two
   */
  public ClassTwo getTwo() {
    return two;
  }

  /**
   * @param two the two to set
   */
  public void setTwo(ClassTwo two) {
    this.two = two;
  }

}
