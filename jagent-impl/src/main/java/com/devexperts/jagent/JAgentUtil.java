package com.devexperts.jagent;

/*
 * #%L
 * JAgent Impl
 * %%
 * Copyright (C) 2015 - 2016 Devexperts, LLC
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

/**
 * Utility class that helps to implement {@link JAgent}.
 */
public class JAgentUtil {

    /**
     * Returns implementation title of package for specified class.
     */
    public static String getImplTitle(Class<?> clazz) {
        return clazz.getPackage().getImplementationTitle();
    }

    /**
     * Returns implementation version of package for specified class.
     */
    public static String getImplVersion(Class<?> clazz) {
        return clazz.getPackage().getImplementationVersion();
    }

}