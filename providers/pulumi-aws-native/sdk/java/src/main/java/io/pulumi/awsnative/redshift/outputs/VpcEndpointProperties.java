// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.redshift.outputs;

import io.pulumi.awsnative.redshift.outputs.EndpointAccessNetworkInterface;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class VpcEndpointProperties {
    /**
     * One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * 
     */
    private final @Nullable List<EndpointAccessNetworkInterface> networkInterfaces;
    /**
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * 
     */
    private final @Nullable String vpcEndpointId;
    /**
     * The VPC identifier that the endpoint is associated.
     * 
     */
    private final @Nullable String vpcId;

    @OutputCustomType.Constructor
    private VpcEndpointProperties(
        @OutputCustomType.Parameter("networkInterfaces") @Nullable List<EndpointAccessNetworkInterface> networkInterfaces,
        @OutputCustomType.Parameter("vpcEndpointId") @Nullable String vpcEndpointId,
        @OutputCustomType.Parameter("vpcId") @Nullable String vpcId) {
        this.networkInterfaces = networkInterfaces;
        this.vpcEndpointId = vpcEndpointId;
        this.vpcId = vpcId;
    }

    /**
     * One or more network interfaces of the endpoint. Also known as an interface endpoint.
     * 
    */
    public List<EndpointAccessNetworkInterface> getNetworkInterfaces() {
        return this.networkInterfaces == null ? List.of() : this.networkInterfaces;
    }
    /**
     * The connection endpoint ID for connecting an Amazon Redshift cluster through the proxy.
     * 
    */
    public Optional<String> getVpcEndpointId() {
        return Optional.ofNullable(this.vpcEndpointId);
    }
    /**
     * The VPC identifier that the endpoint is associated.
     * 
    */
    public Optional<String> getVpcId() {
        return Optional.ofNullable(this.vpcId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<EndpointAccessNetworkInterface> networkInterfaces;
        private @Nullable String vpcEndpointId;
        private @Nullable String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkInterfaces = defaults.networkInterfaces;
    	      this.vpcEndpointId = defaults.vpcEndpointId;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder networkInterfaces(@Nullable List<EndpointAccessNetworkInterface> networkInterfaces) {
            this.networkInterfaces = networkInterfaces;
            return this;
        }

        public Builder vpcEndpointId(@Nullable String vpcEndpointId) {
            this.vpcEndpointId = vpcEndpointId;
            return this;
        }

        public Builder vpcId(@Nullable String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public VpcEndpointProperties build() {
            return new VpcEndpointProperties(networkInterfaces, vpcEndpointId, vpcId);
        }
    }
}
