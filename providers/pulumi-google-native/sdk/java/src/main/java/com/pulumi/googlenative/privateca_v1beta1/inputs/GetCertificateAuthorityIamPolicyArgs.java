// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1beta1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateAuthorityIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityIamPolicyArgs Empty = new GetCertificateAuthorityIamPolicyArgs();

    @Import(name="certificateAuthorityId", required=true)
    private String certificateAuthorityId;

    public String certificateAuthorityId() {
        return this.certificateAuthorityId;
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

    private GetCertificateAuthorityIamPolicyArgs() {}

    private GetCertificateAuthorityIamPolicyArgs(GetCertificateAuthorityIamPolicyArgs $) {
        this.certificateAuthorityId = $.certificateAuthorityId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateAuthorityIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateAuthorityIamPolicyArgs $;

        public Builder() {
            $ = new GetCertificateAuthorityIamPolicyArgs();
        }

        public Builder(GetCertificateAuthorityIamPolicyArgs defaults) {
            $ = new GetCertificateAuthorityIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateAuthorityId(String certificateAuthorityId) {
            $.certificateAuthorityId = certificateAuthorityId;
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

        public GetCertificateAuthorityIamPolicyArgs build() {
            $.certificateAuthorityId = Objects.requireNonNull($.certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
