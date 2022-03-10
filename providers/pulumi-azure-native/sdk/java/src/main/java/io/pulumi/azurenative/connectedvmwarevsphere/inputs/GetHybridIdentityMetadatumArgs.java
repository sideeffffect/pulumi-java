// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetHybridIdentityMetadatumArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetHybridIdentityMetadatumArgs Empty = new GetHybridIdentityMetadatumArgs();

    /**
     * Name of the HybridIdentityMetadata.
     * 
     */
    @InputImport(name="metadataName", required=true)
      private final String metadataName;

    public String getMetadataName() {
        return this.metadataName;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vm.
     * 
     */
    @InputImport(name="virtualMachineName", required=true)
      private final String virtualMachineName;

    public String getVirtualMachineName() {
        return this.virtualMachineName;
    }

    public GetHybridIdentityMetadatumArgs(
        String metadataName,
        String resourceGroupName,
        String virtualMachineName) {
        this.metadataName = Objects.requireNonNull(metadataName, "expected parameter 'metadataName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualMachineName = Objects.requireNonNull(virtualMachineName, "expected parameter 'virtualMachineName' to be non-null");
    }

    private GetHybridIdentityMetadatumArgs() {
        this.metadataName = null;
        this.resourceGroupName = null;
        this.virtualMachineName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHybridIdentityMetadatumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String metadataName;
        private String resourceGroupName;
        private String virtualMachineName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHybridIdentityMetadatumArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataName = defaults.metadataName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachineName = defaults.virtualMachineName;
        }

        public Builder metadataName(String metadataName) {
            this.metadataName = Objects.requireNonNull(metadataName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder virtualMachineName(String virtualMachineName) {
            this.virtualMachineName = Objects.requireNonNull(virtualMachineName);
            return this;
        }
        public GetHybridIdentityMetadatumArgs build() {
            return new GetHybridIdentityMetadatumArgs(metadataName, resourceGroupName, virtualMachineName);
        }
    }
}
