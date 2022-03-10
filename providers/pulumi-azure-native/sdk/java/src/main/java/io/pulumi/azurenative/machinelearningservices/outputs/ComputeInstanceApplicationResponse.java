// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ComputeInstanceApplicationResponse {
    /**
     * Name of the ComputeInstance application.
     * 
     */
    private final @Nullable String displayName;
    /**
     * Application' endpoint URI.
     * 
     */
    private final @Nullable String endpointUri;

    @OutputCustomType.Constructor
    private ComputeInstanceApplicationResponse(
        @OutputCustomType.Parameter("displayName") @Nullable String displayName,
        @OutputCustomType.Parameter("endpointUri") @Nullable String endpointUri) {
        this.displayName = displayName;
        this.endpointUri = endpointUri;
    }

    /**
     * Name of the ComputeInstance application.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * Application' endpoint URI.
     * 
    */
    public Optional<String> getEndpointUri() {
        return Optional.ofNullable(this.endpointUri);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ComputeInstanceApplicationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String displayName;
        private @Nullable String endpointUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ComputeInstanceApplicationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.displayName = defaults.displayName;
    	      this.endpointUri = defaults.endpointUri;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder endpointUri(@Nullable String endpointUri) {
            this.endpointUri = endpointUri;
            return this;
        }
        public ComputeInstanceApplicationResponse build() {
            return new ComputeInstanceApplicationResponse(displayName, endpointUri);
        }
    }
}
