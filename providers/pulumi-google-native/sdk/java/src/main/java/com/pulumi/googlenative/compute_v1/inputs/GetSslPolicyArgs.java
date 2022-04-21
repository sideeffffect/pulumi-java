// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSslPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSslPolicyArgs Empty = new GetSslPolicyArgs();

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="sslPolicy", required=true)
    private String sslPolicy;

    public String sslPolicy() {
        return this.sslPolicy;
    }

    private GetSslPolicyArgs() {}

    private GetSslPolicyArgs(GetSslPolicyArgs $) {
        this.project = $.project;
        this.sslPolicy = $.sslPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSslPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSslPolicyArgs $;

        public Builder() {
            $ = new GetSslPolicyArgs();
        }

        public Builder(GetSslPolicyArgs defaults) {
            $ = new GetSslPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public Builder sslPolicy(String sslPolicy) {
            $.sslPolicy = sslPolicy;
            return this;
        }

        public GetSslPolicyArgs build() {
            $.sslPolicy = Objects.requireNonNull($.sslPolicy, "expected parameter 'sslPolicy' to be non-null");
            return $;
        }
    }

}
