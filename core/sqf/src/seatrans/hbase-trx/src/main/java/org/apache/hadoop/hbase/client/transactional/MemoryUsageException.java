// @@@ START COPYRIGHT @@@
//
// (C) Copyright 2013-2015 Hewlett-Packard Development Company, L.P.
//
//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
//
// @@@ END COPYRIGHT @@@
package org.apache.hadoop.hbase.client.transactional;

/** Thrown when the memory usage percentage for a regionserver is
 *  over a configured threshold
 */

public class MemoryUsageException extends Exception {

  private static final long serialVersionUID = 8225624871402252367L;

  /** Default Constructor */
  public MemoryUsageException() {
    super();
  }

  /**
   * @param arg0 message
   * @param arg1 cause
   */
  public MemoryUsageException(String arg0, Throwable arg1) {
    super(arg0, arg1);
  }

  /**
   * @param arg0 message
   */
  public MemoryUsageException(String arg0) {
    super(arg0);
  }

  /**
   * @param arg0 cause
   */
  public MemoryUsageException(Throwable arg0) {
    super(arg0);
  }

}
