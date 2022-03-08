// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotevents.outputs;

import io.pulumi.awsnative.iotevents.outputs.DetectorModelAssetPropertyTimestamp;
import io.pulumi.awsnative.iotevents.outputs.DetectorModelAssetPropertyVariant;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DetectorModelAssetPropertyValue {
    /**
     * The quality of the asset property value. The value must be `GOOD`, `BAD`, or `UNCERTAIN`. You can also specify an expression.
     * 
     */
    private final @Nullable String quality;
    private final @Nullable DetectorModelAssetPropertyTimestamp timestamp;
    private final DetectorModelAssetPropertyVariant value;

    @OutputCustomType.Constructor({"quality","timestamp","value"})
    private DetectorModelAssetPropertyValue(
        @Nullable String quality,
        @Nullable DetectorModelAssetPropertyTimestamp timestamp,
        DetectorModelAssetPropertyVariant value) {
        this.quality = quality;
        this.timestamp = timestamp;
        this.value = value;
    }

    /**
     * The quality of the asset property value. The value must be `GOOD`, `BAD`, or `UNCERTAIN`. You can also specify an expression.
     * 
    */
    public Optional<String> getQuality() {
        return Optional.ofNullable(this.quality);
    }
    public Optional<DetectorModelAssetPropertyTimestamp> getTimestamp() {
        return Optional.ofNullable(this.timestamp);
    }
    public DetectorModelAssetPropertyVariant getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorModelAssetPropertyValue defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String quality;
        private @Nullable DetectorModelAssetPropertyTimestamp timestamp;
        private DetectorModelAssetPropertyVariant value;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorModelAssetPropertyValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quality = defaults.quality;
    	      this.timestamp = defaults.timestamp;
    	      this.value = defaults.value;
        }

        public Builder setQuality(@Nullable String quality) {
            this.quality = quality;
            return this;
        }

        public Builder setTimestamp(@Nullable DetectorModelAssetPropertyTimestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder setValue(DetectorModelAssetPropertyVariant value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public DetectorModelAssetPropertyValue build() {
            return new DetectorModelAssetPropertyValue(quality, timestamp, value);
        }
    }
}
