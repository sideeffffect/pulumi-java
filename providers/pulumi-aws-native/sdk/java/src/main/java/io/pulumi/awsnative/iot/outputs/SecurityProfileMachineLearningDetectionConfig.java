// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.SecurityProfileMachineLearningDetectionConfigConfidenceLevel;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class SecurityProfileMachineLearningDetectionConfig {
    /**
     * The sensitivity of anomalous behavior evaluation. Can be Low, Medium, or High.
     * 
     */
    private final @Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel;

    @OutputCustomType.Constructor
    private SecurityProfileMachineLearningDetectionConfig(@OutputCustomType.Parameter("confidenceLevel") @Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    /**
     * The sensitivity of anomalous behavior evaluation. Can be Low, Medium, or High.
     * 
    */
    public Optional<SecurityProfileMachineLearningDetectionConfigConfidenceLevel> getConfidenceLevel() {
        return Optional.ofNullable(this.confidenceLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityProfileMachineLearningDetectionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityProfileMachineLearningDetectionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.confidenceLevel = defaults.confidenceLevel;
        }

        public Builder confidenceLevel(@Nullable SecurityProfileMachineLearningDetectionConfigConfidenceLevel confidenceLevel) {
            this.confidenceLevel = confidenceLevel;
            return this;
        }
        public SecurityProfileMachineLearningDetectionConfig build() {
            return new SecurityProfileMachineLearningDetectionConfig(confidenceLevel);
        }
    }
}
