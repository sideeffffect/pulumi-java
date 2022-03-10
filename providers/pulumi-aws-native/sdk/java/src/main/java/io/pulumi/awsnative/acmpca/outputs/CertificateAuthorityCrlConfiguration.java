// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.acmpca.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class CertificateAuthorityCrlConfiguration {
    private final @Nullable String customCname;
    private final @Nullable Boolean enabled;
    private final @Nullable Integer expirationInDays;
    private final @Nullable String s3BucketName;
    private final @Nullable String s3ObjectAcl;

    @OutputCustomType.Constructor
    private CertificateAuthorityCrlConfiguration(
        @OutputCustomType.Parameter("customCname") @Nullable String customCname,
        @OutputCustomType.Parameter("enabled") @Nullable Boolean enabled,
        @OutputCustomType.Parameter("expirationInDays") @Nullable Integer expirationInDays,
        @OutputCustomType.Parameter("s3BucketName") @Nullable String s3BucketName,
        @OutputCustomType.Parameter("s3ObjectAcl") @Nullable String s3ObjectAcl) {
        this.customCname = customCname;
        this.enabled = enabled;
        this.expirationInDays = expirationInDays;
        this.s3BucketName = s3BucketName;
        this.s3ObjectAcl = s3ObjectAcl;
    }

    public Optional<String> getCustomCname() {
        return Optional.ofNullable(this.customCname);
    }
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<Integer> getExpirationInDays() {
        return Optional.ofNullable(this.expirationInDays);
    }
    public Optional<String> getS3BucketName() {
        return Optional.ofNullable(this.s3BucketName);
    }
    public Optional<String> getS3ObjectAcl() {
        return Optional.ofNullable(this.s3ObjectAcl);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityCrlConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customCname;
        private @Nullable Boolean enabled;
        private @Nullable Integer expirationInDays;
        private @Nullable String s3BucketName;
        private @Nullable String s3ObjectAcl;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityCrlConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customCname = defaults.customCname;
    	      this.enabled = defaults.enabled;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3ObjectAcl = defaults.s3ObjectAcl;
        }

        public Builder customCname(@Nullable String customCname) {
            this.customCname = customCname;
            return this;
        }

        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder expirationInDays(@Nullable Integer expirationInDays) {
            this.expirationInDays = expirationInDays;
            return this;
        }

        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }

        public Builder s3ObjectAcl(@Nullable String s3ObjectAcl) {
            this.s3ObjectAcl = s3ObjectAcl;
            return this;
        }
        public CertificateAuthorityCrlConfiguration build() {
            return new CertificateAuthorityCrlConfiguration(customCname, enabled, expirationInDays, s3BucketName, s3ObjectAcl);
        }
    }
}
