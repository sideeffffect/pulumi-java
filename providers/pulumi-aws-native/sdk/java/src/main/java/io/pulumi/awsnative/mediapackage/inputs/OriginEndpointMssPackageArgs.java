// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.inputs;

import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointMssEncryptionArgs;
import io.pulumi.awsnative.mediapackage.inputs.OriginEndpointStreamSelectionArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A Microsoft Smooth Streaming (MSS) packaging configuration.
 * 
 */
public final class OriginEndpointMssPackageArgs extends io.pulumi.resources.ResourceArgs {

    public static final OriginEndpointMssPackageArgs Empty = new OriginEndpointMssPackageArgs();

    @InputImport(name="encryption")
      private final @Nullable Input<OriginEndpointMssEncryptionArgs> encryption;

    public Input<OriginEndpointMssEncryptionArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    /**
     * The time window (in seconds) contained in each manifest.
     * 
     */
    @InputImport(name="manifestWindowSeconds")
      private final @Nullable Input<Integer> manifestWindowSeconds;

    public Input<Integer> getManifestWindowSeconds() {
        return this.manifestWindowSeconds == null ? Input.empty() : this.manifestWindowSeconds;
    }

    /**
     * The duration (in seconds) of each segment.
     * 
     */
    @InputImport(name="segmentDurationSeconds")
      private final @Nullable Input<Integer> segmentDurationSeconds;

    public Input<Integer> getSegmentDurationSeconds() {
        return this.segmentDurationSeconds == null ? Input.empty() : this.segmentDurationSeconds;
    }

    @InputImport(name="streamSelection")
      private final @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection;

    public Input<OriginEndpointStreamSelectionArgs> getStreamSelection() {
        return this.streamSelection == null ? Input.empty() : this.streamSelection;
    }

    public OriginEndpointMssPackageArgs(
        @Nullable Input<OriginEndpointMssEncryptionArgs> encryption,
        @Nullable Input<Integer> manifestWindowSeconds,
        @Nullable Input<Integer> segmentDurationSeconds,
        @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection) {
        this.encryption = encryption;
        this.manifestWindowSeconds = manifestWindowSeconds;
        this.segmentDurationSeconds = segmentDurationSeconds;
        this.streamSelection = streamSelection;
    }

    private OriginEndpointMssPackageArgs() {
        this.encryption = Input.empty();
        this.manifestWindowSeconds = Input.empty();
        this.segmentDurationSeconds = Input.empty();
        this.streamSelection = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OriginEndpointMssPackageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<OriginEndpointMssEncryptionArgs> encryption;
        private @Nullable Input<Integer> manifestWindowSeconds;
        private @Nullable Input<Integer> segmentDurationSeconds;
        private @Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(OriginEndpointMssPackageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.manifestWindowSeconds = defaults.manifestWindowSeconds;
    	      this.segmentDurationSeconds = defaults.segmentDurationSeconds;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder encryption(@Nullable Input<OriginEndpointMssEncryptionArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder encryption(@Nullable OriginEndpointMssEncryptionArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder manifestWindowSeconds(@Nullable Input<Integer> manifestWindowSeconds) {
            this.manifestWindowSeconds = manifestWindowSeconds;
            return this;
        }

        public Builder manifestWindowSeconds(@Nullable Integer manifestWindowSeconds) {
            this.manifestWindowSeconds = Input.ofNullable(manifestWindowSeconds);
            return this;
        }

        public Builder segmentDurationSeconds(@Nullable Input<Integer> segmentDurationSeconds) {
            this.segmentDurationSeconds = segmentDurationSeconds;
            return this;
        }

        public Builder segmentDurationSeconds(@Nullable Integer segmentDurationSeconds) {
            this.segmentDurationSeconds = Input.ofNullable(segmentDurationSeconds);
            return this;
        }

        public Builder streamSelection(@Nullable Input<OriginEndpointStreamSelectionArgs> streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }

        public Builder streamSelection(@Nullable OriginEndpointStreamSelectionArgs streamSelection) {
            this.streamSelection = Input.ofNullable(streamSelection);
            return this;
        }
        public OriginEndpointMssPackageArgs build() {
            return new OriginEndpointMssPackageArgs(encryption, manifestWindowSeconds, segmentDurationSeconds, streamSelection);
        }
    }
}
