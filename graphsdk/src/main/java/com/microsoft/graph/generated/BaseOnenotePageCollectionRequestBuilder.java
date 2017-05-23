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
 * The class for the Base Onenote Page Collection Request Builder.
 */
public class BaseOnenotePageCollectionRequestBuilder extends BaseRequestBuilder implements IBaseOnenotePageCollectionRequestBuilder {

    /**
     * The request builder for this collection of OnenoteSection
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseOnenotePageCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IOnenotePageCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOnenotePageCollectionRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new OnenotePageCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOnenotePageRequestBuilder byId(final String id) {
        return new OnenotePageRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }
}
