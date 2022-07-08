// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.firebase.v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWebAppArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWebAppArgs Empty = new GetWebAppArgs();

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="webAppId", required=true)
    private Output<String> webAppId;

    public Output<String> webAppId() {
        return this.webAppId;
    }

    private GetWebAppArgs() {}

    private GetWebAppArgs(GetWebAppArgs $) {
        this.project = $.project;
        this.webAppId = $.webAppId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWebAppArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWebAppArgs $;

        public Builder() {
            $ = new GetWebAppArgs();
        }

        public Builder(GetWebAppArgs defaults) {
            $ = new GetWebAppArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder webAppId(Output<String> webAppId) {
            $.webAppId = webAppId;
            return this;
        }

        public Builder webAppId(String webAppId) {
            return webAppId(Output.of(webAppId));
        }

        public GetWebAppArgs build() {
            $.webAppId = Objects.requireNonNull($.webAppId, "expected parameter 'webAppId' to be non-null");
            return $;
        }
    }

}
