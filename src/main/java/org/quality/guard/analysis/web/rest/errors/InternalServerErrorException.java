/*******************************************************************************
 * Copyright (C) 2019 Softeam
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.quality.guard.analysis.web.rest.errors;

import org.zalando.problem.AbstractThrowableProblem;
import org.zalando.problem.Status;

/**
 * Simple exception with a message, that returns an Internal Server Error code.
 */
public class InternalServerErrorException extends AbstractThrowableProblem {

    public InternalServerErrorException(String message) {
        super(ErrorConstants.DEFAULT_TYPE, message, Status.INTERNAL_SERVER_ERROR);
    }
}