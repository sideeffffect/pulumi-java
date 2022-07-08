// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.gkehub.v1beta.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMembershipIamPolicyPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetMembershipIamPolicyPlainArgs Empty = new GetMembershipIamPolicyPlainArgs();

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
    }

    @Import(name="membershipId", required=true)
    private String membershipId;

    public String membershipId() {
        return this.membershipId;
    }

    @Import(name="optionsRequestedPolicyVersion")
    private @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> optionsRequestedPolicyVersion() {
        return Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
    private @Nullable String project;

    public Optional<String> project() {
        return Optional.ofNullable(this.project);
    }

    private GetMembershipIamPolicyPlainArgs() {}

    private GetMembershipIamPolicyPlainArgs(GetMembershipIamPolicyPlainArgs $) {
        this.location = $.location;
        this.membershipId = $.membershipId;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetMembershipIamPolicyPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetMembershipIamPolicyPlainArgs $;

        public Builder() {
            $ = new GetMembershipIamPolicyPlainArgs();
        }

        public Builder(GetMembershipIamPolicyPlainArgs defaults) {
            $ = new GetMembershipIamPolicyPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder location(String location) {
            $.location = location;
            return this;
        }

        public Builder membershipId(String membershipId) {
            $.membershipId = membershipId;
            return this;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            $.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }

        public Builder project(@Nullable String project) {
            $.project = project;
            return this;
        }

        public GetMembershipIamPolicyPlainArgs build() {
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.membershipId = Objects.requireNonNull($.membershipId, "expected parameter 'membershipId' to be non-null");
            return $;
        }
    }

}
