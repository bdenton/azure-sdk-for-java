/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import rx.Observable;

/**
 * Type representing VirtualMachineSizes.
 */
public interface VirtualMachineSizes {
    /**
     * Returns supported VM Sizes in a location.
     *
     * @param location The location upon which virtual-machine-sizes is queried.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<VirtualMachineSizeListResult> listAsync(String location);

}
