// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ListWebAppFunctionSecretsArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListWebAppFunctionSecretsArgs Empty = new ListWebAppFunctionSecretsArgs();

    /**
     * Function name.
     * 
     */
    @InputImport(name="functionName", required=true)
      private final String functionName;

    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * Site name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public ListWebAppFunctionSecretsArgs(
        String functionName,
        String name,
        String resourceGroupName) {
        this.functionName = Objects.requireNonNull(functionName, "expected parameter 'functionName' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private ListWebAppFunctionSecretsArgs() {
        this.functionName = null;
        this.name = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWebAppFunctionSecretsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionName;
        private String name;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWebAppFunctionSecretsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder functionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
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
        public ListWebAppFunctionSecretsArgs build() {
            return new ListWebAppFunctionSecretsArgs(functionName, name, resourceGroupName);
        }
    }
}
