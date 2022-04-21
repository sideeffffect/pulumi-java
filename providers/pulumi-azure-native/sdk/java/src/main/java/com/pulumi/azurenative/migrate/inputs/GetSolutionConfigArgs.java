// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.migrate.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSolutionConfigArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSolutionConfigArgs Empty = new GetSolutionConfigArgs();

    /**
     * Name of the Azure Migrate project.
     * 
     */
    @Import(name="migrateProjectName", required=true)
    private String migrateProjectName;

    public String migrateProjectName() {
        return this.migrateProjectName;
    }

    /**
     * Name of the Azure Resource Group that migrate project is part of.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Unique name of a migration solution within a migrate project.
     * 
     */
    @Import(name="solutionName", required=true)
    private String solutionName;

    public String solutionName() {
        return this.solutionName;
    }

    private GetSolutionConfigArgs() {}

    private GetSolutionConfigArgs(GetSolutionConfigArgs $) {
        this.migrateProjectName = $.migrateProjectName;
        this.resourceGroupName = $.resourceGroupName;
        this.solutionName = $.solutionName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSolutionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSolutionConfigArgs $;

        public Builder() {
            $ = new GetSolutionConfigArgs();
        }

        public Builder(GetSolutionConfigArgs defaults) {
            $ = new GetSolutionConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder migrateProjectName(String migrateProjectName) {
            $.migrateProjectName = migrateProjectName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder solutionName(String solutionName) {
            $.solutionName = solutionName;
            return this;
        }

        public GetSolutionConfigArgs build() {
            $.migrateProjectName = Objects.requireNonNull($.migrateProjectName, "expected parameter 'migrateProjectName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.solutionName = Objects.requireNonNull($.solutionName, "expected parameter 'solutionName' to be non-null");
            return $;
        }
    }

}
