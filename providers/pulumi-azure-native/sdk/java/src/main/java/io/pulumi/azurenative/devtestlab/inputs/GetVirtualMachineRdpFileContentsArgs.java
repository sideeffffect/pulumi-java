// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devtestlab.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVirtualMachineRdpFileContentsArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineRdpFileContentsArgs Empty = new GetVirtualMachineRdpFileContentsArgs();

    /**
     * The name of the lab.
     * 
     */
    @InputImport(name="labName", required=true)
      private final String labName;

    public String getLabName() {
        return this.labName;
    }

    /**
     * The name of the virtual machine.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The name of the resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetVirtualMachineRdpFileContentsArgs(
        String labName,
        String name,
        String resourceGroupName) {
        this.labName = Objects.requireNonNull(labName, "expected parameter 'labName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetVirtualMachineRdpFileContentsArgs() {
        this.labName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineRdpFileContentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String labName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineRdpFileContentsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.labName = defaults.labName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder labName(String labName) {
            this.labName = Objects.requireNonNull(labName);
            return this;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetVirtualMachineRdpFileContentsArgs build() {
            return new GetVirtualMachineRdpFileContentsArgs(labName, name, resourceGroupName);
        }
    }
}
