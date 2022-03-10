// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a VM and the setting Id it was created for.
 * 
 */
public final class ResourceSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSetArgs Empty = new ResourceSetArgs();

    /**
     * resourceSettingId for the environment
     * 
     */
    @InputImport(name="resourceSettingId")
      private final @Nullable Input<String> resourceSettingId;

    public Input<String> getResourceSettingId() {
        return this.resourceSettingId == null ? Input.empty() : this.resourceSettingId;
    }

    /**
     * VM resource Id for the environment
     * 
     */
    @InputImport(name="vmResourceId")
      private final @Nullable Input<String> vmResourceId;

    public Input<String> getVmResourceId() {
        return this.vmResourceId == null ? Input.empty() : this.vmResourceId;
    }

    public ResourceSetArgs(
        @Nullable Input<String> resourceSettingId,
        @Nullable Input<String> vmResourceId) {
        this.resourceSettingId = resourceSettingId;
        this.vmResourceId = vmResourceId;
    }

    private ResourceSetArgs() {
        this.resourceSettingId = Input.empty();
        this.vmResourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> resourceSettingId;
        private @Nullable Input<String> vmResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceSettingId = defaults.resourceSettingId;
    	      this.vmResourceId = defaults.vmResourceId;
        }

        public Builder resourceSettingId(@Nullable Input<String> resourceSettingId) {
            this.resourceSettingId = resourceSettingId;
            return this;
        }

        public Builder resourceSettingId(@Nullable String resourceSettingId) {
            this.resourceSettingId = Input.ofNullable(resourceSettingId);
            return this;
        }

        public Builder vmResourceId(@Nullable Input<String> vmResourceId) {
            this.vmResourceId = vmResourceId;
            return this;
        }

        public Builder vmResourceId(@Nullable String vmResourceId) {
            this.vmResourceId = Input.ofNullable(vmResourceId);
            return this;
        }
        public ResourceSetArgs build() {
            return new ResourceSetArgs(resourceSettingId, vmResourceId);
        }
    }
}
