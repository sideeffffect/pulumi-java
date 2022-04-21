// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotsitewise;

import com.pulumi.awsnative.iotsitewise.inputs.DashboardTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardArgs extends com.pulumi.resources.ResourceArgs {

    public static final DashboardArgs Empty = new DashboardArgs();

    /**
     * The dashboard definition specified in a JSON literal.
     * 
     */
    @Import(name="dashboardDefinition", required=true)
    private Output<String> dashboardDefinition;

    public Output<String> dashboardDefinition() {
        return this.dashboardDefinition;
    }

    /**
     * A description for the dashboard.
     * 
     */
    @Import(name="dashboardDescription", required=true)
    private Output<String> dashboardDescription;

    public Output<String> dashboardDescription() {
        return this.dashboardDescription;
    }

    /**
     * A friendly name for the dashboard.
     * 
     */
    @Import(name="dashboardName")
    private @Nullable Output<String> dashboardName;

    public Optional<Output<String>> dashboardName() {
        return Optional.ofNullable(this.dashboardName);
    }

    /**
     * The ID of the project in which to create the dashboard.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * A list of key-value pairs that contain metadata for the dashboard.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<DashboardTagArgs>> tags;

    public Optional<Output<List<DashboardTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private DashboardArgs() {}

    private DashboardArgs(DashboardArgs $) {
        this.dashboardDefinition = $.dashboardDefinition;
        this.dashboardDescription = $.dashboardDescription;
        this.dashboardName = $.dashboardName;
        this.projectId = $.projectId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardArgs $;

        public Builder() {
            $ = new DashboardArgs();
        }

        public Builder(DashboardArgs defaults) {
            $ = new DashboardArgs(Objects.requireNonNull(defaults));
        }

        public Builder dashboardDefinition(Output<String> dashboardDefinition) {
            $.dashboardDefinition = dashboardDefinition;
            return this;
        }

        public Builder dashboardDefinition(String dashboardDefinition) {
            return dashboardDefinition(Output.of(dashboardDefinition));
        }

        public Builder dashboardDescription(Output<String> dashboardDescription) {
            $.dashboardDescription = dashboardDescription;
            return this;
        }

        public Builder dashboardDescription(String dashboardDescription) {
            return dashboardDescription(Output.of(dashboardDescription));
        }

        public Builder dashboardName(@Nullable Output<String> dashboardName) {
            $.dashboardName = dashboardName;
            return this;
        }

        public Builder dashboardName(String dashboardName) {
            return dashboardName(Output.of(dashboardName));
        }

        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        public Builder tags(@Nullable Output<List<DashboardTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<DashboardTagArgs> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(DashboardTagArgs... tags) {
            return tags(List.of(tags));
        }

        public DashboardArgs build() {
            $.dashboardDefinition = Objects.requireNonNull($.dashboardDefinition, "expected parameter 'dashboardDefinition' to be non-null");
            $.dashboardDescription = Objects.requireNonNull($.dashboardDescription, "expected parameter 'dashboardDescription' to be non-null");
            return $;
        }
    }

}
