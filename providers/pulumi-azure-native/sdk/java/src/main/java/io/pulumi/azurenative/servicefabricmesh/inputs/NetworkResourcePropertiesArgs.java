// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Describes properties of a network resource.
 * 
 */
public final class NetworkResourcePropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkResourcePropertiesArgs Empty = new NetworkResourcePropertiesArgs();

    /**
     * User readable description of the network.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The type of a Service Fabric container network.
     * Expected value is 'NetworkResourceProperties'.
     * 
     */
    @InputImport(name="kind", required=true)
      private final Input<String> kind;

    public Input<String> getKind() {
        return this.kind;
    }

    public NetworkResourcePropertiesArgs(
        @Nullable Input<String> description,
        Input<String> kind) {
        this.description = description;
        this.kind = Objects.requireNonNull(kind, "expected parameter 'kind' to be non-null");
    }

    private NetworkResourcePropertiesArgs() {
        this.description = Input.empty();
        this.kind = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkResourcePropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<String> kind;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkResourcePropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.kind = defaults.kind;
        }

        public Builder description(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder kind(Input<String> kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder kind(String kind) {
            this.kind = Input.of(Objects.requireNonNull(kind));
            return this;
        }
        public NetworkResourcePropertiesArgs build() {
            return new NetworkResourcePropertiesArgs(description, kind);
        }
    }
}
