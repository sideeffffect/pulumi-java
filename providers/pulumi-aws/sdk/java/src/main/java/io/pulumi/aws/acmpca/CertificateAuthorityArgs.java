// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca;

import io.pulumi.aws.acmpca.inputs.CertificateAuthorityCertificateAuthorityConfigurationArgs;
import io.pulumi.aws.acmpca.inputs.CertificateAuthorityRevocationConfigurationArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityArgs Empty = new CertificateAuthorityArgs();

    /**
     * Nested argument containing algorithms and certificate subject information. Defined below.
     * 
     */
    @InputImport(name="certificateAuthorityConfiguration", required=true)
      private final Input<CertificateAuthorityCertificateAuthorityConfigurationArgs> certificateAuthorityConfiguration;

    public Input<CertificateAuthorityCertificateAuthorityConfigurationArgs> getCertificateAuthorityConfiguration() {
        return this.certificateAuthorityConfiguration;
    }

    /**
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * The number of days to make a CA restorable after it has been deleted, must be between 7 to 30 days, with default to 30 days.
     * 
     */
    @InputImport(name="permanentDeletionTimeInDays")
      private final @Nullable Input<Integer> permanentDeletionTimeInDays;

    public Input<Integer> getPermanentDeletionTimeInDays() {
        return this.permanentDeletionTimeInDays == null ? Input.empty() : this.permanentDeletionTimeInDays;
    }

    /**
     * Nested argument containing revocation configuration. Defined below.
     * 
     */
    @InputImport(name="revocationConfiguration")
      private final @Nullable Input<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration;

    public Input<CertificateAuthorityRevocationConfigurationArgs> getRevocationConfiguration() {
        return this.revocationConfiguration == null ? Input.empty() : this.revocationConfiguration;
    }

    /**
     * Specifies a key-value map of user-defined tags that are attached to the certificate authority. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The type of the certificate authority. Defaults to `SUBORDINATE`. Valid values: `ROOT` and `SUBORDINATE`.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public CertificateAuthorityArgs(
        Input<CertificateAuthorityCertificateAuthorityConfigurationArgs> certificateAuthorityConfiguration,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> permanentDeletionTimeInDays,
        @Nullable Input<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> type) {
        this.certificateAuthorityConfiguration = Objects.requireNonNull(certificateAuthorityConfiguration, "expected parameter 'certificateAuthorityConfiguration' to be non-null");
        this.enabled = enabled;
        this.permanentDeletionTimeInDays = permanentDeletionTimeInDays;
        this.revocationConfiguration = revocationConfiguration;
        this.tags = tags;
        this.type = type;
    }

    private CertificateAuthorityArgs() {
        this.certificateAuthorityConfiguration = Input.empty();
        this.enabled = Input.empty();
        this.permanentDeletionTimeInDays = Input.empty();
        this.revocationConfiguration = Input.empty();
        this.tags = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<CertificateAuthorityCertificateAuthorityConfigurationArgs> certificateAuthorityConfiguration;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> permanentDeletionTimeInDays;
        private @Nullable Input<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityConfiguration = defaults.certificateAuthorityConfiguration;
    	      this.enabled = defaults.enabled;
    	      this.permanentDeletionTimeInDays = defaults.permanentDeletionTimeInDays;
    	      this.revocationConfiguration = defaults.revocationConfiguration;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder certificateAuthorityConfiguration(Input<CertificateAuthorityCertificateAuthorityConfigurationArgs> certificateAuthorityConfiguration) {
            this.certificateAuthorityConfiguration = Objects.requireNonNull(certificateAuthorityConfiguration);
            return this;
        }

        public Builder certificateAuthorityConfiguration(CertificateAuthorityCertificateAuthorityConfigurationArgs certificateAuthorityConfiguration) {
            this.certificateAuthorityConfiguration = Input.of(Objects.requireNonNull(certificateAuthorityConfiguration));
            return this;
        }

        public Builder enabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder permanentDeletionTimeInDays(@Nullable Input<Integer> permanentDeletionTimeInDays) {
            this.permanentDeletionTimeInDays = permanentDeletionTimeInDays;
            return this;
        }

        public Builder permanentDeletionTimeInDays(@Nullable Integer permanentDeletionTimeInDays) {
            this.permanentDeletionTimeInDays = Input.ofNullable(permanentDeletionTimeInDays);
            return this;
        }

        public Builder revocationConfiguration(@Nullable Input<CertificateAuthorityRevocationConfigurationArgs> revocationConfiguration) {
            this.revocationConfiguration = revocationConfiguration;
            return this;
        }

        public Builder revocationConfiguration(@Nullable CertificateAuthorityRevocationConfigurationArgs revocationConfiguration) {
            this.revocationConfiguration = Input.ofNullable(revocationConfiguration);
            return this;
        }

        public Builder tags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder type(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder type(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public CertificateAuthorityArgs build() {
            return new CertificateAuthorityArgs(certificateAuthorityConfiguration, enabled, permanentDeletionTimeInDays, revocationConfiguration, tags, type);
        }
    }
}
