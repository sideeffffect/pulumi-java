// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.sql;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadClassifierArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadClassifierArgs Empty = new WorkloadClassifierArgs();

    /**
     * The workload classifier context.
     * 
     */
    @Import(name="context")
    private @Nullable Output<String> context;

    public Optional<Output<String>> context() {
        return Optional.ofNullable(this.context);
    }

    /**
     * The name of the database.
     * 
     */
    @Import(name="databaseName", required=true)
    private Output<String> databaseName;

    public Output<String> databaseName() {
        return this.databaseName;
    }

    /**
     * The workload classifier end time for classification.
     * 
     */
    @Import(name="endTime")
    private @Nullable Output<String> endTime;

    public Optional<Output<String>> endTime() {
        return Optional.ofNullable(this.endTime);
    }

    /**
     * The workload classifier importance.
     * 
     */
    @Import(name="importance")
    private @Nullable Output<String> importance;

    public Optional<Output<String>> importance() {
        return Optional.ofNullable(this.importance);
    }

    /**
     * The workload classifier label.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The workload classifier member name.
     * 
     */
    @Import(name="memberName", required=true)
    private Output<String> memberName;

    public Output<String> memberName() {
        return this.memberName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @Import(name="serverName", required=true)
    private Output<String> serverName;

    public Output<String> serverName() {
        return this.serverName;
    }

    /**
     * The workload classifier start time for classification.
     * 
     */
    @Import(name="startTime")
    private @Nullable Output<String> startTime;

    public Optional<Output<String>> startTime() {
        return Optional.ofNullable(this.startTime);
    }

    /**
     * The name of the workload classifier to create/update.
     * 
     */
    @Import(name="workloadClassifierName")
    private @Nullable Output<String> workloadClassifierName;

    public Optional<Output<String>> workloadClassifierName() {
        return Optional.ofNullable(this.workloadClassifierName);
    }

    /**
     * The name of the workload group from which to receive the classifier from.
     * 
     */
    @Import(name="workloadGroupName", required=true)
    private Output<String> workloadGroupName;

    public Output<String> workloadGroupName() {
        return this.workloadGroupName;
    }

    private WorkloadClassifierArgs() {}

    private WorkloadClassifierArgs(WorkloadClassifierArgs $) {
        this.context = $.context;
        this.databaseName = $.databaseName;
        this.endTime = $.endTime;
        this.importance = $.importance;
        this.label = $.label;
        this.memberName = $.memberName;
        this.resourceGroupName = $.resourceGroupName;
        this.serverName = $.serverName;
        this.startTime = $.startTime;
        this.workloadClassifierName = $.workloadClassifierName;
        this.workloadGroupName = $.workloadGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadClassifierArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadClassifierArgs $;

        public Builder() {
            $ = new WorkloadClassifierArgs();
        }

        public Builder(WorkloadClassifierArgs defaults) {
            $ = new WorkloadClassifierArgs(Objects.requireNonNull(defaults));
        }

        public Builder context(@Nullable Output<String> context) {
            $.context = context;
            return this;
        }

        public Builder context(String context) {
            return context(Output.of(context));
        }

        public Builder databaseName(Output<String> databaseName) {
            $.databaseName = databaseName;
            return this;
        }

        public Builder databaseName(String databaseName) {
            return databaseName(Output.of(databaseName));
        }

        public Builder endTime(@Nullable Output<String> endTime) {
            $.endTime = endTime;
            return this;
        }

        public Builder endTime(String endTime) {
            return endTime(Output.of(endTime));
        }

        public Builder importance(@Nullable Output<String> importance) {
            $.importance = importance;
            return this;
        }

        public Builder importance(String importance) {
            return importance(Output.of(importance));
        }

        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        public Builder label(String label) {
            return label(Output.of(label));
        }

        public Builder memberName(Output<String> memberName) {
            $.memberName = memberName;
            return this;
        }

        public Builder memberName(String memberName) {
            return memberName(Output.of(memberName));
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public Builder serverName(Output<String> serverName) {
            $.serverName = serverName;
            return this;
        }

        public Builder serverName(String serverName) {
            return serverName(Output.of(serverName));
        }

        public Builder startTime(@Nullable Output<String> startTime) {
            $.startTime = startTime;
            return this;
        }

        public Builder startTime(String startTime) {
            return startTime(Output.of(startTime));
        }

        public Builder workloadClassifierName(@Nullable Output<String> workloadClassifierName) {
            $.workloadClassifierName = workloadClassifierName;
            return this;
        }

        public Builder workloadClassifierName(String workloadClassifierName) {
            return workloadClassifierName(Output.of(workloadClassifierName));
        }

        public Builder workloadGroupName(Output<String> workloadGroupName) {
            $.workloadGroupName = workloadGroupName;
            return this;
        }

        public Builder workloadGroupName(String workloadGroupName) {
            return workloadGroupName(Output.of(workloadGroupName));
        }

        public WorkloadClassifierArgs build() {
            $.databaseName = Objects.requireNonNull($.databaseName, "expected parameter 'databaseName' to be non-null");
            $.memberName = Objects.requireNonNull($.memberName, "expected parameter 'memberName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serverName = Objects.requireNonNull($.serverName, "expected parameter 'serverName' to be non-null");
            $.workloadGroupName = Objects.requireNonNull($.workloadGroupName, "expected parameter 'workloadGroupName' to be non-null");
            return $;
        }
    }

}
