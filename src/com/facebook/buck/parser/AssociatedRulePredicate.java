/*
 * Copyright 2014-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package com.facebook.buck.parser;

import com.facebook.buck.rules.ActionGraph;
import com.facebook.buck.rules.BuildRule;

/**
 * Matches build rules based on their association with actions in the given action graph.
 * @param <T> The interface all rules matched by the predicate implement.
 */
public interface AssociatedRulePredicate {
  public boolean isMatch(
      BuildRule buildRule,
      ActionGraph actionGraph);
}
