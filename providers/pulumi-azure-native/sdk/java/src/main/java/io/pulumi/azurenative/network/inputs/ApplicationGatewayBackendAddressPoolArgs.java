// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayBackendAddressArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Backend Address Pool of an application gateway.
 * 
 */
public final class ApplicationGatewayBackendAddressPoolArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayBackendAddressPoolArgs Empty = new ApplicationGatewayBackendAddressPoolArgs();

    /**
     * Backend addresses.
     * 
     */
    @InputImport(name="backendAddresses")
      private final @Nullable Input<List<ApplicationGatewayBackendAddressArgs>> backendAddresses;

    public Input<List<ApplicationGatewayBackendAddressArgs>> getBackendAddresses() {
        return this.backendAddresses == null ? Input.empty() : this.backendAddresses;
    }

    /**
     * Resource ID.
     * 
     */
    @InputImport(name="id")
      private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    /**
     * Name of the backend address pool that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public ApplicationGatewayBackendAddressPoolArgs(
        @Nullable Input<List<ApplicationGatewayBackendAddressArgs>> backendAddresses,
        @Nullable Input<String> id,
        @Nullable Input<String> name) {
        this.backendAddresses = backendAddresses;
        this.id = id;
        this.name = name;
    }

    private ApplicationGatewayBackendAddressPoolArgs() {
        this.backendAddresses = Input.empty();
        this.id = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendAddressPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<ApplicationGatewayBackendAddressArgs>> backendAddresses;
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendAddressPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendAddresses = defaults.backendAddresses;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
        }

        public Builder backendAddresses(@Nullable Input<List<ApplicationGatewayBackendAddressArgs>> backendAddresses) {
            this.backendAddresses = backendAddresses;
            return this;
        }

        public Builder backendAddresses(@Nullable List<ApplicationGatewayBackendAddressArgs> backendAddresses) {
            this.backendAddresses = Input.ofNullable(backendAddresses);
            return this;
        }

        public Builder id(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder id(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder name(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public ApplicationGatewayBackendAddressPoolArgs build() {
            return new ApplicationGatewayBackendAddressPoolArgs(backendAddresses, id, name);
        }
    }
}
