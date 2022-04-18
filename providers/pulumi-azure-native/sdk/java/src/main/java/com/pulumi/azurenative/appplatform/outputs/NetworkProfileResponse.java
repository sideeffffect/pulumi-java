// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appplatform.outputs;

import com.pulumi.azurenative.appplatform.outputs.NetworkProfileResponseOutboundIPs;
import com.pulumi.azurenative.appplatform.outputs.RequiredTrafficResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkProfileResponse {
    /**
     * Name of the resource group containing network resources of Azure Spring Cloud Apps
     * 
     */
    private final @Nullable String appNetworkResourceGroup;
    /**
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud Apps
     * 
     */
    private final @Nullable String appSubnetId;
    /**
     * Desired outbound IP resources for Azure Spring Cloud instance.
     * 
     */
    private final NetworkProfileResponseOutboundIPs outboundIPs;
    /**
     * Required inbound or outbound traffics for Azure Spring Cloud instance.
     * 
     */
    private final List<RequiredTrafficResponse> requiredTraffics;
    /**
     * Azure Spring Cloud service reserved CIDR
     * 
     */
    private final @Nullable String serviceCidr;
    /**
     * Name of the resource group containing network resources of Azure Spring Cloud Service Runtime
     * 
     */
    private final @Nullable String serviceRuntimeNetworkResourceGroup;
    /**
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud Service Runtime
     * 
     */
    private final @Nullable String serviceRuntimeSubnetId;

    @CustomType.Constructor
    private NetworkProfileResponse(
        @CustomType.Parameter("appNetworkResourceGroup") @Nullable String appNetworkResourceGroup,
        @CustomType.Parameter("appSubnetId") @Nullable String appSubnetId,
        @CustomType.Parameter("outboundIPs") NetworkProfileResponseOutboundIPs outboundIPs,
        @CustomType.Parameter("requiredTraffics") List<RequiredTrafficResponse> requiredTraffics,
        @CustomType.Parameter("serviceCidr") @Nullable String serviceCidr,
        @CustomType.Parameter("serviceRuntimeNetworkResourceGroup") @Nullable String serviceRuntimeNetworkResourceGroup,
        @CustomType.Parameter("serviceRuntimeSubnetId") @Nullable String serviceRuntimeSubnetId) {
        this.appNetworkResourceGroup = appNetworkResourceGroup;
        this.appSubnetId = appSubnetId;
        this.outboundIPs = outboundIPs;
        this.requiredTraffics = requiredTraffics;
        this.serviceCidr = serviceCidr;
        this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
        this.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
    }

    /**
     * Name of the resource group containing network resources of Azure Spring Cloud Apps
     * 
    */
    public Optional<String> appNetworkResourceGroup() {
        return Optional.ofNullable(this.appNetworkResourceGroup);
    }
    /**
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud Apps
     * 
    */
    public Optional<String> appSubnetId() {
        return Optional.ofNullable(this.appSubnetId);
    }
    /**
     * Desired outbound IP resources for Azure Spring Cloud instance.
     * 
    */
    public NetworkProfileResponseOutboundIPs outboundIPs() {
        return this.outboundIPs;
    }
    /**
     * Required inbound or outbound traffics for Azure Spring Cloud instance.
     * 
    */
    public List<RequiredTrafficResponse> requiredTraffics() {
        return this.requiredTraffics;
    }
    /**
     * Azure Spring Cloud service reserved CIDR
     * 
    */
    public Optional<String> serviceCidr() {
        return Optional.ofNullable(this.serviceCidr);
    }
    /**
     * Name of the resource group containing network resources of Azure Spring Cloud Service Runtime
     * 
    */
    public Optional<String> serviceRuntimeNetworkResourceGroup() {
        return Optional.ofNullable(this.serviceRuntimeNetworkResourceGroup);
    }
    /**
     * Fully qualified resource Id of the subnet to host Azure Spring Cloud Service Runtime
     * 
    */
    public Optional<String> serviceRuntimeSubnetId() {
        return Optional.ofNullable(this.serviceRuntimeSubnetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String appNetworkResourceGroup;
        private @Nullable String appSubnetId;
        private NetworkProfileResponseOutboundIPs outboundIPs;
        private List<RequiredTrafficResponse> requiredTraffics;
        private @Nullable String serviceCidr;
        private @Nullable String serviceRuntimeNetworkResourceGroup;
        private @Nullable String serviceRuntimeSubnetId;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appNetworkResourceGroup = defaults.appNetworkResourceGroup;
    	      this.appSubnetId = defaults.appSubnetId;
    	      this.outboundIPs = defaults.outboundIPs;
    	      this.requiredTraffics = defaults.requiredTraffics;
    	      this.serviceCidr = defaults.serviceCidr;
    	      this.serviceRuntimeNetworkResourceGroup = defaults.serviceRuntimeNetworkResourceGroup;
    	      this.serviceRuntimeSubnetId = defaults.serviceRuntimeSubnetId;
        }

        public Builder appNetworkResourceGroup(@Nullable String appNetworkResourceGroup) {
            this.appNetworkResourceGroup = appNetworkResourceGroup;
            return this;
        }
        public Builder appSubnetId(@Nullable String appSubnetId) {
            this.appSubnetId = appSubnetId;
            return this;
        }
        public Builder outboundIPs(NetworkProfileResponseOutboundIPs outboundIPs) {
            this.outboundIPs = Objects.requireNonNull(outboundIPs);
            return this;
        }
        public Builder requiredTraffics(List<RequiredTrafficResponse> requiredTraffics) {
            this.requiredTraffics = Objects.requireNonNull(requiredTraffics);
            return this;
        }
        public Builder requiredTraffics(RequiredTrafficResponse... requiredTraffics) {
            return requiredTraffics(List.of(requiredTraffics));
        }
        public Builder serviceCidr(@Nullable String serviceCidr) {
            this.serviceCidr = serviceCidr;
            return this;
        }
        public Builder serviceRuntimeNetworkResourceGroup(@Nullable String serviceRuntimeNetworkResourceGroup) {
            this.serviceRuntimeNetworkResourceGroup = serviceRuntimeNetworkResourceGroup;
            return this;
        }
        public Builder serviceRuntimeSubnetId(@Nullable String serviceRuntimeSubnetId) {
            this.serviceRuntimeSubnetId = serviceRuntimeSubnetId;
            return this;
        }        public NetworkProfileResponse build() {
            return new NetworkProfileResponse(appNetworkResourceGroup, appSubnetId, outboundIPs, requiredTraffics, serviceCidr, serviceRuntimeNetworkResourceGroup, serviceRuntimeSubnetId);
        }
    }
}
