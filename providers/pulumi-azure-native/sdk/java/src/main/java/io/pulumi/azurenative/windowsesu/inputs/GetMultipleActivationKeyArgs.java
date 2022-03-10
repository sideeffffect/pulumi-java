// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.windowsesu.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetMultipleActivationKeyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMultipleActivationKeyArgs Empty = new GetMultipleActivationKeyArgs();

    /**
     * The name of the MAK key.
     * 
     */
    @InputImport(name="multipleActivationKeyName", required=true)
      private final String multipleActivationKeyName;

    public String getMultipleActivationKeyName() {
        return this.multipleActivationKeyName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetMultipleActivationKeyArgs(
        String multipleActivationKeyName,
        String resourceGroupName) {
        this.multipleActivationKeyName = Objects.requireNonNull(multipleActivationKeyName, "expected parameter 'multipleActivationKeyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMultipleActivationKeyArgs() {
        this.multipleActivationKeyName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMultipleActivationKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String multipleActivationKeyName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMultipleActivationKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multipleActivationKeyName = defaults.multipleActivationKeyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder multipleActivationKeyName(String multipleActivationKeyName) {
            this.multipleActivationKeyName = Objects.requireNonNull(multipleActivationKeyName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetMultipleActivationKeyArgs build() {
            return new GetMultipleActivationKeyArgs(multipleActivationKeyName, resourceGroupName);
        }
    }
}
