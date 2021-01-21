// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.quantum.implementation;

import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.PagedResponseBase;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.logging.ClientLogger;
import com.microsoft.azure.quantum.fluent.ProvidersClient;
import com.microsoft.azure.quantum.models.ProviderStatus;
import com.microsoft.azure.quantum.models.ProviderStatusList;
import com.microsoft.azure.quantum.models.RestErrorException;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in ProvidersClient. */
public final class ProvidersClientImpl implements ProvidersClient {
    private final ClientLogger logger = new ClientLogger(ProvidersClientImpl.class);

    /** The proxy service used to perform REST calls. */
    private final ProvidersService service;

    /** The service client containing this operation class. */
    private final QuantumClientImpl client;

    /**
     * Initializes an instance of ProvidersClientImpl.
     *
     * @param client the instance of the service client containing this operation class.
     */
    ProvidersClientImpl(QuantumClientImpl client) {
        this.service =
                RestProxy.create(ProvidersService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for QuantumClientProviders to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "QuantumClientProvide")
    private interface ProvidersService {
        @Get(
                "/v1.0/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Quantum/workspaces/{workspaceName}/providerStatus")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(RestErrorException.class)
        Mono<Response<ProviderStatusList>> getStatus(
                @HostParam("$host") String host,
                @PathParam("subscriptionId") String subscriptionId,
                @PathParam("resourceGroupName") String resourceGroupName,
                @PathParam("workspaceName") String workspaceName,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(RestErrorException.class)
        Mono<Response<ProviderStatusList>> getStatusNext(
                @PathParam(value = "nextLink", encoded = true) String nextLink,
                @HostParam("$host") String host,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Get provider status.
     *
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderStatus>> getStatusSinglePageAsync() {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getResourceGroupName() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getResourceGroupName() is required and cannot be null."));
        }
        if (this.client.getWorkspaceName() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getWorkspaceName() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(
                        context ->
                                service.getStatus(
                                        this.client.getHost(),
                                        this.client.getSubscriptionId(),
                                        this.client.getResourceGroupName(),
                                        this.client.getWorkspaceName(),
                                        accept,
                                        context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get provider status.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderStatus>> getStatusSinglePageAsync(Context context) {
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        if (this.client.getSubscriptionId() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getSubscriptionId() is required and cannot be null."));
        }
        if (this.client.getResourceGroupName() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getResourceGroupName() is required and cannot be null."));
        }
        if (this.client.getWorkspaceName() == null) {
            return Mono.error(
                    new IllegalArgumentException(
                            "Parameter this.client.getWorkspaceName() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getStatus(
                        this.client.getHost(),
                        this.client.getSubscriptionId(),
                        this.client.getResourceGroupName(),
                        this.client.getWorkspaceName(),
                        accept,
                        context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get provider status.
     *
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider status.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderStatus> getStatusAsync() {
        return new PagedFlux<>(() -> getStatusSinglePageAsync(), nextLink -> getStatusNextSinglePageAsync(nextLink));
    }

    /**
     * Get provider status.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider status.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<ProviderStatus> getStatusAsync(Context context) {
        return new PagedFlux<>(
                () -> getStatusSinglePageAsync(context), nextLink -> getStatusNextSinglePageAsync(nextLink, context));
    }

    /**
     * Get provider status.
     *
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider status.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderStatus> getStatus() {
        return new PagedIterable<>(getStatusAsync());
    }

    /**
     * Get provider status.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return provider status.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<ProviderStatus> getStatus(Context context) {
        return new PagedIterable<>(getStatusAsync(context));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return providers status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderStatus>> getStatusNextSinglePageAsync(String nextLink) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return FluxUtil.withContext(context -> service.getStatusNext(nextLink, this.client.getHost(), accept, context))
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return providers status.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<ProviderStatus>> getStatusNextSinglePageAsync(String nextLink, Context context) {
        if (nextLink == null) {
            return Mono.error(new IllegalArgumentException("Parameter nextLink is required and cannot be null."));
        }
        if (this.client.getHost() == null) {
            return Mono.error(
                    new IllegalArgumentException("Parameter this.client.getHost() is required and cannot be null."));
        }
        final String accept = "application/json";
        return service.getStatusNext(nextLink, this.client.getHost(), accept, context)
                .map(
                        res ->
                                new PagedResponseBase<>(
                                        res.getRequest(),
                                        res.getStatusCode(),
                                        res.getHeaders(),
                                        res.getValue().getValue(),
                                        res.getValue().getNextLink(),
                                        null));
    }
}
