//
// Copyright (c) 2012 Red Hat, Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//           http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.ovirt.engine.sdk.codegen.utils;

/**
 * Provides String related services
 */
public class StringUtils {
    /**
     * Determinates if given string is in plural form
     * 
     * @param candidate
     *            candidate to check
     * 
     * @return boolean
     */
    public static boolean isPlural(String candidate) {
        return candidate.endsWith("s");
    }

    /**
     * Determinates if given string is in singular form
     * 
     * @param candidate
     *            candidate to check
     * 
     * @return boolean
     */
    public static boolean isSingular(String candidate) {
        return !StringUtils.isPlural(candidate);
    }

    /**
     * Wraps to UpperCase first char in candidate
     * 
     * @param candidate
     * 
     * @return candidate
     */
    public static String toUpperCase(String candidate) {
        return Character.toUpperCase(candidate.charAt(0)) + candidate.substring(1);
    }
}