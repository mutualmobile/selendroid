/*
 * Copyright 2007-2009 Selenium committers
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.openqa.selendroid.server.model;



import java.util.List;
import java.util.NoSuchElementException;

public interface SearchContext {
  /**
   * Find all elements within the current context using the given mechanism.
   * 
   * @param by The locating mechanism to use
   * @return A list of all {@link AndroidElement}s, or an empty list if nothing matches
   * @see org.openqa.selenium.By
   */
  List<AndroidElement> findElements(By by);


  /**
   * Find the first {@link AndroidElement} using the given method.
   * 
   * @param by The locating mechanism
   * @return The first matching element on the current context
   * @throws NoSuchElementException If no matching elements are found
   */
  AndroidElement findElement(By by);
}
