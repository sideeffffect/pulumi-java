// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;

@OutputCustomType
public final class ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse {
    /**
     * Indicates whether this restriction is enforced on a Best Effort basis.
     * 
     */
    private final Boolean bestEffort;
    /**
     * Configures the restriction control bits. Must be between 0 and 3 inclusive.
     * 
     */
    private final Integer configurationData;

    @OutputCustomType.Constructor
    private ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse(
        @OutputCustomType.Parameter("bestEffort") Boolean bestEffort,
        @OutputCustomType.Parameter("configurationData") Integer configurationData) {
        this.bestEffort = bestEffort;
        this.configurationData = configurationData;
    }

    /**
     * Indicates whether this restriction is enforced on a Best Effort basis.
     * 
    */
    public Boolean getBestEffort() {
        return this.bestEffort;
    }
    /**
     * Configures the restriction control bits. Must be between 0 and 3 inclusive.
     * 
    */
    public Integer getConfigurationData() {
        return this.configurationData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean bestEffort;
        private Integer configurationData;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bestEffort = defaults.bestEffort;
    	      this.configurationData = defaults.configurationData;
        }

        public Builder bestEffort(Boolean bestEffort) {
            this.bestEffort = Objects.requireNonNull(bestEffort);
            return this;
        }

        public Builder configurationData(Integer configurationData) {
            this.configurationData = Objects.requireNonNull(configurationData);
            return this;
        }
        public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse build() {
            return new ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestrictionResponse(bestEffort, configurationData);
        }
    }
}
