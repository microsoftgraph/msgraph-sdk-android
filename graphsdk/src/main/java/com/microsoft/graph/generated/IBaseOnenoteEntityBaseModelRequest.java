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
 * The interface for the Base Onenote Entity Base Model Request.
 */
public interface IBaseOnenoteEntityBaseModelRequest extends IHttpRequest {

    /**
     * Gets the OnenoteEntityBaseModel from the service
     * @param callback The callback to be called after success or failure.
     */
    void getOnenoteEntityBaseModel(final ICallback<OnenoteEntityBaseModel> callback);

    /**
     * Gets the OnenoteEntityBaseModel from the service
     * @return The OnenoteEntityBaseModel from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenoteEntityBaseModel getOnenoteEntityBaseModel() throws ClientException;

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
     * Patches this OnenoteEntityBaseModel with a source
     * @param sourceOnenoteEntityBaseModel The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final OnenoteEntityBaseModel sourceOnenoteEntityBaseModel, final ICallback<OnenoteEntityBaseModel> callback);

    /**
     * Patches this OnenoteEntityBaseModel with a source
     * @param sourceOnenoteEntityBaseModel The source object with updates
     * @return The updated OnenoteEntityBaseModel
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenoteEntityBaseModel patch(final OnenoteEntityBaseModel sourceOnenoteEntityBaseModel) throws ClientException;

    /**
     * Posts a OnenoteEntityBaseModel with a new object
     * @param newOnenoteEntityBaseModel The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final OnenoteEntityBaseModel newOnenoteEntityBaseModel, final ICallback<OnenoteEntityBaseModel> callback);

    /**
     * Posts a OnenoteEntityBaseModel with a new object
     * @param newOnenoteEntityBaseModel The new object to create
     * @return The created OnenoteEntityBaseModel
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OnenoteEntityBaseModel post(final OnenoteEntityBaseModel newOnenoteEntityBaseModel) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseOnenoteEntityBaseModelRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseOnenoteEntityBaseModelRequest expand(final String value);

}
