// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigAdditionalExtensionArgs;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigCaOptionsArgs;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigKeyUsageArgs;
import com.pulumi.gcp.certificateauthority.inputs.AuthorityConfigX509ConfigPolicyIdArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AuthorityConfigX509ConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final AuthorityConfigX509ConfigArgs Empty = new AuthorityConfigX509ConfigArgs();

    /**
     * Specifies an X.509 extension, which may be used in different parts of X.509 objects like certificates, CSRs, and CRLs.
     * Structure is documented below.
     * 
     */
    @Import(name="additionalExtensions")
    private @Nullable Output<List<AuthorityConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions;

    public Optional<Output<List<AuthorityConfigX509ConfigAdditionalExtensionArgs>>> additionalExtensions() {
        return Optional.ofNullable(this.additionalExtensions);
    }

    /**
     * Describes Online Certificate Status Protocol (OCSP) endpoint addresses that appear in the
     * &#34;Authority Information Access&#34; extension in the certificate.
     * 
     */
    @Import(name="aiaOcspServers")
    private @Nullable Output<List<String>> aiaOcspServers;

    public Optional<Output<List<String>>> aiaOcspServers() {
        return Optional.ofNullable(this.aiaOcspServers);
    }

    /**
     * Describes values that are relevant in a CA certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="caOptions", required=true)
    private Output<AuthorityConfigX509ConfigCaOptionsArgs> caOptions;

    public Output<AuthorityConfigX509ConfigCaOptionsArgs> caOptions() {
        return this.caOptions;
    }

    /**
     * Indicates the intended use for keys that correspond to a certificate.
     * Structure is documented below.
     * 
     */
    @Import(name="keyUsage", required=true)
    private Output<AuthorityConfigX509ConfigKeyUsageArgs> keyUsage;

    public Output<AuthorityConfigX509ConfigKeyUsageArgs> keyUsage() {
        return this.keyUsage;
    }

    /**
     * Describes the X.509 certificate policy object identifiers, per https://tools.ietf.org/html/rfc5280#section-4.2.1.4.
     * Structure is documented below.
     * 
     */
    @Import(name="policyIds")
    private @Nullable Output<List<AuthorityConfigX509ConfigPolicyIdArgs>> policyIds;

    public Optional<Output<List<AuthorityConfigX509ConfigPolicyIdArgs>>> policyIds() {
        return Optional.ofNullable(this.policyIds);
    }

    private AuthorityConfigX509ConfigArgs() {}

    private AuthorityConfigX509ConfigArgs(AuthorityConfigX509ConfigArgs $) {
        this.additionalExtensions = $.additionalExtensions;
        this.aiaOcspServers = $.aiaOcspServers;
        this.caOptions = $.caOptions;
        this.keyUsage = $.keyUsage;
        this.policyIds = $.policyIds;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AuthorityConfigX509ConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AuthorityConfigX509ConfigArgs $;

        public Builder() {
            $ = new AuthorityConfigX509ConfigArgs();
        }

        public Builder(AuthorityConfigX509ConfigArgs defaults) {
            $ = new AuthorityConfigX509ConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder additionalExtensions(@Nullable Output<List<AuthorityConfigX509ConfigAdditionalExtensionArgs>> additionalExtensions) {
            $.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder additionalExtensions(List<AuthorityConfigX509ConfigAdditionalExtensionArgs> additionalExtensions) {
            return additionalExtensions(Output.of(additionalExtensions));
        }

        public Builder additionalExtensions(AuthorityConfigX509ConfigAdditionalExtensionArgs... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }

        public Builder aiaOcspServers(@Nullable Output<List<String>> aiaOcspServers) {
            $.aiaOcspServers = aiaOcspServers;
            return this;
        }

        public Builder aiaOcspServers(List<String> aiaOcspServers) {
            return aiaOcspServers(Output.of(aiaOcspServers));
        }

        public Builder aiaOcspServers(String... aiaOcspServers) {
            return aiaOcspServers(List.of(aiaOcspServers));
        }

        public Builder caOptions(Output<AuthorityConfigX509ConfigCaOptionsArgs> caOptions) {
            $.caOptions = caOptions;
            return this;
        }

        public Builder caOptions(AuthorityConfigX509ConfigCaOptionsArgs caOptions) {
            return caOptions(Output.of(caOptions));
        }

        public Builder keyUsage(Output<AuthorityConfigX509ConfigKeyUsageArgs> keyUsage) {
            $.keyUsage = keyUsage;
            return this;
        }

        public Builder keyUsage(AuthorityConfigX509ConfigKeyUsageArgs keyUsage) {
            return keyUsage(Output.of(keyUsage));
        }

        public Builder policyIds(@Nullable Output<List<AuthorityConfigX509ConfigPolicyIdArgs>> policyIds) {
            $.policyIds = policyIds;
            return this;
        }

        public Builder policyIds(List<AuthorityConfigX509ConfigPolicyIdArgs> policyIds) {
            return policyIds(Output.of(policyIds));
        }

        public Builder policyIds(AuthorityConfigX509ConfigPolicyIdArgs... policyIds) {
            return policyIds(List.of(policyIds));
        }

        public AuthorityConfigX509ConfigArgs build() {
            $.caOptions = Objects.requireNonNull($.caOptions, "expected parameter 'caOptions' to be non-null");
            $.keyUsage = Objects.requireNonNull($.keyUsage, "expected parameter 'keyUsage' to be non-null");
            return $;
        }
    }

}
