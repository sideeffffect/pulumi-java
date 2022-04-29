// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DashboardArgs extends ResourceArgs {

    public static final DashboardArgs Empty = new DashboardArgs();

    /**
     * The JSON representation of a dashboard, following the format at https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
     * The representation of an existing dashboard can be found by using the [API Explorer](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards/get)
     * 
     */
    @Import(name="dashboardJson", required=true)
    private Output<String> dashboardJson;

    /**
     * @return The JSON representation of a dashboard, following the format at https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
     * The representation of an existing dashboard can be found by using the [API Explorer](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards/get)
     * 
     */
    public Output<String> dashboardJson() {
        return this.dashboardJson;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private DashboardArgs() {}

    private DashboardArgs(DashboardArgs $) {
        this.dashboardJson = $.dashboardJson;
        this.project = $.project;
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

        /**
         * @param dashboardJson The JSON representation of a dashboard, following the format at https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
         * The representation of an existing dashboard can be found by using the [API Explorer](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards/get)
         * 
         * @return builder
         * 
         */
        public Builder dashboardJson(Output<String> dashboardJson) {
            $.dashboardJson = dashboardJson;
            return this;
        }

        /**
         * @param dashboardJson The JSON representation of a dashboard, following the format at https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards.
         * The representation of an existing dashboard can be found by using the [API Explorer](https://cloud.google.com/monitoring/api/ref_v3/rest/v1/projects.dashboards/get)
         * 
         * @return builder
         * 
         */
        public Builder dashboardJson(String dashboardJson) {
            return dashboardJson(Output.of(dashboardJson));
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        /**
         * @param project The ID of the project in which the resource belongs.
         * If it is not provided, the provider project is used.
         * 
         * @return builder
         * 
         */
        public Builder project(String project) {
            return project(Output.of(project));
        }

        public DashboardArgs build() {
            $.dashboardJson = Objects.requireNonNull($.dashboardJson, "expected parameter 'dashboardJson' to be non-null");
            return $;
        }
    }

}
