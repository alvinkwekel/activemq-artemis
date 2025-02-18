/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.activemq.artemis.cli.commands;

import picocli.CommandLine;

@CommandLine.Command(name = "pwd", description = "Information on current folder and instance.")
public class PWD extends ActionAbstract {

   @Override
   public Object execute(ActionContext context) throws Exception {
      super.execute(context);

      System.out.println();
      System.out.println("*******************************************************************************************************************************");
      System.out.println("* Artemis instance:: " + getBrokerInstance());
      System.out.println("* Home:: " + getBrokerHome());
      System.out.println("* etc:: " + getBrokerEtc());

      String canonicalPath = new java.io.File(".").getCanonicalPath();
      System.out.println("* Current dir:" + canonicalPath);
      System.out.println("*******************************************************************************************************************************");
      System.out.println();

      return null;
   }
}