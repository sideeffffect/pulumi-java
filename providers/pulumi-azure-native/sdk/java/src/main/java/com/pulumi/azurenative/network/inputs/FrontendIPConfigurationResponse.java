// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.network.inputs;

import com.pulumi.azurenative.network.inputs.PublicIPAddressResponse;
import com.pulumi.azurenative.network.inputs.SubResourceResponse;
import com.pulumi.azurenative.network.inputs.SubnetResponse;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Frontend IP address of the load balancer.
 * 
 */
public final class FrontendIPConfigurationResponse extends com.pulumi.resources.InvokeArgs {

    public static final FrontendIPConfigurationResponse Empty = new FrontendIPConfigurationResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @Import(name="etag", required=true)
    private String etag;

    public String etag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * An array of references to inbound pools that use this frontend IP.
     * 
     */
    @Import(name="inboundNatPools", required=true)
    private List<SubResourceResponse> inboundNatPools;

    public List<SubResourceResponse> inboundNatPools() {
        return this.inboundNatPools;
    }

    /**
     * An array of references to inbound rules that use this frontend IP.
     * 
     */
    @Import(name="inboundNatRules", required=true)
    private List<SubResourceResponse> inboundNatRules;

    public List<SubResourceResponse> inboundNatRules() {
        return this.inboundNatRules;
    }

    /**
     * An array of references to load balancing rules that use this frontend IP.
     * 
     */
    @Import(name="loadBalancingRules", required=true)
    private List<SubResourceResponse> loadBalancingRules;

    public List<SubResourceResponse> loadBalancingRules() {
        return this.loadBalancingRules;
    }

    /**
     * The name of the resource that is unique within the set of frontend IP configurations used by the load balancer. This name can be used to access the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * An array of references to outbound rules that use this frontend IP.
     * 
     */
    @Import(name="outboundRules", required=true)
    private List<SubResourceResponse> outboundRules;

    public List<SubResourceResponse> outboundRules() {
        return this.outboundRules;
    }

    /**
     * The private IP address of the IP configuration.
     * 
     */
    @Import(name="privateIPAddress")
    private @Nullable String privateIPAddress;

    public Optional<String> privateIPAddress() {
        return Optional.ofNullable(this.privateIPAddress);
    }

    /**
     * Whether the specific ipconfiguration is IPv4 or IPv6. Default is taken as IPv4.
     * 
     */
    @Import(name="privateIPAddressVersion")
    private @Nullable String privateIPAddressVersion;

    public Optional<String> privateIPAddressVersion() {
        return Optional.ofNullable(this.privateIPAddressVersion);
    }

    /**
     * The Private IP allocation method.
     * 
     */
    @Import(name="privateIPAllocationMethod")
    private @Nullable String privateIPAllocationMethod;

    public Optional<String> privateIPAllocationMethod() {
        return Optional.ofNullable(this.privateIPAllocationMethod);
    }

    /**
     * The provisioning state of the frontend IP configuration resource.
     * 
     */
    @Import(name="provisioningState", required=true)
    private String provisioningState;

    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * The reference to the Public IP resource.
     * 
     */
    @Import(name="publicIPAddress")
    private @Nullable PublicIPAddressResponse publicIPAddress;

    public Optional<PublicIPAddressResponse> publicIPAddress() {
        return Optional.ofNullable(this.publicIPAddress);
    }

    /**
     * The reference to the Public IP Prefix resource.
     * 
     */
    @Import(name="publicIPPrefix")
    private @Nullable SubResourceResponse publicIPPrefix;

    public Optional<SubResourceResponse> publicIPPrefix() {
        return Optional.ofNullable(this.publicIPPrefix);
    }

    /**
     * The reference to the subnet resource.
     * 
     */
    @Import(name="subnet")
    private @Nullable SubnetResponse subnet;

    public Optional<SubnetResponse> subnet() {
        return Optional.ofNullable(this.subnet);
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="type", required=true)
    private String type;

    public String type() {
        return this.type;
    }

    /**
     * A list of availability zones denoting the IP allocated for the resource needs to come from.
     * 
     */
    @Import(name="zones")
    private @Nullable List<String> zones;

    public Optional<List<String>> zones() {
        return Optional.ofNullable(this.zones);
    }

    private FrontendIPConfigurationResponse() {}

