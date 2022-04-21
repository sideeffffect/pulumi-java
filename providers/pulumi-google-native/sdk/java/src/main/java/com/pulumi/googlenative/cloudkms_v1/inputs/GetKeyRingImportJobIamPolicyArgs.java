// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudkms_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetKeyRingImportJobIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetKeyRingImportJobIamPolicyArgs Empty = new GetKeyRingImportJobIamPolicyArgs();

    @Import(name="importJobId", required=true)
    private String importJobId;

    public String importJobId() {
        return this.importJobId;
    }

    @Import(name="keyRingId", required=true)
    private String keyRingId;

    public String keyRingId() {
        return this.keyRingId;
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

    private GetKeyRingImportJobIamPolicyArgs() {}

    private GetKeyRingImportJobIamPolicyArgs(GetKeyRingImportJobIamPolicyArgs $) {
        this.importJobId = $.importJobId;
        this.keyRingId = $.keyRingId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetKeyRingImportJobIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetKeyRingImportJobIamPolicyArgs $;

        public Builder() {
            $ = new GetKeyRingImportJobIamPolicyArgs();
        }

        public Builder(GetKeyRingImportJobIamPolicyArgs defaults) {
            $ = new GetKeyRingImportJobIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder importJobId(String importJobId) {
            $.importJobId = importJobId;
            return this;
        }

        public Builder keyRingId(String keyRingId) {
            $.keyRingId = keyRingId;
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

        public GetKeyRingImportJobIamPolicyArgs build() {
            $.importJobId = Objects.requireNonNull($.importJobId, "expected parameter 'importJobId' to be non-null");
            $.keyRingId = Objects.requireNonNull($.keyRingId, "expected parameter 'keyRingId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
