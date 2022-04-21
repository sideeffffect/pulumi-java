// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEkmConnectionIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEkmConnectionIamPolicyArgs Empty = new GetEkmConnectionIamPolicyArgs();

    @Import(name="ekmConnectionId", required=true)
    private String ekmConnectionId;

    public String ekmConnectionId() {
        return this.ekmConnectionId;
    }

    @Import(name="location", required=true)
    private String location;

    public String location() {
        return this.location;
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

    private GetEkmConnectionIamPolicyArgs() {}

    private GetEkmConnectionIamPolicyArgs(GetEkmConnectionIamPolicyArgs $) {
        this.ekmConnectionId = $.ekmConnectionId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEkmConnectionIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEkmConnectionIamPolicyArgs $;

        public Builder() {
            $ = new GetEkmConnectionIamPolicyArgs();
        }

        public Builder(GetEkmConnectionIamPolicyArgs defaults) {
            $ = new GetEkmConnectionIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder ekmConnectionId(String ekmConnectionId) {
            $.ekmConnectionId = ekmConnectionId;
            return this;
        }

        public Builder location(String location) {
            $.location = location;
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

        public GetEkmConnectionIamPolicyArgs build() {
            $.ekmConnectionId = Objects.requireNonNull($.ekmConnectionId, "expected parameter 'ekmConnectionId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
