/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.healthcareapis.v2020_03_15.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.healthcareapis.v2020_03_15.ServicesDescription;
import rx.Observable;
import com.microsoft.azure.management.healthcareapis.v2020_03_15.Kind;
import com.microsoft.azure.management.healthcareapis.v2020_03_15.ResourceIdentity;
import com.microsoft.azure.management.healthcareapis.v2020_03_15.ServicesProperties;

class ServicesDescriptionImpl extends GroupableResourceCoreImpl<ServicesDescription, ServicesDescriptionInner, ServicesDescriptionImpl, HealthcareApisManager> implements ServicesDescription, ServicesDescription.Definition, ServicesDescription.Update {
    ServicesDescriptionImpl(String name, ServicesDescriptionInner inner, HealthcareApisManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ServicesDescription> createResourceAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ServicesDescription> updateResourceAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<ServicesDescriptionInner> getInnerAsync() {
        ServicesInner client = this.manager().inner().services();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }


    @Override
    public String etag() {
        return this.inner().etag();
    }

    @Override
    public ResourceIdentity identity() {
        return this.inner().identity();
    }

    @Override
    public Kind kind() {
        return this.inner().kind();
    }

    @Override
    public ServicesProperties properties() {
        return this.inner().properties();
    }

    @Override
    public ServicesDescriptionImpl withKind(Kind kind) {
        this.inner().withKind(kind);
        return this;
    }

    @Override
    public ServicesDescriptionImpl withEtag(String etag) {
        this.inner().withEtag(etag);
        return this;
    }

    @Override
    public ServicesDescriptionImpl withIdentity(ResourceIdentity identity) {
        this.inner().withIdentity(identity);
        return this;
    }

    @Override
    public ServicesDescriptionImpl withProperties(ServicesProperties properties) {
        this.inner().withProperties(properties);
        return this;
    }

}
