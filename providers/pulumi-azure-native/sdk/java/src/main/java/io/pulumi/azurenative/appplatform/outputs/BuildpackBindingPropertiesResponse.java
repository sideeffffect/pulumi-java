// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appplatform.outputs;

import io.pulumi.azurenative.appplatform.outputs.BuildpackBindingLaunchPropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class BuildpackBindingPropertiesResponse {
    /**
     * Buildpack Binding Type
     * 
     */
    private final @Nullable String bindingType;
    /**
     * The object describes the buildpack binding launch properties
     * 
     */
    private final @Nullable BuildpackBindingLaunchPropertiesResponse launchProperties;
    /**
     * State of the Buildpack Binding.
     * 
     */
    private final String provisioningState;

    @OutputCustomType.Constructor({"bindingType","launchProperties","provisioningState"})
    private BuildpackBindingPropertiesResponse(
        @Nullable String bindingType,
        @Nullable BuildpackBindingLaunchPropertiesResponse launchProperties,
        String provisioningState) {
        this.bindingType = bindingType;
        this.launchProperties = launchProperties;
        this.provisioningState = provisioningState;
    }

    /**
     * Buildpack Binding Type
     * 
    */
    public Optional<String> getBindingType() {
        return Optional.ofNullable(this.bindingType);
    }
    /**
     * The object describes the buildpack binding launch properties
     * 
    */
    public Optional<BuildpackBindingLaunchPropertiesResponse> getLaunchProperties() {
        return Optional.ofNullable(this.launchProperties);
    }
    /**
     * State of the Buildpack Binding.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BuildpackBindingPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bindingType;
        private @Nullable BuildpackBindingLaunchPropertiesResponse launchProperties;
        private String provisioningState;

        public Builder() {
    	      // Empty
        }

        public Builder(BuildpackBindingPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bindingType = defaults.bindingType;
    	      this.launchProperties = defaults.launchProperties;
    	      this.provisioningState = defaults.provisioningState;
        }

        public Builder setBindingType(@Nullable String bindingType) {
            this.bindingType = bindingType;
            return this;
        }

        public Builder setLaunchProperties(@Nullable BuildpackBindingLaunchPropertiesResponse launchProperties) {
            this.launchProperties = launchProperties;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public BuildpackBindingPropertiesResponse build() {
            return new BuildpackBindingPropertiesResponse(bindingType, launchProperties, provisioningState);
        }
    }
}
