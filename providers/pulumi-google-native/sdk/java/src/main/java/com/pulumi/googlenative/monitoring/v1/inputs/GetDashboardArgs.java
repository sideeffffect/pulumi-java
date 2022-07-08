// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.monitoring.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDashboardArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDashboardArgs Empty = new GetDashboardArgs();

    @Import(name="dashboardId", required=true)
    private Output<String> dashboardId;

    public Output<String> dashboardId() {
        return this.dashboardId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    private GetDashboardArgs() {}

    private GetDashboardArgs(GetDashboardArgs $) {
        this.dashboardId = $.dashboardId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDashboardArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDashboardArgs $;

        public Builder() {
            $ = new GetDashboardArgs();
        }

        public Builder(GetDashboardArgs defaults) {
            $ = new GetDashboardArgs(Objects.requireNonNull(defaults));
        }

        public Builder dashboardId(Output<String> dashboardId) {
            $.dashboardId = dashboardId;
            return this;
        }

        public Builder dashboardId(String dashboardId) {
            return dashboardId(Output.of(dashboardId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public GetDashboardArgs build() {
            $.dashboardId = Objects.requireNonNull($.dashboardId, "expected parameter 'dashboardId' to be non-null");
            return $;
        }
    }

}
