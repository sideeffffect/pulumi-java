// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.datamigration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTaskArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTaskArgs Empty = new GetTaskArgs();

    /**
     * Expand the response
     * 
     */
    @Import(name="expand")
    private @Nullable String expand;

    public Optional<String> expand() {
        return Optional.ofNullable(this.expand);
    }

    /**
     * Name of the resource group
     * 
     */
    @Import(name="groupName", required=true)
    private String groupName;

    public String groupName() {
        return this.groupName;
    }

    /**
     * Name of the project
     * 
     */
    @Import(name="projectName", required=true)
    private String projectName;

    public String projectName() {
        return this.projectName;
    }

    /**
     * Name of the service
     * 
     */
    @Import(name="serviceName", required=true)
    private String serviceName;

    public String serviceName() {
        return this.serviceName;
    }

    /**
     * Name of the Task
     * 
     */
    @Import(name="taskName", required=true)
    private String taskName;

    public String taskName() {
        return this.taskName;
    }

    private GetTaskArgs() {}

    private GetTaskArgs(GetTaskArgs $) {
        this.expand = $.expand;
        this.groupName = $.groupName;
        this.projectName = $.projectName;
        this.serviceName = $.serviceName;
        this.taskName = $.taskName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTaskArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTaskArgs $;

        public Builder() {
            $ = new GetTaskArgs();
        }

        public Builder(GetTaskArgs defaults) {
            $ = new GetTaskArgs(Objects.requireNonNull(defaults));
        }

        public Builder expand(@Nullable String expand) {
            $.expand = expand;
            return this;
        }

        public Builder groupName(String groupName) {
            $.groupName = groupName;
            return this;
        }

        public Builder projectName(String projectName) {
            $.projectName = projectName;
            return this;
        }

        public Builder serviceName(String serviceName) {
            $.serviceName = serviceName;
            return this;
        }

        public Builder taskName(String taskName) {
            $.taskName = taskName;
            return this;
        }

        public GetTaskArgs build() {
            $.groupName = Objects.requireNonNull($.groupName, "expected parameter 'groupName' to be non-null");
            $.projectName = Objects.requireNonNull($.projectName, "expected parameter 'projectName' to be non-null");
            $.serviceName = Objects.requireNonNull($.serviceName, "expected parameter 'serviceName' to be non-null");
            $.taskName = Objects.requireNonNull($.taskName, "expected parameter 'taskName' to be non-null");
            return $;
        }
    }

}
