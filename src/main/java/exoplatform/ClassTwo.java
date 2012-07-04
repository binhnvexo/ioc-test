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

import org.exoplatform.container.xml.InitParams;

/**
 * Created by The eXo Platform SAS
 * Author : BinhNV
 *          binhnv@exoplatform.com
 * Jul 3, 2012  
 */
public class ClassTwo {

  public String test;
  private int b1;
  private int b2;
  
  /**
   * 
   */
  public ClassTwo(InitParams params) {
    test = "TEST";
    b1 = Integer.valueOf(params.getValueParam("B1").getValue());
    b2 = Integer.valueOf(params.getValueParam("B2").getValue());
  }

  /**
   * @return the b1
   */
  public int getB1() {
    return b1;
  }

  /**
   * @param b1 the b1 to set
   */
  public void setB1(int b1) {
    this.b1 = b1;
  }

  /**
   * @return the b2
   */
  public int getB2() {
    return b2;
  }

  /**
   * @param b2 the b2 to set
   */
  public void setB2(int b2) {
    this.b2 = b2;
  }

}
