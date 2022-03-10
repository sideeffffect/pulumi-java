// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.privateca_v1beta1;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.privateca_v1beta1.enums.CertificateAuthorityTier;
import io.pulumi.googlenative.privateca_v1beta1.enums.CertificateAuthorityType;
import io.pulumi.googlenative.privateca_v1beta1.inputs.CertificateAuthorityPolicyArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.CertificateConfigArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.IssuingOptionsArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.KeyVersionSpecArgs;
import io.pulumi.googlenative.privateca_v1beta1.inputs.SubordinateConfigArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityArgs Empty = new CertificateAuthorityArgs();

    @InputImport(name="certificateAuthorityId", required=true)
      private final Input<String> certificateAuthorityId;

    public Input<String> getCertificateAuthorityId() {
        return this.certificateAuthorityId;
    }

    /**
     * Optional. The CertificateAuthorityPolicy to enforce when issuing Certificates from this CertificateAuthority.
     * 
     */
    @InputImport(name="certificatePolicy")
      private final @Nullable Input<CertificateAuthorityPolicyArgs> certificatePolicy;

    public Input<CertificateAuthorityPolicyArgs> getCertificatePolicy() {
        return this.certificatePolicy == null ? Input.empty() : this.certificatePolicy;
    }

    /**
     * Immutable. The config used to create a self-signed X.509 certificate or CSR.
     * 
     */
    @InputImport(name="config", required=true)
      private final Input<CertificateConfigArgs> config;

    public Input<CertificateConfigArgs> getConfig() {
        return this.config;
    }

    /**
     * Immutable. The name of a Cloud Storage bucket where this CertificateAuthority will publish content, such as the CA certificate and CRLs. This must be a bucket name, without any prefixes (such as `gs://`) or suffixes (such as `.googleapis.com`). For example, to use a bucket named `my-bucket`, you would simply specify `my-bucket`. If not specified, a managed bucket will be created.
     * 
     */
    @InputImport(name="gcsBucket")
      private final @Nullable Input<String> gcsBucket;

    public Input<String> getGcsBucket() {
        return this.gcsBucket == null ? Input.empty() : this.gcsBucket;
    }

    /**
     * Optional. The IssuingOptions to follow when issuing Certificates from this CertificateAuthority.
     * 
     */
    @InputImport(name="issuingOptions")
      private final @Nullable Input<IssuingOptionsArgs> issuingOptions;

    public Input<IssuingOptionsArgs> getIssuingOptions() {
        return this.issuingOptions == null ? Input.empty() : this.issuingOptions;
    }

    /**
     * Immutable. Used when issuing certificates for this CertificateAuthority. If this CertificateAuthority is a self-signed CertificateAuthority, this key is also used to sign the self-signed CA certificate. Otherwise, it is used to sign a CSR.
     * 
     */
    @InputImport(name="keySpec", required=true)
      private final Input<KeyVersionSpecArgs> keySpec;

    public Input<KeyVersionSpecArgs> getKeySpec() {
        return this.keySpec;
    }

    /**
     * Optional. Labels with user-defined metadata.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The desired lifetime of the CA certificate. Used to create the "not_before_time" and "not_after_time" fields inside an X.509 certificate.
     * 
     */
    @InputImport(name="lifetime", required=true)
      private final Input<String> lifetime;

    public Input<String> getLifetime() {
        return this.lifetime;
    }

    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="requestId")
      private final @Nullable Input<String> requestId;

    public Input<String> getRequestId() {
        return this.requestId == null ? Input.empty() : this.requestId;
    }

    /**
     * Optional. If this is a subordinate CertificateAuthority, this field will be set with the subordinate configuration, which describes its issuers. This may be updated, but this CertificateAuthority must continue to validate.
     * 
     */
    @InputImport(name="subordinateConfig")
      private final @Nullable Input<SubordinateConfigArgs> subordinateConfig;

    public Input<SubordinateConfigArgs> getSubordinateConfig() {
        return this.subordinateConfig == null ? Input.empty() : this.subordinateConfig;
    }

    /**
     * Immutable. The Tier of this CertificateAuthority.
     * 
     */
    @InputImport(name="tier", required=true)
      private final Input<CertificateAuthorityTier> tier;

    public Input<CertificateAuthorityTier> getTier() {
        return this.tier;
    }

    /**
     * Immutable. The Type of this CertificateAuthority.
     * 
     */
    @InputImport(name="type", required=true)
      private final Input<CertificateAuthorityType> type;

    public Input<CertificateAuthorityType> getType() {
        return this.type;
    }

    public CertificateAuthorityArgs(
        Input<String> certificateAuthorityId,
        @Nullable Input<CertificateAuthorityPolicyArgs> certificatePolicy,
        Input<CertificateConfigArgs> config,
        @Nullable Input<String> gcsBucket,
        @Nullable Input<IssuingOptionsArgs> issuingOptions,
        Input<KeyVersionSpecArgs> keySpec,
        @Nullable Input<Map<String,String>> labels,
        Input<String> lifetime,
        @Nullable Input<String> location,
        @Nullable Input<String> project,
        @Nullable Input<String> requestId,
        @Nullable Input<SubordinateConfigArgs> subordinateConfig,
        Input<CertificateAuthorityTier> tier,
        Input<CertificateAuthorityType> type) {
        this.certificateAuthorityId = Objects.requireNonNull(certificateAuthorityId, "expected parameter 'certificateAuthorityId' to be non-null");
        this.certificatePolicy = certificatePolicy;
        this.config = Objects.requireNonNull(config, "expected parameter 'config' to be non-null");
        this.gcsBucket = gcsBucket;
        this.issuingOptions = issuingOptions;
        this.keySpec = Objects.requireNonNull(keySpec, "expected parameter 'keySpec' to be non-null");
        this.labels = labels;
        this.lifetime = Objects.requireNonNull(lifetime, "expected parameter 'lifetime' to be non-null");
        this.location = location;
        this.project = project;
        this.requestId = requestId;
        this.subordinateConfig = subordinateConfig;
        this.tier = Objects.requireNonNull(tier, "expected parameter 'tier' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private CertificateAuthorityArgs() {
        this.certificateAuthorityId = Input.empty();
        this.certificatePolicy = Input.empty();
        this.config = Input.empty();
        this.gcsBucket = Input.empty();
        this.issuingOptions = Input.empty();
        this.keySpec = Input.empty();
        this.labels = Input.empty();
        this.lifetime = Input.empty();
        this.location = Input.empty();
        this.project = Input.empty();
        this.requestId = Input.empty();
        this.subordinateConfig = Input.empty();
        this.tier = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> certificateAuthorityId;
        private @Nullable Input<CertificateAuthorityPolicyArgs> certificatePolicy;
        private Input<CertificateConfigArgs> config;
        private @Nullable Input<String> gcsBucket;
        private @Nullable Input<IssuingOptionsArgs> issuingOptions;
        private Input<KeyVersionSpecArgs> keySpec;
        private @Nullable Input<Map<String,String>> labels;
        private Input<String> lifetime;
        private @Nullable Input<String> location;
        private @Nullable Input<String> project;
        private @Nullable Input<String> requestId;
        private @Nullable Input<SubordinateConfigArgs> subordinateConfig;
        private Input<CertificateAuthorityTier> tier;
        private Input<CertificateAuthorityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityId = defaults.certificateAuthorityId;
    	      this.certificatePolicy = defaults.certificatePolicy;
    	      this.config = defaults.config;
    	      this.gcsBucket = defaults.gcsBucket;
    	      this.issuingOptions = defaults.issuingOptions;
    	      this.keySpec = defaults.keySpec;
    	      this.labels = defaults.labels;
    	      this.lifetime = defaults.lifetime;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.subordinateConfig = defaults.subordinateConfig;
    	      this.tier = defaults.tier;
    	      this.type = defaults.type;
        }

        public Builder certificateAuthorityId(Input<String> certificateAuthorityId) {
            this.certificateAuthorityId = Objects.requireNonNull(certificateAuthorityId);
            return this;
        }

        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = Input.of(Objects.requireNonNull(certificateAuthorityId));
            return this;
        }

        public Builder certificatePolicy(@Nullable Input<CertificateAuthorityPolicyArgs> certificatePolicy) {
            this.certificatePolicy = certificatePolicy;
            return this;
        }

        public Builder certificatePolicy(@Nullable CertificateAuthorityPolicyArgs certificatePolicy) {
            this.certificatePolicy = Input.ofNullable(certificatePolicy);
            return this;
        }

        public Builder config(Input<CertificateConfigArgs> config) {
            this.config = Objects.requireNonNull(config);
            return this;
        }

        public Builder config(CertificateConfigArgs config) {
            this.config = Input.of(Objects.requireNonNull(config));
            return this;
        }

        public Builder gcsBucket(@Nullable Input<String> gcsBucket) {
            this.gcsBucket = gcsBucket;
            return this;
        }

        public Builder gcsBucket(@Nullable String gcsBucket) {
            this.gcsBucket = Input.ofNullable(gcsBucket);
            return this;
        }

        public Builder issuingOptions(@Nullable Input<IssuingOptionsArgs> issuingOptions) {
            this.issuingOptions = issuingOptions;
            return this;
        }

        public Builder issuingOptions(@Nullable IssuingOptionsArgs issuingOptions) {
            this.issuingOptions = Input.ofNullable(issuingOptions);
            return this;
        }

        public Builder keySpec(Input<KeyVersionSpecArgs> keySpec) {
            this.keySpec = Objects.requireNonNull(keySpec);
            return this;
        }

        public Builder keySpec(KeyVersionSpecArgs keySpec) {
            this.keySpec = Input.of(Objects.requireNonNull(keySpec));
            return this;
        }

        public Builder labels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder lifetime(Input<String> lifetime) {
            this.lifetime = Objects.requireNonNull(lifetime);
            return this;
        }

        public Builder lifetime(String lifetime) {
            this.lifetime = Input.of(Objects.requireNonNull(lifetime));
            return this;
        }

        public Builder location(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder project(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder requestId(@Nullable Input<String> requestId) {
            this.requestId = requestId;
            return this;
        }

        public Builder requestId(@Nullable String requestId) {
            this.requestId = Input.ofNullable(requestId);
            return this;
        }

        public Builder subordinateConfig(@Nullable Input<SubordinateConfigArgs> subordinateConfig) {
            this.subordinateConfig = subordinateConfig;
            return this;
        }

        public Builder subordinateConfig(@Nullable SubordinateConfigArgs subordinateConfig) {
            this.subordinateConfig = Input.ofNullable(subordinateConfig);
            return this;
        }

        public Builder tier(Input<CertificateAuthorityTier> tier) {
            this.tier = Objects.requireNonNull(tier);
            return this;
        }

        public Builder tier(CertificateAuthorityTier tier) {
            this.tier = Input.of(Objects.requireNonNull(tier));
            return this;
        }

        public Builder type(Input<CertificateAuthorityType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(CertificateAuthorityType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }
        public CertificateAuthorityArgs build() {
            return new CertificateAuthorityArgs(certificateAuthorityId, certificatePolicy, config, gcsBucket, issuingOptions, keySpec, labels, lifetime, location, project, requestId, subordinateConfig, tier, type);
        }
    }
}
