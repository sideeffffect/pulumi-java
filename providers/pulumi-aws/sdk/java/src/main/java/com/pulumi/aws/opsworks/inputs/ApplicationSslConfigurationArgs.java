// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.opsworks.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationSslConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ApplicationSslConfigurationArgs Empty = new ApplicationSslConfigurationArgs();

    /**
     * The contents of the certificate&#39;s domain.crt file.
     * 
     */
    @Import(name="certificate", required=true)
    private Output<String> certificate;

    public Output<String> certificate() {
        return this.certificate;
    }

    /**
     * Can be used to specify an intermediate certificate authority key or client authentication.
     * 
     */
    @Import(name="chain")
    private @Nullable Output<String> chain;

    public Optional<Output<String>> chain() {
        return Optional.ofNullable(this.chain);
    }

    /**
     * The private key; the contents of the certificate&#39;s domain.key file.
     * 
     */
    @Import(name="privateKey", required=true)
    private Output<String> privateKey;

    public Output<String> privateKey() {
        return this.privateKey;
    }

    private ApplicationSslConfigurationArgs() {}

    private ApplicationSslConfigurationArgs(ApplicationSslConfigurationArgs $) {
        this.certificate = $.certificate;
        this.chain = $.chain;
        this.privateKey = $.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ApplicationSslConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApplicationSslConfigurationArgs $;

        public Builder() {
            $ = new ApplicationSslConfigurationArgs();
        }

        public Builder(ApplicationSslConfigurationArgs defaults) {
            $ = new ApplicationSslConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder certificate(Output<String> certificate) {
            $.certificate = certificate;
            return this;
        }

        public Builder certificate(String certificate) {
            return certificate(Output.of(certificate));
        }

        public Builder chain(@Nullable Output<String> chain) {
            $.chain = chain;
            return this;
        }

        public Builder chain(String chain) {
            return chain(Output.of(chain));
        }

        public Builder privateKey(Output<String> privateKey) {
            $.privateKey = privateKey;
            return this;
        }

        public Builder privateKey(String privateKey) {
            return privateKey(Output.of(privateKey));
        }

        public ApplicationSslConfigurationArgs build() {
            $.certificate = Objects.requireNonNull($.certificate, "expected parameter 'certificate' to be non-null");
            $.privateKey = Objects.requireNonNull($.privateKey, "expected parameter 'privateKey' to be non-null");
            return $;
        }
    }

}
