// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.iam_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkloadIdentityPoolArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetWorkloadIdentityPoolArgs Empty = new GetWorkloadIdentityPoolArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="workloadIdentityPoolId", required=true)
    private String workloadIdentityPoolId;

    public String workloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    private GetWorkloadIdentityPoolArgs() {}

    private GetWorkloadIdentityPoolArgs(GetWorkloadIdentityPoolArgs $) {
        this.location = $.location;
        this.project = $.project;
        this.workloadIdentityPoolId = $.workloadIdentityPoolId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetWorkloadIdentityPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetWorkloadIdentityPoolArgs $;

        public Builder() {
            $ = new GetWorkloadIdentityPoolArgs();
        }

        public Builder(GetWorkloadIdentityPoolArgs defaults) {
            $ = new GetWorkloadIdentityPoolArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            $.workloadIdentityPoolId = workloadIdentityPoolId;
            return this;
        }

        public GetWorkloadIdentityPoolArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.workloadIdentityPoolId = Objects.requireNonNull($.workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
            return $;
        }
    }

}
