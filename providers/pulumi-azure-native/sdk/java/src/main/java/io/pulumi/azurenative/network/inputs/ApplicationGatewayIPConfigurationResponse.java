// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.SubResourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * IP configuration of an application gateway. Currently 1 public and 1 private IP configuration is allowed.
 * 
 */
public final class ApplicationGatewayIPConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayIPConfigurationResponse Empty = new ApplicationGatewayIPConfigurationResponse();

    /**
     * A unique read-only string that changes whenever the resource is updated.
     * 
     */
    @InputImport(name="etag", required=true)
      private final String etag;

    public String getEtag() {
        return this.etag;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Name of the IP configuration that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The provisioning state of the application gateway IP configuration resource.
     * 
     */
    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Reference to the subnet resource. A subnet from where application gateway gets its private address.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable SubResourceResponse subnet;

    public Optional<SubResourceResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    /**
     * Type of the resource.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public ApplicationGatewayIPConfigurationResponse(
        String etag,
        @Nullable String id,
        @Nullable String name,
        String provisioningState,
        @Nullable SubResourceResponse subnet,
        String type) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.id = id;
        this.name = name;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.subnet = subnet;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ApplicationGatewayIPConfigurationResponse() {
        this.etag = null;
        this.id = null;
        this.name = null;
        this.provisioningState = null;
        this.subnet = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayIPConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String id;
        private @Nullable String name;
        private String provisioningState;
        private @Nullable SubResourceResponse subnet;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayIPConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.subnet = defaults.subnet;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder subnet(@Nullable SubResourceResponse subnet) {
            this.subnet = subnet;
            return this;
        }

        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ApplicationGatewayIPConfigurationResponse build() {
            return new ApplicationGatewayIPConfigurationResponse(etag, id, name, provisioningState, subnet, type);
        }
    }
}
