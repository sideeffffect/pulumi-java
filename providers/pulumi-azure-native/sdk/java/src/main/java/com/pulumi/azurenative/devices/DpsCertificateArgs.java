// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DpsCertificateArgs extends com.pulumi.resources.ResourceArgs {

    public static final DpsCertificateArgs Empty = new DpsCertificateArgs();

    /**
     * Base-64 representation of the X509 leaf certificate .cer file or just .pem file content.
     * 
     */
    @Import(name="certificate")
    private @Nullable Output<String> certificate;

    /**
     * @return Base-64 representation of the X509 leaf certificate .cer file or just .pem file content.
     * 
     */
    public Optional<Output<String>> certificate() {
        return Optional.ofNullable(this.certificate);
    }

    /**
     * The name of the certificate create or update.
     * 
     */
    @Import(name="certificateName")
    private @Nullable Output<String> certificateName;

    /**
     * @return The name of the certificate create or update.
     * 
     */
    public Optional<Output<String>> certificateName() {
        return Optional.ofNullable(this.certificateName);
    }

    /**
     * True indicates that the certificate will be created in verified state and proof of possession will not be required.
     * 
     */
    @Import(name="isVerified")
    private @Nullable Output<Boolean> isVerified;

    /**
     * @return True indicates that the certificate will be created in verified state and proof of possession will not be required.
     * 
     */
    public Optional<Output<Boolean>> isVerified() {
        return Optional.ofNullable(this.isVerified);
    }

    /**
     * The name of the provisioning service.
     * 
     */
    @Import(name="provisioningServiceName", required=true)
    private Output<String> provisioningServiceName;

    /**
     * @return The name of the provisioning service.
     * 
     */
    public Output<String> provisioningServiceName() {
        return this.provisioningServiceName;
    }

    /**
     * Resource group identifier.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return Resource group identifier.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    private DpsCertificateArgs() {}

    private DpsCertificateArgs(DpsCertificateArgs $) {
        this.certificate = $.certificate;
        this.certificateName = $.certificateName;
        this.isVerified = $.isVerified;
        this.provisioningServiceName = $.provisioningServiceName;
        this.resourceGroupName = $.resourceGroupName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DpsCertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DpsCertificateArgs $;

        public Builder() {
            $ = new DpsCertificateArgs();
        }

        public Builder(DpsCertificateArgs defaults) {
            $ = new DpsCertificateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificate Base-64 representation of the X509 leaf certificate .cer file or just .pem file content.
         * 
         * @return builder
         * 
         */
        public Builder certificate(@Nullable Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        /**
         * @param certificate Base-64 representation of the X509 leaf certificate .cer file or just .pem file content.
         * 
         * @return builder
         * 
         */
        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        /**
         * @param certificateName The name of the certificate create or update.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(@Nullable Output<String> certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        /**
         * @param certificateName The name of the certificate create or update.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            return certificateName(Output.of(certificateName));
        }

        /**
         * @param isVerified True indicates that the certificate will be created in verified state and proof of possession will not be required.
         * 
         * @return builder
         * 
         */
        public Builder isVerified(@Nullable Output<Boolean> isVerified) {
            $.isVerified = isVerified;
            return this;
        }

        /**
         * @param isVerified True indicates that the certificate will be created in verified state and proof of possession will not be required.
         * 
         * @return builder
         * 
         */
        public Builder isVerified(Boolean isVerified) {
            return isVerified(Output.of(isVerified));
        }

        /**
         * @param provisioningServiceName The name of the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder provisioningServiceName(Output<String> provisioningServiceName) {
            $.provisioningServiceName = provisioningServiceName;
            return this;
        }

        /**
         * @param provisioningServiceName The name of the provisioning service.
         * 
         * @return builder
         * 
         */
        public Builder provisioningServiceName(String provisioningServiceName) {
            return provisioningServiceName(Output.of(provisioningServiceName));
        }

        /**
         * @param resourceGroupName Resource group identifier.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName Resource group identifier.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        public DpsCertificateArgs build() {
            $.provisioningServiceName = Objects.requireNonNull($.provisioningServiceName, "expected parameter 'provisioningServiceName' to be non-null");
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            return $;
        }
    }

}
