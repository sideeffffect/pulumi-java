// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.compute.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a single certificate reference in a Key Vault, and where the certificate should reside on the role instance.
 * 
 */
public final class CloudServiceVaultCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final CloudServiceVaultCertificateArgs Empty = new CloudServiceVaultCertificateArgs();

    /**
     * This is the URL of a certificate that has been uploaded to Key Vault as a secret.
     * 
     */
    @Import(name="certificateUrl")
    private @Nullable Output<String> certificateUrl;

    public Optional<Output<String>> certificateUrl() {
        return Optional.ofNullable(this.certificateUrl);
    }

    private CloudServiceVaultCertificateArgs() {}

    private CloudServiceVaultCertificateArgs(CloudServiceVaultCertificateArgs $) {
        this.certificateUrl = $.certificateUrl;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CloudServiceVaultCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CloudServiceVaultCertificateArgs $;

        public Builder() {
            $ = new CloudServiceVaultCertificateArgs();
        }

        public Builder(CloudServiceVaultCertificateArgs defaults) {
            $ = new CloudServiceVaultCertificateArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificateUrl(@Nullable Output<String> certificateUrl) {
            $.certificateUrl = certificateUrl;
            return this;
        }

        public Builder certificateUrl(String certificateUrl) {
            return certificateUrl(Output.of(certificateUrl));
        }

        public CloudServiceVaultCertificateArgs build() {
            return $;
        }
    }

}
