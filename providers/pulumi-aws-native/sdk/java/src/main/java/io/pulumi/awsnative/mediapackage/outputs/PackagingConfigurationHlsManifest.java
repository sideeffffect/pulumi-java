// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mediapackage.outputs;

import io.pulumi.awsnative.mediapackage.enums.PackagingConfigurationHlsManifestAdMarkers;
import io.pulumi.awsnative.mediapackage.outputs.PackagingConfigurationStreamSelection;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PackagingConfigurationHlsManifest {
    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * 
     */
    private final @Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers;
    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
     */
    private final @Nullable Boolean includeIframeOnlyStream;
    private final @Nullable String manifestName;
    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
     */
    private final @Nullable Integer programDateTimeIntervalSeconds;
    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
     */
    private final @Nullable Boolean repeatExtXKey;
    private final @Nullable PackagingConfigurationStreamSelection streamSelection;

    @OutputCustomType.Constructor
    private PackagingConfigurationHlsManifest(
        @OutputCustomType.Parameter("adMarkers") @Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers,
        @OutputCustomType.Parameter("includeIframeOnlyStream") @Nullable Boolean includeIframeOnlyStream,
        @OutputCustomType.Parameter("manifestName") @Nullable String manifestName,
        @OutputCustomType.Parameter("programDateTimeIntervalSeconds") @Nullable Integer programDateTimeIntervalSeconds,
        @OutputCustomType.Parameter("repeatExtXKey") @Nullable Boolean repeatExtXKey,
        @OutputCustomType.Parameter("streamSelection") @Nullable PackagingConfigurationStreamSelection streamSelection) {
        this.adMarkers = adMarkers;
        this.includeIframeOnlyStream = includeIframeOnlyStream;
        this.manifestName = manifestName;
        this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
        this.repeatExtXKey = repeatExtXKey;
        this.streamSelection = streamSelection;
    }

    /**
     * This setting controls how ad markers are included in the packaged OriginEndpoint. "NONE" will omit all SCTE-35 ad markers from the output. "PASSTHROUGH" causes the manifest to contain a copy of the SCTE-35 ad markers (comments) taken directly from the input HTTP Live Streaming (HLS) manifest. "SCTE35_ENHANCED" generates ad markers and blackout tags based on SCTE-35 messages in the input source.
     * 
    */
    public Optional<PackagingConfigurationHlsManifestAdMarkers> getAdMarkers() {
        return Optional.ofNullable(this.adMarkers);
    }
    /**
     * When enabled, an I-Frame only stream will be included in the output.
     * 
    */
    public Optional<Boolean> getIncludeIframeOnlyStream() {
        return Optional.ofNullable(this.includeIframeOnlyStream);
    }
    public Optional<String> getManifestName() {
        return Optional.ofNullable(this.manifestName);
    }
    /**
     * The interval (in seconds) between each EXT-X-PROGRAM-DATE-TIME tag inserted into manifests. Additionally, when an interval is specified ID3Timed Metadata messages will be generated every 5 seconds using the ingest time of the content. If the interval is not specified, or set to 0, then no EXT-X-PROGRAM-DATE-TIME tags will be inserted into manifests and no ID3Timed Metadata messages will be generated. Note that irrespective of this parameter, if any ID3 Timed Metadata is found in HTTP Live Streaming (HLS) input, it will be passed through to HLS output.
     * 
    */
    public Optional<Integer> getProgramDateTimeIntervalSeconds() {
        return Optional.ofNullable(this.programDateTimeIntervalSeconds);
    }
    /**
     * When enabled, the EXT-X-KEY tag will be repeated in output manifests.
     * 
    */
    public Optional<Boolean> getRepeatExtXKey() {
        return Optional.ofNullable(this.repeatExtXKey);
    }
    public Optional<PackagingConfigurationStreamSelection> getStreamSelection() {
        return Optional.ofNullable(this.streamSelection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackagingConfigurationHlsManifest defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers;
        private @Nullable Boolean includeIframeOnlyStream;
        private @Nullable String manifestName;
        private @Nullable Integer programDateTimeIntervalSeconds;
        private @Nullable Boolean repeatExtXKey;
        private @Nullable PackagingConfigurationStreamSelection streamSelection;

        public Builder() {
    	      // Empty
        }

        public Builder(PackagingConfigurationHlsManifest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adMarkers = defaults.adMarkers;
    	      this.includeIframeOnlyStream = defaults.includeIframeOnlyStream;
    	      this.manifestName = defaults.manifestName;
    	      this.programDateTimeIntervalSeconds = defaults.programDateTimeIntervalSeconds;
    	      this.repeatExtXKey = defaults.repeatExtXKey;
    	      this.streamSelection = defaults.streamSelection;
        }

        public Builder adMarkers(@Nullable PackagingConfigurationHlsManifestAdMarkers adMarkers) {
            this.adMarkers = adMarkers;
            return this;
        }

        public Builder includeIframeOnlyStream(@Nullable Boolean includeIframeOnlyStream) {
            this.includeIframeOnlyStream = includeIframeOnlyStream;
            return this;
        }

        public Builder manifestName(@Nullable String manifestName) {
            this.manifestName = manifestName;
            return this;
        }

        public Builder programDateTimeIntervalSeconds(@Nullable Integer programDateTimeIntervalSeconds) {
            this.programDateTimeIntervalSeconds = programDateTimeIntervalSeconds;
            return this;
        }

        public Builder repeatExtXKey(@Nullable Boolean repeatExtXKey) {
            this.repeatExtXKey = repeatExtXKey;
            return this;
        }

        public Builder streamSelection(@Nullable PackagingConfigurationStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }
        public PackagingConfigurationHlsManifest build() {
            return new PackagingConfigurationHlsManifest(adMarkers, includeIframeOnlyStream, manifestName, programDateTimeIntervalSeconds, repeatExtXKey, streamSelection);
        }
    }
}
