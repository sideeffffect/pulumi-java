// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.UserPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GetUserSettingsWithLocationResult {
    /**
     * The cloud shell user settings properties.
     * 
     */
    private final UserPropertiesResponse properties;

    @OutputCustomType.Constructor
    private GetUserSettingsWithLocationResult(@OutputCustomType.Parameter("properties") UserPropertiesResponse properties) {
        this.properties = properties;
    }

    /**
     * The cloud shell user settings properties.
     * 
    */
    public UserPropertiesResponse getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserSettingsWithLocationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UserPropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserSettingsWithLocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder properties(UserPropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public GetUserSettingsWithLocationResult build() {
            return new GetUserSettingsWithLocationResult(properties);
        }
    }
}
