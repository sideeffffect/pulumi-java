// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetCertificateAuthorityRevocationConfigurationCrlConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final GetCertificateAuthorityRevocationConfigurationCrlConfiguration Empty = new GetCertificateAuthorityRevocationConfigurationCrlConfiguration();

    @Import(name="customCname", required=true)
      private final String customCname;

    public String customCname() {
        return this.customCname;
    }

    @Import(name="enabled", required=true)
      private final Boolean enabled;

    public Boolean enabled() {
        return this.enabled;
    }

    @Import(name="expirationInDays", required=true)
      private final Integer expirationInDays;

    public Integer expirationInDays() {
        return this.expirationInDays;
    }

    @Import(name="s3BucketName", required=true)
      private final String s3BucketName;

    public String s3BucketName() {
        return this.s3BucketName;
    }

    @Import(name="s3ObjectAcl", required=true)
      private final String s3ObjectAcl;

    public String s3ObjectAcl() {
        return this.s3ObjectAcl;
    }

    public GetCertificateAuthorityRevocationConfigurationCrlConfiguration(
        String customCname,
        Boolean enabled,
        Integer expirationInDays,
        String s3BucketName,
        String s3ObjectAcl) {
        this.customCname = Objects.requireNonNull(customCname, "expected parameter 'customCname' to be non-null");
        this.enabled = Objects.requireNonNull(enabled, "expected parameter 'enabled' to be non-null");
        this.expirationInDays = Objects.requireNonNull(expirationInDays, "expected parameter 'expirationInDays' to be non-null");
        this.s3BucketName = Objects.requireNonNull(s3BucketName, "expected parameter 's3BucketName' to be non-null");
        this.s3ObjectAcl = Objects.requireNonNull(s3ObjectAcl, "expected parameter 's3ObjectAcl' to be non-null");
    }

    private GetCertificateAuthorityRevocationConfigurationCrlConfiguration() {
        this.customCname = null;
        this.enabled = null;
        this.expirationInDays = null;
        this.s3BucketName = null;
        this.s3ObjectAcl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityRevocationConfigurationCrlConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customCname;
        private Boolean enabled;
        private Integer expirationInDays;
        private String s3BucketName;
        private String s3ObjectAcl;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityRevocationConfigurationCrlConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customCname = defaults.customCname;
    	      this.enabled = defaults.enabled;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3ObjectAcl = defaults.s3ObjectAcl;
        }

        public Builder customCname(String customCname) {
            this.customCname = Objects.requireNonNull(customCname);
            return this;
        }
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public Builder expirationInDays(Integer expirationInDays) {
            this.expirationInDays = Objects.requireNonNull(expirationInDays);
            return this;
        }
        public Builder s3BucketName(String s3BucketName) {
            this.s3BucketName = Objects.requireNonNull(s3BucketName);
            return this;
        }
        public Builder s3ObjectAcl(String s3ObjectAcl) {
            this.s3ObjectAcl = Objects.requireNonNull(s3ObjectAcl);
            return this;
        }        public GetCertificateAuthorityRevocationConfigurationCrlConfiguration build() {
            return new GetCertificateAuthorityRevocationConfigurationCrlConfiguration(customCname, enabled, expirationInDays, s3BucketName, s3ObjectAcl);
        }
    }
}
