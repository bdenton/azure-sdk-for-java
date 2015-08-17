/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.compute.models;

import java.net.URI;

/**
* Parameters supplied to the Get Package operation.
*/
public class DeploymentGetPackageParameters {
    private URI containerUri;
    
    /**
    * Required. Specifies the URI of the container to which the packages will
    * be saved.
    * @return The ContainerUri value.
    */
    public URI getContainerUri() {
        return this.containerUri;
    }
    
    /**
    * Required. Specifies the URI of the container to which the packages will
    * be saved.
    * @param containerUriValue The ContainerUri value.
    */
    public void setContainerUri(final URI containerUriValue) {
        this.containerUri = containerUriValue;
    }
    
    private Boolean overwriteExisting;
    
    /**
    * Optional. Specifies whether an existing package in the storage container
    * should be overwritten.
    * @return The OverwriteExisting value.
    */
    public Boolean isOverwriteExisting() {
        return this.overwriteExisting;
    }
    
    /**
    * Optional. Specifies whether an existing package in the storage container
    * should be overwritten.
    * @param overwriteExistingValue The OverwriteExisting value.
    */
    public void setOverwriteExisting(final Boolean overwriteExistingValue) {
        this.overwriteExisting = overwriteExistingValue;
    }
    
    /**
    * Initializes a new instance of the DeploymentGetPackageParameters class.
    *
    */
    public DeploymentGetPackageParameters() {
    }
    
    /**
    * Initializes a new instance of the DeploymentGetPackageParameters class
    * with required arguments.
    *
    */
    public DeploymentGetPackageParameters(URI containerUri) {
        if (containerUri == null) {
            throw new NullPointerException("containerUri");
        }
        this.setContainerUri(containerUri);
    }
}
