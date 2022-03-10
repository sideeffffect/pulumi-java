// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionViewerCertificate {
    private final @Nullable String acmCertificateArn;
    private final @Nullable Boolean cloudFrontDefaultCertificate;
    private final @Nullable String iamCertificateId;
    private final @Nullable String minimumProtocolVersion;
    private final @Nullable String sslSupportMethod;

    @OutputCustomType.Constructor
    private DistributionViewerCertificate(
        @OutputCustomType.Parameter("acmCertificateArn") @Nullable String acmCertificateArn,
        @OutputCustomType.Parameter("cloudFrontDefaultCertificate") @Nullable Boolean cloudFrontDefaultCertificate,
        @OutputCustomType.Parameter("iamCertificateId") @Nullable String iamCertificateId,
        @OutputCustomType.Parameter("minimumProtocolVersion") @Nullable String minimumProtocolVersion,
        @OutputCustomType.Parameter("sslSupportMethod") @Nullable String sslSupportMethod) {
        this.acmCertificateArn = acmCertificateArn;
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
        this.iamCertificateId = iamCertificateId;
        this.minimumProtocolVersion = minimumProtocolVersion;
        this.sslSupportMethod = sslSupportMethod;
    }

    public Optional<String> getAcmCertificateArn() {
        return Optional.ofNullable(this.acmCertificateArn);
    }
    public Optional<Boolean> getCloudFrontDefaultCertificate() {
        return Optional.ofNullable(this.cloudFrontDefaultCertificate);
    }
    public Optional<String> getIamCertificateId() {
        return Optional.ofNullable(this.iamCertificateId);
    }
    public Optional<String> getMinimumProtocolVersion() {
        return Optional.ofNullable(this.minimumProtocolVersion);
    }
    public Optional<String> getSslSupportMethod() {
        return Optional.ofNullable(this.sslSupportMethod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionViewerCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acmCertificateArn;
        private @Nullable Boolean cloudFrontDefaultCertificate;
        private @Nullable String iamCertificateId;
        private @Nullable String minimumProtocolVersion;
        private @Nullable String sslSupportMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionViewerCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acmCertificateArn = defaults.acmCertificateArn;
    	      this.cloudFrontDefaultCertificate = defaults.cloudFrontDefaultCertificate;
    	      this.iamCertificateId = defaults.iamCertificateId;
    	      this.minimumProtocolVersion = defaults.minimumProtocolVersion;
    	      this.sslSupportMethod = defaults.sslSupportMethod;
        }

        public Builder acmCertificateArn(@Nullable String acmCertificateArn) {
            this.acmCertificateArn = acmCertificateArn;
            return this;
        }

        public Builder cloudFrontDefaultCertificate(@Nullable Boolean cloudFrontDefaultCertificate) {
            this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
            return this;
        }

        public Builder iamCertificateId(@Nullable String iamCertificateId) {
            this.iamCertificateId = iamCertificateId;
            return this;
        }

        public Builder minimumProtocolVersion(@Nullable String minimumProtocolVersion) {
            this.minimumProtocolVersion = minimumProtocolVersion;
            return this;
        }

        public Builder sslSupportMethod(@Nullable String sslSupportMethod) {
            this.sslSupportMethod = sslSupportMethod;
            return this;
        }
        public DistributionViewerCertificate build() {
            return new DistributionViewerCertificate(acmCertificateArn, cloudFrontDefaultCertificate, iamCertificateId, minimumProtocolVersion, sslSupportMethod);
        }
    }
}
