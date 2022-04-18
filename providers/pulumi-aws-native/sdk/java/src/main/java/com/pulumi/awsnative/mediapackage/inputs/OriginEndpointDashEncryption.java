// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.mediapackage.inputs;

import com.pulumi.awsnative.mediapackage.inputs.OriginEndpointSpekeKeyProvider;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A Dynamic Adaptive Streaming over HTTP (DASH) encryption configuration.
 * 
 */
public final class OriginEndpointDashEncryption extends com.pulumi.resources.InvokeArgs {

    public static final OriginEndpointDashEncryption Empty = new OriginEndpointDashEncryption();

    /**
     * Time (in seconds) between each encryption key rotation.
     * 
     */
    @Import(name="keyRotationIntervalSeconds")
      private final @Nullable Integer keyRotationIntervalSeconds;

    public Optional<Integer> keyRotationIntervalSeconds() {
        return this.keyRotationIntervalSeconds == null ? Optional.empty() : Optional.ofNullable(this.keyRotationIntervalSeconds);
    }

    @Import(name="spekeKeyProvider", required=true)
      private final OriginEndpointSpekeKeyProvider spekeKeyProvider;

    public OriginEndpointSpekeKeyProvider spekeKeyProvider() {
        return this.spekeKeyProvider;
    }

    public OriginEndpointDashEncryption(
        @Nullable Integer keyRotationIntervalSeconds,
        OriginEndpointSpekeKeyProvider spekeKeyProvider) {
        this.keyRotationIntervalSeconds = keyRotationIntervalSeconds;
        this.spekeKeyProvider = Objects.requireNonNull(spekeKeyProvider, "expected parameter 'spekeKeyProvider' to be non-null");
    }

    private OriginEndpointDashEncryption() {
        this.keyRotationIntervalSeconds = null;
        this.spekeKeyProvider = null;
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
