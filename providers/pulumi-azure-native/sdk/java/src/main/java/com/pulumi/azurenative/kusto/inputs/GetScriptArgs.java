// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.kusto.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetScriptArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetScriptArgs Empty = new GetScriptArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
    private Output<String> clusterName;

    /**
     * @return The name of the Kusto cluster.
     * 
     */
    public Output<String> clusterName() {
        return this.clusterName;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    /**
     * @return The name of the database in the Kusto cluster.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the resource group containing the Kusto cluster.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the Kusto database script.
     * 
     */
    @Import(name="scriptName", required=true)
    private Output<String> scriptName;

    /**
     * @return The name of the Kusto database script.
     * 
     */
    public Output<String> scriptName() {
        return this.scriptName;
    }

    private GetScriptArgs() {}

    private GetScriptArgs(GetScriptArgs $) {
        this.clusterName = $.clusterName;
        this.databaseName = $.databaseName;
        this.resourceGroupName = $.resourceGroupName;
        this.scriptName = $.scriptName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetScriptArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetScriptArgs $;

        public Builder() {
            $ = new GetScriptArgs();
        }

        public Builder(GetScriptArgs defaults) {
            $ = new GetScriptArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        /**
         * @param clusterName The name of the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        /**
         * @param databaseName The name of the database in the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        /**
         * @param databaseName The name of the database in the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group containing the Kusto cluster.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param scriptName The name of the Kusto database script.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(Output<String> scriptName) {
            $.scriptName = scriptName;
            return this;
        }

        /**
         * @param scriptName The name of the Kusto database script.
         * 
         * @return builder
         * 
         */
        public Builder scriptName(String scriptName) {
            return scriptName(Output.of(scriptName));
        }

        public GetScriptArgs build() {
            $.clusterName = Objects.requireNonNull($.clusterName, "expected parameter 'clusterName' to be non-null");
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.scriptName = Objects.requireNonNull($.scriptName, "expected parameter 'scriptName' to be non-null");
            return $;
        }
    }

}
