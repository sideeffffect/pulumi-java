// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.outputs;

import com.pulumi.awsnative.mediapackage.outputs.OriginEndpointSpekeKeyProvider;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OriginEndpointDashEncryption {
    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     */
    private final @Nullable Integer keyRotationIntervalSeconds;
    private final OriginEndpointSpekeKeyProvider spekeKeyProvider;

    @CustomType.Constructor
    private OriginEndpointDashEncryption(
        @CustomType.Parameter("keyRotationIntervalSeconds") @Nullable Integer keyRotationIntervalSeconds,
        @CustomType.Parameter("spekeKeyProvider") OriginEndpointSpekeKeyProvider spekeKeyProvider) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.spekeKeyProvider = spekeKeyProvider;
    }

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
    */
    public Optional<Integer> keyRotationIntervalSeconds() {
        return Optional.ofNullable(this.keyRotationIntervalSeconds);
    }
    public OriginEndpointSpekeKeyProvider spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointDashEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer keyRotationIntervalSeconds;
        private OriginEndpointSpekeKeyProvider spekeKeyProvider;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointDashEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyRotationIntervalSeconds = defaults.keyRotationIntervalSeconds;
    	      this.spekeKeyProvider = defaults.spekeKeyProvider;
        }

        public Builder keyRotationIntervalSeconds(@Nullable Integer keyRotationIntervalSeconds) {
            this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
            return this;
        }
        public Builder spekeKeyProvider(OriginEndpointSpekeKeyProvider spekeKeyProvider) {
            this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider);
            return this;
        }        public OriginEndpointDashEncryption build() {
            return new OriginEndpointDashEncryption(keyRotationIntervalSeconds, spekeKeyProvider);
        }
    }
}
