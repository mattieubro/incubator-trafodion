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

import java.io.IOException;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.hadoop.hbase.client.transactional.TransactionState;


// Singleton TransactionState map.
//
public class TransactionMap {
  private static final ConcurrentHashMap<Long, TransactionState> g_mapTransactionStates
                       = new ConcurrentHashMap<Long, TransactionState>();
  
  public TransactionMap() {
    //System.out.println("TransactionMap ctor");
  }
  public static synchronized ConcurrentHashMap<Long, TransactionState> getInstance() {
    return g_mapTransactionStates;
  }
}