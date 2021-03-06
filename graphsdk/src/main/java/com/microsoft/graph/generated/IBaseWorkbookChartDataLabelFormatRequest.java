// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Base Workbook Chart Data Label Format Request.
 */
public interface IBaseWorkbookChartDataLabelFormatRequest extends IHttpRequest {

    /**
     * Gets the WorkbookChartDataLabelFormat from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookChartDataLabelFormat> callback);

    /**
     * Gets the WorkbookChartDataLabelFormat from the service
     * @return The WorkbookChartDataLabelFormat from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartDataLabelFormat get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookChartDataLabelFormat with a source
     * @param sourceWorkbookChartDataLabelFormat The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookChartDataLabelFormat sourceWorkbookChartDataLabelFormat, final ICallback<WorkbookChartDataLabelFormat> callback);

    /**
     * Patches this WorkbookChartDataLabelFormat with a source
     * @param sourceWorkbookChartDataLabelFormat The source object with updates
     * @return The updated WorkbookChartDataLabelFormat
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartDataLabelFormat patch(final WorkbookChartDataLabelFormat sourceWorkbookChartDataLabelFormat) throws ClientException;

    /**
     * Posts a WorkbookChartDataLabelFormat with a new object
     * @param newWorkbookChartDataLabelFormat The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookChartDataLabelFormat newWorkbookChartDataLabelFormat, final ICallback<WorkbookChartDataLabelFormat> callback);

    /**
     * Posts a WorkbookChartDataLabelFormat with a new object
     * @param newWorkbookChartDataLabelFormat The new object to create
     * @return The created WorkbookChartDataLabelFormat
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookChartDataLabelFormat post(final WorkbookChartDataLabelFormat newWorkbookChartDataLabelFormat) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookChartDataLabelFormatRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookChartDataLabelFormatRequest expand(final String value);

}

