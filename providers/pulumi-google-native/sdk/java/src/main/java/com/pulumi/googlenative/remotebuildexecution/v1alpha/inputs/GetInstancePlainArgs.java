// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.remotebuildexecution.v1alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstancePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstancePlainArgs Empty = new GetInstancePlainArgs();

    @Import(name="instanceId", required=true)
    private String instanceId;

    public String instanceId() {
        return this.instanceId;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetInstancePlainArgs() {}

    private GetInstancePlainArgs(GetInstancePlainArgs $) {
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstancePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstancePlainArgs $;

        public Builder() {
            $ = new GetInstancePlainArgs();
        }

        public Builder(GetInstancePlainArgs defaults) {
            $ = new GetInstancePlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInstancePlainArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
