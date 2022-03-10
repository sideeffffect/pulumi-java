// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.run_v2.enums.GoogleCloudRunOpV2TrafficTargetType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Holds a single traffic routing entry for the Service. Allocations can be done to a specific Revision name, or pointing to the latest Ready Revision.
 * 
 */
public final class GoogleCloudRunOpV2TrafficTargetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2TrafficTargetArgs Empty = new GoogleCloudRunOpV2TrafficTargetArgs();

    /**
     * Specifies percent of the traffic to this Revision. This defaults to zero if unspecified.
     * 
     */
    @InputImport(name="percent")
      private final @Nullable Input<Integer> percent;

    public Input<Integer> getPercent() {
        return this.percent == null ? Input.empty() : this.percent;
    }

    /**
     * Revision to which to send this portion of traffic, if traffic allocation is by revision.
     * 
     */
    @InputImport(name="revision")
      private final @Nullable Input<String> revision;

    public Input<String> getRevision() {
        return this.revision == null ? Input.empty() : this.revision;
    }

    /**
     * Indicates a string to be part of the URI to exclusively reference this target.
     * 
     */
    @InputImport(name="tag")
      private final @Nullable Input<String> tag;

    public Input<String> getTag() {
        return this.tag == null ? Input.empty() : this.tag;
    }

    /**
     * The allocation type for this traffic target.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<GoogleCloudRunOpV2TrafficTargetType> type;

    public Input<GoogleCloudRunOpV2TrafficTargetType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public GoogleCloudRunOpV2TrafficTargetArgs(
        @Nullable Input<Integer> percent,
        @Nullable Input<String> revision,
        @Nullable Input<String> tag,
        @Nullable Input<GoogleCloudRunOpV2TrafficTargetType> type) {
        this.percent = percent;
        this.revision = revision;
        this.tag = tag;
        this.type = type;
    }

    private GoogleCloudRunOpV2TrafficTargetArgs() {
        this.percent = Input.empty();
        this.revision = Input.empty();
        this.tag = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2TrafficTargetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> percent;
        private @Nullable Input<String> revision;
        private @Nullable Input<String> tag;
        private @Nullable Input<GoogleCloudRunOpV2TrafficTargetType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2TrafficTargetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.percent = defaults.percent;
    	      this.revision = defaults.revision;
    	      this.tag = defaults.tag;
    	      this.type = defaults.type;
        }

        public Builder percent(@Nullable Input<Integer> percent) {
            this.percent = percent;
            return this;
        }

        public Builder percent(@Nullable Integer percent) {
            this.percent = Input.ofNullable(percent);
            return this;
        }

        public Builder revision(@Nullable Input<String> revision) {
            this.revision = revision;
            return this;
        }

        public Builder revision(@Nullable String revision) {
            this.revision = Input.ofNullable(revision);
            return this;
        }

        public Builder tag(@Nullable Input<String> tag) {
            this.tag = tag;
            return this;
        }

        public Builder tag(@Nullable String tag) {
            this.tag = Input.ofNullable(tag);
            return this;
        }

        public Builder type(@Nullable Input<GoogleCloudRunOpV2TrafficTargetType> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable GoogleCloudRunOpV2TrafficTargetType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public GoogleCloudRunOpV2TrafficTargetArgs build() {
            return new GoogleCloudRunOpV2TrafficTargetArgs(percent, revision, tag, type);
        }
    }
}
