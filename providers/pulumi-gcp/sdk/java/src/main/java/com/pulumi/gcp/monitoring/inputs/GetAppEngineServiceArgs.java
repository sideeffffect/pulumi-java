// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.monitoring.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppEngineServiceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppEngineServiceArgs Empty = new GetAppEngineServiceArgs();

    /**
     * The ID of the App Engine module underlying this
     * service. Corresponds to the moduleId resource label in the [gae_app](https://cloud.google.com/monitoring/api/resources#tag_gae_app) monitored resource, or the service/module name.
     * 
     */
    @Import(name="moduleId", required=true)
    private String moduleId;

    public String moduleId() {
        return this.moduleId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetAppEngineServiceArgs() {}

    private GetAppEngineServiceArgs(GetAppEngineServiceArgs $) {
        this.moduleId = $.moduleId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppEngineServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppEngineServiceArgs $;

        public Builder() {
            $ = new GetAppEngineServiceArgs();
        }

        public Builder(GetAppEngineServiceArgs defaults) {
            $ = new GetAppEngineServiceArgs(Objects.requireNonNull(defaults));
        }

        public Builder moduleId(String moduleId) {
            $.moduleId = moduleId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAppEngineServiceArgs build() {
            $.moduleId = Objects.requireNonNull($.moduleId, "expected parameter 'moduleId' to be non-null");
            return $;
        }
    }

}
