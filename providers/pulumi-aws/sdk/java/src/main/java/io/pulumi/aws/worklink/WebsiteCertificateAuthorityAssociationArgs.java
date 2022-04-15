// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.worklink;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebsiteCertificateAuthorityAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebsiteCertificateAuthorityAssociationArgs Empty = new WebsiteCertificateAuthorityAssociationArgs();

    /**
     * The root certificate of the Certificate Authority.
     * 
     */
    @Import(name="certificate", required=true)
      private final Output<String> certificate;

    public Output<String> certificate() {
        return this.certificate;
    }

    /**
     * The certificate name to display.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> displayName() {
        return this.displayName == null ? Codegen.empty() : this.displayName;
    }

    /**
     * The ARN of the fleet.
     * 
     */
    @Import(name="fleetArn", required=true)
      private final Output<String> fleetArn;

    public Output<String> fleetArn() {
        return this.fleetArn;
    }

    public WebsiteCertificateAuthorityAssociationArgs(
        Output<String> certificate,
        @Nullable Output<String> displayName,
        Output<String> fleetArn) {
        this.certificate = Objects.requireNonNull(certificate, "expected parameter 'certificate' to be non-null");
        this.displayName = displayName;
        this.fleetArn = Objects.requireNonNull(fleetArn, "expected parameter 'fleetArn' to be non-null");
    }

    private WebsiteCertificateAuthorityAssociationArgs() {
        this.certificate = Codegen.empty();
        this.displayName = Codegen.empty();
        this.fleetArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebsiteCertificateAuthorityAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> certificate;
        private @Nullable Output<String> displayName;
        private Output<String> fleetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WebsiteCertificateAuthorityAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificate = defaults.certificate;
    	      this.displayName = defaults.displayName;
    	      this.fleetArn = defaults.fleetArn;
        }

        public Builder certificate(Output<String> certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }
        public Builder certificate(String certificate) {
            this.certificate = Output.of(Objects.requireNonNull(certificate));
            return this;
        }
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Codegen.ofNullable(displayName);
            return this;
        }
        public Builder fleetArn(Output<String> fleetArn) {
            this.fleetArn = Objects.requireNonNull(fleetArn);
            return this;
        }
        public Builder fleetArn(String fleetArn) {
            this.fleetArn = Output.of(Objects.requireNonNull(fleetArn));
            return this;
        }        public WebsiteCertificateAuthorityAssociationArgs build() {
            return new WebsiteCertificateAuthorityAssociationArgs(certificate, displayName, fleetArn);
        }
    }
}
