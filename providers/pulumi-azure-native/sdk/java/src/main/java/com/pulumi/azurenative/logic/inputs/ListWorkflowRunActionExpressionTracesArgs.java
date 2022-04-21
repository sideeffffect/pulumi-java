// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.logic.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListWorkflowRunActionExpressionTracesArgs extends com.pulumi.resources.InvokeArgs {

    public static final ListWorkflowRunActionExpressionTracesArgs Empty = new ListWorkflowRunActionExpressionTracesArgs();

    /**
     * The workflow action name.
     * 
     */
    @Import(name="actionName", required=true)
    private String actionName;

    public String actionName() {
        return this.actionName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private String resourceGroupName;

    public String resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The workflow run name.
     * 
     */
    @Import(name="runName", required=true)
    private String runName;

    public String runName() {
        return this.runName;
    }

    /**
     * The workflow name.
     * 
     */
    @Import(name="workflowName", required=true)
    private String workflowName;

    public String workflowName() {
        return this.workflowName;
    }

    private ListWorkflowRunActionExpressionTracesArgs() {}

    private ListWorkflowRunActionExpressionTracesArgs(ListWorkflowRunActionExpressionTracesArgs $) {
        this.actionName = $.actionName;
        this.resourceGroupName = $.resourceGroupName;
        this.runName = $.runName;
        this.workflowName = $.workflowName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ListWorkflowRunActionExpressionTracesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ListWorkflowRunActionExpressionTracesArgs $;

        public Builder() {
            $ = new ListWorkflowRunActionExpressionTracesArgs();
        }

        public Builder(ListWorkflowRunActionExpressionTracesArgs defaults) {
            $ = new ListWorkflowRunActionExpressionTracesArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionName(String actionName) {
            $.actionName = actionName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder runName(String runName) {
            $.runName = runName;
            return this;
        }

        public Builder workflowName(String workflowName) {
            $.workflowName = workflowName;
            return this;
        }

        public ListWorkflowRunActionExpressionTracesArgs build() {
            $.actionName = Objects.requireNonNull($.actionName, "expected parameter 'actionName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.runName = Objects.requireNonNull($.runName, "expected parameter 'runName' to be non-null");
            $.workflowName = Objects.requireNonNull($.workflowName, "expected parameter 'workflowName' to be non-null");
            return $;
        }
    }

}
