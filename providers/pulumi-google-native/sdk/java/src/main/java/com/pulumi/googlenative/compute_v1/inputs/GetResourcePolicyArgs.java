// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetResourcePolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetResourcePolicyArgs Empty = new GetResourcePolicyArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="region", required=true)
    private String region;

    public String region() {
        return this.region;
    }

    @Import(name="resourcePolicy", required=true)
    private String resourcePolicy;

    public String resourcePolicy() {
        return this.resourcePolicy;
    }

    private GetResourcePolicyArgs() {}

    private GetResourcePolicyArgs(GetResourcePolicyArgs $) {
        this.project = $.project;
        this.region = $.region;
        this.resourcePolicy = $.resourcePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetResourcePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetResourcePolicyArgs $;

        public Builder() {
            $ = new GetResourcePolicyArgs();
        }

        public Builder(GetResourcePolicyArgs defaults) {
            $ = new GetResourcePolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder region(String region) {
            $.region = region;
            return this;
        }

        public Builder resourcePolicy(String resourcePolicy) {
            $.resourcePolicy = resourcePolicy;
            return this;
        }

        public GetResourcePolicyArgs build() {
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            $.resourcePolicy = Objects.requireNonNull($.resourcePolicy, "expected parameter 'resourcePolicy' to be non-null");
            return $;
        }
    }

}
