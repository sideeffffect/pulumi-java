// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1alpha1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * MySQL SSL configuration information.
 * 
 */
public final class MysqlSslConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final MysqlSslConfigArgs Empty = new MysqlSslConfigArgs();

    /**
     * Input only. PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
     * 
     */
    @Import(name="caCertificate")
    private @Nullable Output<String> caCertificate;

    /**
     * @return Input only. PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
     * 
     */
    public Optional<Output<String>> caCertificate() {
        return Optional.ofNullable(this.caCertificate);
    }

    /**
     * Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the &#39;client_key&#39; and the &#39;ca_certificate&#39; fields are mandatory.
     * 
     */
    @Import(name="clientCertificate")
    private @Nullable Output<String> clientCertificate;

    /**
     * @return Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the &#39;client_key&#39; and the &#39;ca_certificate&#39; fields are mandatory.
     * 
     */
    public Optional<Output<String>> clientCertificate() {
        return Optional.ofNullable(this.clientCertificate);
    }

    /**
     * Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the &#39;client_certificate&#39; and the &#39;ca_certificate&#39; fields are mandatory.
     * 
     */
    @Import(name="clientKey")
    private @Nullable Output<String> clientKey;

    /**
     * @return Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the &#39;client_certificate&#39; and the &#39;ca_certificate&#39; fields are mandatory.
     * 
     */
    public Optional<Output<String>> clientKey() {
        return Optional.ofNullable(this.clientKey);
    }

    private MysqlSslConfigArgs() {}

    private MysqlSslConfigArgs(MysqlSslConfigArgs $) {
        this.caCertificate = $.caCertificate;
        this.clientCertificate = $.clientCertificate;
        this.clientKey = $.clientKey;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MysqlSslConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlSslConfigArgs $;

        public Builder() {
            $ = new MysqlSslConfigArgs();
        }

        public Builder(MysqlSslConfigArgs defaults) {
            $ = new MysqlSslConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param caCertificate Input only. PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
         * 
         * @return builder
         * 
         */
        public Builder caCertificate(@Nullable Output<String> caCertificate) {
            $.caCertificate = caCertificate;
            return this;
        }

        /**
         * @param caCertificate Input only. PEM-encoded certificate of the CA that signed the source database server&#39;s certificate.
         * 
         * @return builder
         * 
         */
        public Builder caCertificate(String caCertificate) {
            return caCertificate(Output.of(caCertificate));
        }

        /**
         * @param clientCertificate Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the &#39;client_key&#39; and the &#39;ca_certificate&#39; fields are mandatory.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificate(@Nullable Output<String> clientCertificate) {
            $.clientCertificate = clientCertificate;
            return this;
        }

        /**
         * @param clientCertificate Input only. PEM-encoded certificate that will be used by the replica to authenticate against the source database server. If this field is used then the &#39;client_key&#39; and the &#39;ca_certificate&#39; fields are mandatory.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificate(String clientCertificate) {
            return clientCertificate(Output.of(clientCertificate));
        }

        /**
         * @param clientKey Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the &#39;client_certificate&#39; and the &#39;ca_certificate&#39; fields are mandatory.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(@Nullable Output<String> clientKey) {
            $.clientKey = clientKey;
            return this;
        }

        /**
         * @param clientKey Input only. PEM-encoded private key associated with the Client Certificate. If this field is used then the &#39;client_certificate&#39; and the &#39;ca_certificate&#39; fields are mandatory.
         * 
         * @return builder
         * 
         */
        public Builder clientKey(String clientKey) {
            return clientKey(Output.of(clientKey));
        }

        public MysqlSslConfigArgs build() {
            return $;
        }
    }

}
