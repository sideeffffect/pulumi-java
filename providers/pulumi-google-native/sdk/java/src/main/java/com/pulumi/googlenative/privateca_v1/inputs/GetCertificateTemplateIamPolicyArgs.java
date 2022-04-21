// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetCertificateTemplateIamPolicyArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificateTemplateIamPolicyArgs Empty = new GetCertificateTemplateIamPolicyArgs();

    @Import(name="certificateTemplateId", required=true)
    private String certificateTemplateId;

    public String certificateTemplateId() {
        return this.certificateTemplateId;
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

    private GetCertificateTemplateIamPolicyArgs() {}

    private GetCertificateTemplateIamPolicyArgs(GetCertificateTemplateIamPolicyArgs $) {
        this.certificateTemplateId = $.certificateTemplateId;
        this.location = $.location;
        this.optionsRequestedPolicyVersion = $.optionsRequestedPolicyVersion;
        this.project = $.project;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificateTemplateIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificateTemplateIamPolicyArgs $;

        public Builder() {
            $ = new GetCertificateTemplateIamPolicyArgs();
        }

        public Builder(GetCertificateTemplateIamPolicyArgs defaults) {
            $ = new GetCertificateTemplateIamPolicyArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateTemplateId(String certificateTemplateId) {
            $.certificateTemplateId = certificateTemplateId;
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

        public GetCertificateTemplateIamPolicyArgs build() {
            $.certificateTemplateId = Objects.requireNonNull($.certificateTemplateId, "expected parameter 'certificateTemplateId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            return $;
        }
    }

}
