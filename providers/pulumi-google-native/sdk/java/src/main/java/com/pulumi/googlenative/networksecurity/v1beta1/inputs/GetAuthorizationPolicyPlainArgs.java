// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity.v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAuthorizationPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAuthorizationPolicyPlainArgs Empty = new GetAuthorizationPolicyPlainArgs();

    @Import(name="authorizationPolicyId", required=true)
    private String authorizationPolicyId;

    public String authorizationPolicyId() {
        return this.authorizationPolicyId;
    }

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

    private GetAuthorizationPolicyPlainArgs() {}

    private GetAuthorizationPolicyPlainArgs(GetAuthorizationPolicyPlainArgs $) {
        this.authorizationPolicyId = $.authorizationPolicyId;
        this.location = $.location;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAuthorizationPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAuthorizationPolicyPlainArgs $;

        public Builder() {
            $ = new GetAuthorizationPolicyPlainArgs();
        }

        public Builder(GetAuthorizationPolicyPlainArgs defaults) {
            $ = new GetAuthorizationPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder authorizationPolicyId(String authorizationPolicyId) {
            $.authorizationPolicyId = authorizationPolicyId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetAuthorizationPolicyPlainArgs build() {
            $.authorizationPolicyId = Objects.requireNonNull($.authorizationPolicyId, "expected parameter 'authorizationPolicyId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
