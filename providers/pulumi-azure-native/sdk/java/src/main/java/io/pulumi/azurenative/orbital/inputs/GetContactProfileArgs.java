// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetContactProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContactProfileArgs Empty = new GetContactProfileArgs();

    /**
     * Contact Profile Name
     * 
     */
    @InputImport(name="contactProfileName", required=true)
      private final String contactProfileName;

    public String getContactProfileName() {
        return this.contactProfileName;
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

    public GetContactProfileArgs(
        String contactProfileName,
        String resourceGroupName) {
        this.contactProfileName = Objects.requireNonNull(contactProfileName, "expected parameter 'contactProfileName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetContactProfileArgs() {
        this.contactProfileName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactProfileName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactProfileName = defaults.contactProfileName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder contactProfileName(String contactProfileName) {
            this.contactProfileName = Objects.requireNonNull(contactProfileName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetContactProfileArgs build() {
            return new GetContactProfileArgs(contactProfileName, resourceGroupName);
        }
    }
}
