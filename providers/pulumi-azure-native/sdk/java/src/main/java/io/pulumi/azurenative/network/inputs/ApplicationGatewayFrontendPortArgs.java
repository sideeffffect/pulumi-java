// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Frontend port of an application gateway.
 * 
 */
public final class ApplicationGatewayFrontendPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayFrontendPortArgs Empty = new ApplicationGatewayFrontendPortArgs();

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
     * Name of the frontend port that is unique within an Application Gateway.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Frontend port.
     * 
     */
    @InputImport(name="port")
      private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    public ApplicationGatewayFrontendPortArgs(
        @Nullable Input<String> id,
        @Nullable Input<String> name,
        @Nullable Input<Integer> port) {
        this.id = id;
        this.name = name;
        this.port = port;
    }

    private ApplicationGatewayFrontendPortArgs() {
        this.id = Input.empty();
        this.name = Input.empty();
        this.port = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayFrontendPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> id;
        private @Nullable Input<String> name;
        private @Nullable Input<Integer> port;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayFrontendPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
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

        public Builder port(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder port(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }
        public ApplicationGatewayFrontendPortArgs build() {
            return new ApplicationGatewayFrontendPortArgs(id, name, port);
        }
    }
}
