// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The authentication and authorization settings for a BackendService.
 * 
 */
public final class SecuritySettingsArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecuritySettingsArgs Empty = new SecuritySettingsArgs();

    /**
     * Optional. A URL referring to a networksecurity.ClientTlsPolicy resource that describes how clients should authenticate with this service&#39;s backends. clientTlsPolicy only applies to a global BackendService with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
     */
    @Import(name="clientTlsPolicy")
    private @Nullable Output<String> clientTlsPolicy;

    public Optional<Output<String>> clientTlsPolicy() {
        return Optional.ofNullable(this.clientTlsPolicy);
    }

    /**
     * Optional. A list of Subject Alternative Names (SANs) that the client verifies during a mutual TLS handshake with an server/endpoint for this BackendService. When the server presents its X.509 certificate to the client, the client inspects the certificate&#39;s subjectAltName field. If the field contains one of the specified values, the communication continues. Otherwise, it fails. This additional check enables the client to verify that the server is authorized to run the requested service. Note that the contents of the server certificate&#39;s subjectAltName field are configured by the Public Key Infrastructure which provisions server identities. Only applies to a global BackendService with loadBalancingScheme set to INTERNAL_SELF_MANAGED. Only applies when BackendService has an attached clientTlsPolicy with clientCertificate (mTLS mode). Note: This field currently has no impact.
     * 
     */
    @Import(name="subjectAltNames")
    private @Nullable Output<List<String>> subjectAltNames;

    public Optional<Output<List<String>>> subjectAltNames() {
        return Optional.ofNullable(this.subjectAltNames);
    }

    private SecuritySettingsArgs() {}

    private SecuritySettingsArgs(SecuritySettingsArgs $) {
        this.clientTlsPolicy = $.clientTlsPolicy;
        this.subjectAltNames = $.subjectAltNames;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecuritySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecuritySettingsArgs $;

        public Builder() {
            $ = new SecuritySettingsArgs();
        }

        public Builder(SecuritySettingsArgs defaults) {
            $ = new SecuritySettingsArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientTlsPolicy(@Nullable Output<String> clientTlsPolicy) {
            $.clientTlsPolicy = clientTlsPolicy;
            return this;
        }

        public Builder clientTlsPolicy(String clientTlsPolicy) {
            return clientTlsPolicy(Output.of(clientTlsPolicy));
        }

        public Builder subjectAltNames(@Nullable Output<List<String>> subjectAltNames) {
            $.subjectAltNames = subjectAltNames;
            return this;
        }

        public Builder subjectAltNames(List<String> subjectAltNames) {
            return subjectAltNames(Output.of(subjectAltNames));
        }

        public Builder subjectAltNames(String... subjectAltNames) {
            return subjectAltNames(List.of(subjectAltNames));
        }

        public SecuritySettingsArgs build() {
            return $;
        }
    }

}
