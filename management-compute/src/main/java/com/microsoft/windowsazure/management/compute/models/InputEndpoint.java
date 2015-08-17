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

import java.net.InetAddress;

/**
* Objects that provide input endpoint details.
*/
public class InputEndpoint {
    private Boolean enableDirectServerReturn;
    
    /**
    * Optional. Specifies whether direct server return is enabled for the
    * endpoint.
    * @return The EnableDirectServerReturn value.
    */
    public Boolean isEnableDirectServerReturn() {
        return this.enableDirectServerReturn;
    }
    
    /**
    * Optional. Specifies whether direct server return is enabled for the
    * endpoint.
    * @param enableDirectServerReturnValue The EnableDirectServerReturn value.
    */
    public void setEnableDirectServerReturn(final Boolean enableDirectServerReturnValue) {
        this.enableDirectServerReturn = enableDirectServerReturnValue;
    }
    
    private EndpointAcl endpointAcl;
    
    /**
    * Optional. Specifies the list of access control rules for the endpoint.
    * @return The EndpointAcl value.
    */
    public EndpointAcl getEndpointAcl() {
        return this.endpointAcl;
    }
    
    /**
    * Optional. Specifies the list of access control rules for the endpoint.
    * @param endpointAclValue The EndpointAcl value.
    */
    public void setEndpointAcl(final EndpointAcl endpointAclValue) {
        this.endpointAcl = endpointAclValue;
    }
    
    private String loadBalancedEndpointSetName;
    
    /**
    * Optional. Specifies a name for a set of load-balanced endpoints.
    * Specifying this name in multiple endpoints adds them all to the set.
    * This element is only listed for Virtual Machine deployments.
    * @return The LoadBalancedEndpointSetName value.
    */
    public String getLoadBalancedEndpointSetName() {
        return this.loadBalancedEndpointSetName;
    }
    
    /**
    * Optional. Specifies a name for a set of load-balanced endpoints.
    * Specifying this name in multiple endpoints adds them all to the set.
    * This element is only listed for Virtual Machine deployments.
    * @param loadBalancedEndpointSetNameValue The LoadBalancedEndpointSetName
    * value.
    */
    public void setLoadBalancedEndpointSetName(final String loadBalancedEndpointSetNameValue) {
        this.loadBalancedEndpointSetName = loadBalancedEndpointSetNameValue;
    }
    
    private String loadBalancerName;
    
    /**
    * Optional. Optional. Specify the name of an internal load balancer if this
    * endpoint shall not be exposed on the default load balancer.
    * @return The LoadBalancerName value.
    */
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }
    
    /**
    * Optional. Optional. Specify the name of an internal load balancer if this
    * endpoint shall not be exposed on the default load balancer.
    * @param loadBalancerNameValue The LoadBalancerName value.
    */
    public void setLoadBalancerName(final String loadBalancerNameValue) {
        this.loadBalancerName = loadBalancerNameValue;
    }
    
    private LoadBalancerProbe loadBalancerProbe;
    
    /**
    * Optional. Contains properties that specify the endpoint settings which
    * the Azure load balancer uses to monitor the availability of this virtual
    * machine before forwarding traffic to the endpoint.
    * @return The LoadBalancerProbe value.
    */
    public LoadBalancerProbe getLoadBalancerProbe() {
        return this.loadBalancerProbe;
    }
    
    /**
    * Optional. Contains properties that specify the endpoint settings which
    * the Azure load balancer uses to monitor the availability of this virtual
    * machine before forwarding traffic to the endpoint.
    * @param loadBalancerProbeValue The LoadBalancerProbe value.
    */
    public void setLoadBalancerProbe(final LoadBalancerProbe loadBalancerProbeValue) {
        this.loadBalancerProbe = loadBalancerProbeValue;
    }
    
    private Integer localPort;
    
    /**
    * Optional. Specifies the internal port on which the virtual machine is
    * listening to serve the endpoint. This element is only listed for Virtual
    * Machine deployments.
    * @return The LocalPort value.
    */
    public Integer getLocalPort() {
        return this.localPort;
    }
    
    /**
    * Optional. Specifies the internal port on which the virtual machine is
    * listening to serve the endpoint. This element is only listed for Virtual
    * Machine deployments.
    * @param localPortValue The LocalPort value.
    */
    public void setLocalPort(final Integer localPortValue) {
        this.localPort = localPortValue;
    }
    
    private String name;
    
    /**
    * Optional. Specifies the name for the external endpoint. This element is
    * only listed for Virtual Machine deployments.
    * @return The Name value.
    */
    public String getName() {
        return this.name;
    }
    
    /**
    * Optional. Specifies the name for the external endpoint. This element is
    * only listed for Virtual Machine deployments.
    * @param nameValue The Name value.
    */
    public void setName(final String nameValue) {
        this.name = nameValue;
    }
    
    private Integer port;
    
    /**
    * Optional. The size of the role instance.
    * @return The Port value.
    */
    public Integer getPort() {
        return this.port;
    }
    
    /**
    * Optional. The size of the role instance.
    * @param portValue The Port value.
    */
    public void setPort(final Integer portValue) {
        this.port = portValue;
    }
    
    private String protocol;
    
    /**
    * Optional. Specifies the transport protocol for the endpoint.
    * @return The Protocol value.
    */
    public String getProtocol() {
        return this.protocol;
    }
    
    /**
    * Optional. Specifies the transport protocol for the endpoint.
    * @param protocolValue The Protocol value.
    */
    public void setProtocol(final String protocolValue) {
        this.protocol = protocolValue;
    }
    
    private InetAddress virtualIPAddress;
    
    /**
    * Optional. The virtual IP address of the role instance.
    * @return The VirtualIPAddress value.
    */
    public InetAddress getVirtualIPAddress() {
        return this.virtualIPAddress;
    }
    
    /**
    * Optional. The virtual IP address of the role instance.
    * @param virtualIPAddressValue The VirtualIPAddress value.
    */
    public void setVirtualIPAddress(final InetAddress virtualIPAddressValue) {
        this.virtualIPAddress = virtualIPAddressValue;
    }
}
