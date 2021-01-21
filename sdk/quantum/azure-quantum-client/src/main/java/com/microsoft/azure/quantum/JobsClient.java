// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.microsoft.azure.quantum;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.PagedResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.microsoft.azure.quantum.models.JobDetails;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in JobsClient. */
public interface JobsClient {
    /**
     * List jobs.
     *
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PagedResponse<JobDetails>> listSinglePageAsync();

    /**
     * List jobs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PagedResponse<JobDetails>> listSinglePageAsync(Context context);

    /**
     * List jobs.
     *
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<JobDetails> listAsync();

    /**
     * List jobs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<JobDetails> listAsync(Context context);

    /**
     * List jobs.
     *
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobDetails> list();

    /**
     * List jobs.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<JobDetails> list(Context context);

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobDetails>> getWithResponseAsync(String jobId);

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobDetails>> getWithResponseAsync(String jobId, Context context);

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobDetails> getAsync(String jobId);

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobDetails> getAsync(String jobId, Context context);

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobDetails get(String jobId);

    /**
     * Get job by id.
     *
     * @param jobId Id of the job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job by id.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobDetails> getWithResponse(String jobId, Context context);

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobDetails>> createWithResponseAsync(String jobId, JobDetails job);

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<JobDetails>> createWithResponseAsync(String jobId, JobDetails job, Context context);

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobDetails> createAsync(String jobId, JobDetails job);

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<JobDetails> createAsync(String jobId, JobDetails job, Context context);

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    JobDetails create(String jobId, JobDetails job);

    /**
     * Create a job.
     *
     * @param jobId Id of the job.
     * @param job The complete metadata of the job to submit.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<JobDetails> createWithResponse(String jobId, JobDetails job, Context context);

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> cancelWithResponseAsync(String jobId);

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Void>> cancelWithResponseAsync(String jobId, Context context);

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> cancelAsync(String jobId);

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> cancelAsync(String jobId, Context context);

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void cancel(String jobId);

    /**
     * Cancel a job.
     *
     * @param jobId Id of the job.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.microsoft.azure.quantum.models.RestErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> cancelWithResponse(String jobId, Context context);

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PagedResponse<JobDetails>> listNextSinglePageAsync(String nextLink);

    /**
     * Get the next page of items.
     *
     * @param nextLink The nextLink parameter.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.exception.HttpResponseException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of job details.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<PagedResponse<JobDetails>> listNextSinglePageAsync(String nextLink, Context context);
}
