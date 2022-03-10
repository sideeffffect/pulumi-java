// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.orbital.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetContactArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetContactArgs Empty = new GetContactArgs();

    /**
     * Contact Name
     * 
     */
    @InputImport(name="contactName", required=true)
      private final String contactName;

    public String getContactName() {
        return this.contactName;
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

    /**
     * Spacecraft ID
     * 
     */
    @InputImport(name="spacecraftName", required=true)
      private final String spacecraftName;

    public String getSpacecraftName() {
        return this.spacecraftName;
    }

    public GetContactArgs(
        String contactName,
        String resourceGroupName,
        String spacecraftName) {
        this.contactName = Objects.requireNonNull(contactName, "expected parameter 'contactName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.spacecraftName = Objects.requireNonNull(spacecraftName, "expected parameter 'spacecraftName' to be non-null");
    }

    private GetContactArgs() {
        this.contactName = null;
        this.resourceGroupName = null;
        this.spacecraftName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetContactArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contactName;
        private String resourceGroupName;
        private String spacecraftName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetContactArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contactName = defaults.contactName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.spacecraftName = defaults.spacecraftName;
        }

        public Builder contactName(String contactName) {
            this.contactName = Objects.requireNonNull(contactName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder spacecraftName(String spacecraftName) {
            this.spacecraftName = Objects.requireNonNull(spacecraftName);
            return this;
        }
        public GetContactArgs build() {
            return new GetContactArgs(contactName, resourceGroupName, spacecraftName);
        }
    }
}
