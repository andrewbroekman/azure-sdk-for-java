/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.relay.v2017_04_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.relay.v2017_04_01.RelayNamespace;
import rx.Observable;
import com.microsoft.azure.management.relay.v2017_04_01.RelayUpdateParameters;
import org.joda.time.DateTime;
import com.microsoft.azure.management.relay.v2017_04_01.Sku;
import com.microsoft.azure.management.relay.v2017_04_01.ProvisioningStateEnum;
import rx.functions.Func1;

class RelayNamespaceImpl extends GroupableResourceCoreImpl<RelayNamespace, RelayNamespaceInner, RelayNamespaceImpl, RelayManager> implements RelayNamespace, RelayNamespace.Definition, RelayNamespace.Update {
    private RelayUpdateParameters updateParameter;
    RelayNamespaceImpl(String name, RelayNamespaceInner inner, RelayManager manager) {
        super(name, inner, manager);
        this.updateParameter = new RelayUpdateParameters();
    }

    @Override
    public Observable<RelayNamespace> createResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<RelayNamespaceInner, RelayNamespaceInner>() {
               @Override
               public RelayNamespaceInner call(RelayNamespaceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<RelayNamespace> updateResourceAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<RelayNamespaceInner, RelayNamespaceInner>() {
               @Override
               public RelayNamespaceInner call(RelayNamespaceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<RelayNamespaceInner> getInnerAsync() {
        NamespacesInner client = this.manager().inner().namespaces();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new RelayUpdateParameters();
    }

    @Override
    public DateTime createdAt() {
        return this.inner().createdAt();
    }

    @Override
    public String metricId() {
        return this.inner().metricId();
    }

    @Override
    public ProvisioningStateEnum provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String serviceBusEndpoint() {
        return this.inner().serviceBusEndpoint();
    }

    @Override
    public Sku sku() {
        return this.inner().sku();
    }

    @Override
    public DateTime updatedAt() {
        return this.inner().updatedAt();
    }

    @Override
    public RelayNamespaceImpl withSku(Sku sku) {
        if (isInCreateMode()) {
            this.inner().withSku(sku);
        } else {
            this.updateParameter.withSku(sku);
        }
        return this;
    }

}