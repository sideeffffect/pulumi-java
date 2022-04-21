// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardState extends com.pulumi.resources.ResourceArgs {

    public static final DashboardState Empty = new DashboardState();

    /**
     * The JSON representation of a dashboard, following the format at https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
     * The representation of an existing dashboard can be found by using the [API Explorer](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards/get)
     * 
     */
    @Import(name="dashboardJson")
    private @Nullable Output<String> dashboardJson;

    public Optional<Output<String>> dashboardJson() {
        return Optional.ofNullable(this.dashboardJson);
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private DashboardState() {}

    private DashboardState(DashboardState $) {
        this.dashboardJson = $.dashboardJson;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DashboardState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DashboardState $;

        public Builder() {
            $ = new DashboardState();
        }

        public Builder(DashboardState defaults) {
            $ = new DashboardState(Objects.requireNonNull(defaults));
        }

        public Builder dashboardJson(@Nullable Output<String> dashboardJson) {
            $.dashboardJson = dashboardJson;
            return this;
        }

        public Builder dashboardJson(String dashboardJson) {
            return dashboardJson(Output.of(dashboardJson));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public DashboardState build() {
            return $;
        }
    }

}
