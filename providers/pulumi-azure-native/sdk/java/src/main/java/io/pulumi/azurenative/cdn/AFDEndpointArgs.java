// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn;

import io.pulumi.azurenative.cdn.enums.EnabledState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AFDEndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final AFDEndpointArgs Empty = new AFDEndpointArgs();

    /**
     * Whether to enable use of this rule. Permitted values are 'Enabled' or 'Disabled'
     * 
     */
    @InputImport(name="enabledState")
      private final @Nullable Input<Either<String,EnabledState>> enabledState;

    public Input<Either<String,EnabledState>> getEnabledState() {
        return this.enabledState == null ? Input.empty() : this.enabledState;
    }

    /**
     * Name of the endpoint under the profile which is unique globally.
     * 
     */
    @InputImport(name="endpointName")
      private final @Nullable Input<String> endpointName;

    public Input<String> getEndpointName() {
        return this.endpointName == null ? Input.empty() : this.endpointName;
    }

    /**
     * Resource location.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Send and receive timeout on forwarding request to the origin. When timeout is reached, the request fails and returns.
     * 
     */
    @InputImport(name="originResponseTimeoutSeconds")
      private final @Nullable Input<Integer> originResponseTimeoutSeconds;

    public Input<Integer> getOriginResponseTimeoutSeconds() {
        return this.originResponseTimeoutSeconds == null ? Input.empty() : this.originResponseTimeoutSeconds;
    }

    /**
     * Name of the CDN profile which is unique within the resource group.
     * 
     */
    @InputImport(name="profileName", required=true)
      private final Input<String> profileName;

    public Input<String> getProfileName() {
        return this.profileName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public AFDEndpointArgs(
        @Nullable Input<Either<String,EnabledState>> enabledState,
        @Nullable Input<String> endpointName,
        @Nullable Input<String> location,
        @Nullable Input<Integer> originResponseTimeoutSeconds,
        Input<String> profileName,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.enabledState = enabledState;
        this.endpointName = endpointName;
        this.location = location;
        this.originResponseTimeoutSeconds = originResponseTimeoutSeconds;
        this.profileName = Objects.requireNonNull(profileName, "expected parameter 'profileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private AFDEndpointArgs() {
        this.enabledState = Input.empty();
        this.endpointName = Input.empty();
        this.location = Input.empty();
        this.originResponseTimeoutSeconds = Input.empty();
        this.profileName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AFDEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,EnabledState>> enabledState;
        private @Nullable Input<String> endpointName;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> originResponseTimeoutSeconds;
        private Input<String> profileName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(AFDEndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabledState = defaults.enabledState;
    	      this.endpointName = defaults.endpointName;
    	      this.location = defaults.location;
    	      this.originResponseTimeoutSeconds = defaults.originResponseTimeoutSeconds;
    	      this.profileName = defaults.profileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder enabledState(@Nullable Input<Either<String,EnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder enabledState(@Nullable Either<String,EnabledState> enabledState) {
            this.enabledState = Input.ofNullable(enabledState);
            return this;
        }

        public Builder endpointName(@Nullable Input<String> endpointName) {
            this.endpointName = endpointName;
            return this;
        }

        public Builder endpointName(@Nullable String endpointName) {
            this.endpointName = Input.ofNullable(endpointName);
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder originResponseTimeoutSeconds(@Nullable Input<Integer> originResponseTimeoutSeconds) {
            this.originResponseTimeoutSeconds = originResponseTimeoutSeconds;
            return this;
        }

        public Builder originResponseTimeoutSeconds(@Nullable Integer originResponseTimeoutSeconds) {
            this.originResponseTimeoutSeconds = Input.ofNullable(originResponseTimeoutSeconds);
            return this;
        }

        public Builder profileName(Input<String> profileName) {
            this.profileName = Objects.requireNonNull(profileName);
            return this;
        }

        public Builder profileName(String profileName) {
            this.profileName = Input.of(Objects.requireNonNull(profileName));
            return this;
        }

        public Builder resourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public AFDEndpointArgs build() {
            return new AFDEndpointArgs(enabledState, endpointName, location, originResponseTimeoutSeconds, profileName, resourceGroupName, tags);
        }
    }
}
