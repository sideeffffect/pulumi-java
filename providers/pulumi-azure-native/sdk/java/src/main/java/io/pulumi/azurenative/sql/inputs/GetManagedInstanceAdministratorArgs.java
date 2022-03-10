// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagedInstanceAdministratorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagedInstanceAdministratorArgs Empty = new GetManagedInstanceAdministratorArgs();

    @InputImport(name="administratorName", required=true)
      private final String administratorName;

    public String getAdministratorName() {
        return this.administratorName;
    }

    /**
     * The name of the managed instance.
     * 
     */
    @InputImport(name="managedInstanceName", required=true)
      private final String managedInstanceName;

    public String getManagedInstanceName() {
        return this.managedInstanceName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetManagedInstanceAdministratorArgs(
        String administratorName,
        String managedInstanceName,
        String resourceGroupName) {
        this.administratorName = Objects.requireNonNull(administratorName, "expected parameter 'administratorName' to be non-null");
        this.managedInstanceName = Objects.requireNonNull(managedInstanceName, "expected parameter 'managedInstanceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetManagedInstanceAdministratorArgs() {
        this.administratorName = null;
        this.managedInstanceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedInstanceAdministratorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String administratorName;
        private String managedInstanceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedInstanceAdministratorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.administratorName = defaults.administratorName;
    	      this.managedInstanceName = defaults.managedInstanceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder administratorName(String administratorName) {
            this.administratorName = Objects.requireNonNull(administratorName);
            return this;
        }

        public Builder managedInstanceName(String managedInstanceName) {
            this.managedInstanceName = Objects.requireNonNull(managedInstanceName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public GetManagedInstanceAdministratorArgs build() {
            return new GetManagedInstanceAdministratorArgs(administratorName, managedInstanceName, resourceGroupName);
        }
    }
}
