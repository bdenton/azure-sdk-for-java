// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
// 
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network.models;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.Delete;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.Put;
import com.azure.core.annotation.QueryParam;
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
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.management.network.ErrorException;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in
 * P2SVpnServerConfigurations.
 */
public final class P2SVpnServerConfigurationsInner {
    /**
     * The proxy service used to perform REST calls.
     */
    private P2SVpnServerConfigurationsService service;

    /**
     * The service client containing this operation class.
     */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of P2SVpnServerConfigurationsInner.
     * 
     * @param client the instance of the service client containing this operation class.
     */
    public P2SVpnServerConfigurationsInner(NetworkManagementClientImpl client) {
        this.service = RestProxy.create(P2SVpnServerConfigurationsService.class, client.getHttpPipeline(), client.getSerializerAdapter());
        this.client = client;
    }

    /**
     * The interface defining all the services for
     * NetworkManagementClientP2SVpnServerConfigurations to be used by the
     * proxy service to perform REST calls.
     */
    @Host("{$host}")
    @ServiceInterface(name = "NetworkManagementClientP2SVpnServerConfigurations")
    private interface P2SVpnServerConfigurationsService {
        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWanName}/p2sVpnServerConfigurations/{p2SVpnServerConfigurationName}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<P2SVpnServerConfigurationInner>> get(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWanName") String virtualWanName, @PathParam("p2SVpnServerConfigurationName") String p2SVpnServerConfigurationName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWanName}/p2sVpnServerConfigurations/{p2SVpnServerConfigurationName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWanName") String virtualWanName, @PathParam("p2SVpnServerConfigurationName") String p2SVpnServerConfigurationName, @BodyParam("application/json") P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWanName}/p2sVpnServerConfigurations/{p2SVpnServerConfigurationName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<Flux<ByteBuffer>>> delete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWanName") String virtualWanName, @PathParam("p2SVpnServerConfigurationName") String p2SVpnServerConfigurationName, @QueryParam("api-version") String apiVersion);

        @Get("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWanName}/p2sVpnServerConfigurations")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<ListP2SVpnServerConfigurationsResultInner>> listByVirtualWan(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWanName") String virtualWanName, @QueryParam("api-version") String apiVersion);

        @Put("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWanName}/p2sVpnServerConfigurations/{p2SVpnServerConfigurationName}")
        @ExpectedResponses({200, 201})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<P2SVpnServerConfigurationInner>> beginCreateOrUpdate(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWanName") String virtualWanName, @PathParam("p2SVpnServerConfigurationName") String p2SVpnServerConfigurationName, @BodyParam("application/json") P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters, @QueryParam("api-version") String apiVersion);

        @Delete("/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/virtualWans/{virtualWanName}/p2sVpnServerConfigurations/{p2SVpnServerConfigurationName}")
        @ExpectedResponses({200, 202, 204})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<Response<Void>> beginDelete(@HostParam("$host") String host, @PathParam("subscriptionId") String subscriptionId, @PathParam("resourceGroupName") String resourceGroupName, @PathParam("virtualWanName") String virtualWanName, @PathParam("p2SVpnServerConfigurationName") String p2SVpnServerConfigurationName, @QueryParam("api-version") String apiVersion);

        @Get("{nextLink}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(ErrorException.class)
        Mono<SimpleResponse<ListP2SVpnServerConfigurationsResultInner>> listByVirtualWanNext(@PathParam(value = "nextLink", encoded = true) String nextLink);
    }

    /**
     * Retrieves the details of a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<P2SVpnServerConfigurationInner>> getWithResponseAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        final String apiVersion = "2019-06-01";
        return service.get(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, apiVersion);
    }

    /**
     * Retrieves the details of a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<P2SVpnServerConfigurationInner> getAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        return getWithResponseAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName)
            .flatMap((SimpleResponse<P2SVpnServerConfigurationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Retrieves the details of a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public P2SVpnServerConfigurationInner get(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        return getAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName).block();
    }

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @param p2SVpnServerConfigurationParameters P2SVpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters) {
        final String apiVersion = "2019-06-01";
        return service.createOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, p2SVpnServerConfigurationParameters, apiVersion);
    }

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @param p2SVpnServerConfigurationParameters P2SVpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<P2SVpnServerConfigurationInner> createOrUpdateAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = createOrUpdateWithResponseAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, p2SVpnServerConfigurationParameters);
        return client.<P2SVpnServerConfigurationInner, P2SVpnServerConfigurationInner>getLroResultAsync(response, client.getHttpPipeline(), P2SVpnServerConfigurationInner.class, P2SVpnServerConfigurationInner.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @param p2SVpnServerConfigurationParameters P2SVpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public P2SVpnServerConfigurationInner createOrUpdate(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters) {
        return createOrUpdateAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, p2SVpnServerConfigurationParameters).block();
    }

    /**
     * Deletes a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        final String apiVersion = "2019-06-01";
        return service.delete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, apiVersion);
    }

    /**
     * Deletes a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> deleteAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        Mono<SimpleResponse<Flux<ByteBuffer>>> response = deleteWithResponseAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName);
        return client.<Void, Void>getLroResultAsync(response, client.getHttpPipeline(), Void.class, Void.class)
            .last()
            .flatMap(AsyncPollResponse::getFinalResult);
    }

    /**
     * Deletes a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void delete(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        deleteAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName).block();
    }

    /**
     * Retrieves all P2SVpnServerConfigurations for a particular VirtualWan.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<P2SVpnServerConfigurationInner>> listByVirtualWanSinglePageAsync(String resourceGroupName, String virtualWanName) {
        final String apiVersion = "2019-06-01";
        return service.listByVirtualWan(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWanName, apiVersion).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }

    /**
     * Retrieves all P2SVpnServerConfigurations for a particular VirtualWan.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedFlux<P2SVpnServerConfigurationInner> listByVirtualWanAsync(String resourceGroupName, String virtualWanName) {
        return new PagedFlux<>(
            () -> listByVirtualWanSinglePageAsync(resourceGroupName, virtualWanName),
            nextLink -> listByVirtualWanNextSinglePageAsync(nextLink));
    }

    /**
     * Retrieves all P2SVpnServerConfigurations for a particular VirtualWan.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<P2SVpnServerConfigurationInner> listByVirtualWan(String resourceGroupName, String virtualWanName) {
        return new PagedIterable<>(listByVirtualWanAsync(resourceGroupName, virtualWanName));
    }

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @param p2SVpnServerConfigurationParameters P2SVpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SimpleResponse<P2SVpnServerConfigurationInner>> beginCreateOrUpdateWithResponseAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters) {
        final String apiVersion = "2019-06-01";
        return service.beginCreateOrUpdate(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, p2SVpnServerConfigurationParameters, apiVersion);
    }

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @param p2SVpnServerConfigurationParameters P2SVpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<P2SVpnServerConfigurationInner> beginCreateOrUpdateAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters) {
        return beginCreateOrUpdateWithResponseAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, p2SVpnServerConfigurationParameters)
            .flatMap((SimpleResponse<P2SVpnServerConfigurationInner> res) -> {
                if (res.getValue() != null) {
                    return Mono.just(res.getValue());
                } else {
                    return Mono.empty();
                }
            });
    }

    /**
     * Creates a P2SVpnServerConfiguration to associate with a VirtualWan if it doesn't exist else updates the existing P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @param p2SVpnServerConfigurationParameters P2SVpnServerConfiguration Resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public P2SVpnServerConfigurationInner beginCreateOrUpdate(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName, P2SVpnServerConfigurationInner p2SVpnServerConfigurationParameters) {
        return beginCreateOrUpdateAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, p2SVpnServerConfigurationParameters).block();
    }

    /**
     * Deletes a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Void>> beginDeleteWithResponseAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        final String apiVersion = "2019-06-01";
        return service.beginDelete(this.client.getHost(), this.client.getSubscriptionId(), resourceGroupName, virtualWanName, p2SVpnServerConfigurationName, apiVersion);
    }

    /**
     * Deletes a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Void> beginDeleteAsync(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        return beginDeleteWithResponseAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName)
            .flatMap((Response<Void> res) -> Mono.empty());
    }

    /**
     * Deletes a P2SVpnServerConfiguration.
     * 
     * @param resourceGroupName 
     * @param virtualWanName 
     * @param p2SVpnServerConfigurationName 
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void beginDelete(String resourceGroupName, String virtualWanName, String p2SVpnServerConfigurationName) {
        beginDeleteAsync(resourceGroupName, virtualWanName, p2SVpnServerConfigurationName).block();
    }

    /**
     * Get the next page of items.
     * 
     * @param nextLink null
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws ErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<PagedResponse<P2SVpnServerConfigurationInner>> listByVirtualWanNextSinglePageAsync(String nextLink) {
        return service.listByVirtualWanNext(nextLink).map(res -> new PagedResponseBase<>(
            res.getRequest(),
            res.getStatusCode(),
            res.getHeaders(),
            res.getValue().value(),
            res.getValue().nextLink(),
            null));
    }
}