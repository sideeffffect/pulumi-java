// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.spanner_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInstanceArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInstanceArgs Empty = new GetInstanceArgs();

    @Import(name="fieldMask")
    private @Nullable String fieldMask;

    public Optional<String> fieldMask() {
        return Optional.ofNullable(this.fieldMask);
    }

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

    private GetInstanceArgs() {}

    private GetInstanceArgs(GetInstanceArgs $) {
        this.fieldMask = $.fieldMask;
        this.instanceId = $.instanceId;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInstanceArgs $;

        public Builder() {
            $ = new GetInstanceArgs();
        }

        public Builder(GetInstanceArgs defaults) {
            $ = new GetInstanceArgs(Objects.requireNonNull(defaults));
        }

        public Builder fieldMask(@Nullable String fieldMask) {
            $.fieldMask = fieldMask;
            return this;
        }

        public Builder instanceId(String instanceId) {
            $.instanceId = instanceId;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetInstanceArgs build() {
            $.instanceId = Objects.requireNonNull($.instanceId, "expected parameter 'instanceId' to be non-null");
            return $;
        }
    }

}