    private FrontendIPConfigurationResponse(FrontendIPConfigurationResponse $) {
        this.etag = $.etag;
        this.id = $.id;
        this.inboundNatPools = $.inboundNatPools;
        this.inboundNatRules = $.inboundNatRules;
        this.loadBalancingRules = $.loadBalancingRules;
        this.name = $.name;
        this.outboundRules = $.outboundRules;
        this.privateIPAddress = $.privateIPAddress;
        this.privateIPAddressVersion = $.privateIPAddressVersion;
        this.privateIPAllocationMethod = $.privateIPAllocationMethod;
        this.provisioningState = $.provisioningState;
        this.publicIPAddress = $.publicIPAddress;
        this.publicIPPrefix = $.publicIPPrefix;
        this.subnet = $.subnet;
        this.type = $.type;
        this.zones = $.zones;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(FrontendIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FrontendIPConfigurationResponse $;

        public Builder() {
            $ = new FrontendIPConfigurationResponse();
        }

        public Builder(FrontendIPConfigurationResponse defaults) {
            $ = new FrontendIPConfigurationResponse(Objects.requireNonNull(defaults));
        }

        public Builder etag(String etag) {
            $.etag = etag;
            return this;
        }

        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        public Builder inboundNatPools(List<SubResourceResponse> inboundNatPools) {
            $.inboundNatPools = inboundNatPools;
            return this;
        }

        public Builder inboundNatPools(SubResourceResponse... inboundNatPools) {
            return inboundNatPools(List.of(inboundNatPools));
        }

        public Builder inboundNatRules(List<SubResourceResponse> inboundNatRules) {
            $.inboundNatRules = inboundNatRules;
            return this;
        }

        public Builder inboundNatRules(SubResourceResponse... inboundNatRules) {
            return inboundNatRules(List.of(inboundNatRules));
        }

        public Builder loadBalancingRules(List<SubResourceResponse> loadBalancingRules) {
            $.loadBalancingRules = loadBalancingRules;
            return this;
        }

        public Builder loadBalancingRules(SubResourceResponse... loadBalancingRules) {
            return loadBalancingRules(List.of(loadBalancingRules));
        }

        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        public Builder outboundRules(List<SubResourceResponse> outboundRules) {
            $.outboundRules = outboundRules;
            return this;
        }

        public Builder outboundRules(SubResourceResponse... outboundRules) {
            return outboundRules(List.of(outboundRules));
        }

        public Builder privateIPAddress(@Nullable String privateIPAddress) {
            $.privateIPAddress = privateIPAddress;
            return this;
        }

        public Builder privateIPAddressVersion(@Nullable String privateIPAddressVersion) {
            $.privateIPAddressVersion = privateIPAddressVersion;
            return this;
        }

        public Builder privateIPAllocationMethod(@Nullable String privateIPAllocationMethod) {
            $.privateIPAllocationMethod = privateIPAllocationMethod;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            $.provisioningState = provisioningState;
            return this;
        }

        public Builder publicIPAddress(@Nullable PublicIPAddressResponse publicIPAddress) {
            $.publicIPAddress = publicIPAddress;
            return this;
        }

        public Builder publicIPPrefix(@Nullable SubResourceResponse publicIPPrefix) {
            $.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder subnet(@Nullable SubnetResponse subnet) {
            $.subnet = subnet;
            return this;
        }

        public Builder type(String type) {
            $.type = type;
            return this;
        }

        public Builder zones(@Nullable List<String> zones) {
            $.zones = zones;
            return this;
        }

        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }

        public FrontendIPConfigurationResponse build() {
            $.etag = Objects.requireNonNull($.etag, "expected parameter 'etag' to be non-null");
            $.inboundNatPools = Objects.requireNonNull($.inboundNatPools, "expected parameter 'inboundNatPools' to be non-null");
            $.inboundNatRules = Objects.requireNonNull($.inboundNatRules, "expected parameter 'inboundNatRules' to be non-null");
            $.loadBalancingRules = Objects.requireNonNull($.loadBalancingRules, "expected parameter 'loadBalancingRules' to be non-null");
            $.outboundRules = Objects.requireNonNull($.outboundRules, "expected parameter 'outboundRules' to be non-null");
            $.provisioningState = Objects.requireNonNull($.provisioningState, "expected parameter 'provisioningState' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
