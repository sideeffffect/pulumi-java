// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class LoadBalancerBackendAddressPoolReferenceResponse {
    /**
     * Gets the name of the proxy resource on the target side.
     * 
     */
    private final @Nullable String name;
    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
     */
    private final String sourceArmResourceId;

    @OutputCustomType.Constructor({"name","sourceArmResourceId"})
    private LoadBalancerBackendAddressPoolReferenceResponse(
        @Nullable String name,
        String sourceArmResourceId) {
        this.name = name;
        this.sourceArmResourceId = sourceArmResourceId;
    }

    /**
     * Gets the name of the proxy resource on the target side.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Gets the ARM resource ID of the tracked resource being referenced.
     * 
    */
    public String getSourceArmResourceId() {
        return this.sourceArmResourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LoadBalancerBackendAddressPoolReferenceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private String sourceArmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(LoadBalancerBackendAddressPoolReferenceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.sourceArmResourceId = defaults.sourceArmResourceId;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSourceArmResourceId(String sourceArmResourceId) {
            this.sourceArmResourceId = Objects.requireNonNull(sourceArmResourceId);
            return this;
        }
        public LoadBalancerBackendAddressPoolReferenceResponse build() {
            return new LoadBalancerBackendAddressPoolReferenceResponse(name, sourceArmResourceId);
        }
    }
}
