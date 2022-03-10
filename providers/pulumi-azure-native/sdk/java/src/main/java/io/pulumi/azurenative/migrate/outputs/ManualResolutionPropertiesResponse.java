// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ManualResolutionPropertiesResponse {
    /**
     * Gets or sets the target resource ARM ID of the dependent resource if the resource type is Manual.
     * 
     */
    private final @Nullable String targetId;

    @OutputCustomType.Constructor
    private ManualResolutionPropertiesResponse(@OutputCustomType.Parameter("targetId") @Nullable String targetId) {
        this.targetId = targetId;
    }

    /**
     * Gets or sets the target resource ARM ID of the dependent resource if the resource type is Manual.
     * 
    */
    public Optional<String> getTargetId() {
        return Optional.ofNullable(this.targetId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualResolutionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String targetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualResolutionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetId = defaults.targetId;
        }

        public Builder targetId(@Nullable String targetId) {
            this.targetId = targetId;
            return this;
        }
        public ManualResolutionPropertiesResponse build() {
            return new ManualResolutionPropertiesResponse(targetId);
        }
    }
}
