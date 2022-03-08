// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.signer.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetSigningProfileRevocationRecord {
    private final String revocationEffectiveFrom;
    private final String revokedAt;
    private final String revokedBy;

    @OutputCustomType.Constructor({"revocationEffectiveFrom","revokedAt","revokedBy"})
    private GetSigningProfileRevocationRecord(
        String revocationEffectiveFrom,
        String revokedAt,
        String revokedBy) {
        this.revocationEffectiveFrom = revocationEffectiveFrom;
        this.revokedAt = revokedAt;
        this.revokedBy = revokedBy;
    }

    public String getRevocationEffectiveFrom() {
        return this.revocationEffectiveFrom;
    }
    public String getRevokedAt() {
        return this.revokedAt;
    }
    public String getRevokedBy() {
        return this.revokedBy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSigningProfileRevocationRecord defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String revocationEffectiveFrom;
        private String revokedAt;
        private String revokedBy;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSigningProfileRevocationRecord defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.revocationEffectiveFrom = defaults.revocationEffectiveFrom;
    	      this.revokedAt = defaults.revokedAt;
    	      this.revokedBy = defaults.revokedBy;
        }

        public Builder setRevocationEffectiveFrom(String revocationEffectiveFrom) {
            this.revocationEffectiveFrom = Objects.requireNonNull(revocationEffectiveFrom);
            return this;
        }

        public Builder setRevokedAt(String revokedAt) {
            this.revokedAt = Objects.requireNonNull(revokedAt);
            return this;
        }

        public Builder setRevokedBy(String revokedBy) {
            this.revokedBy = Objects.requireNonNull(revokedBy);
            return this;
        }
        public GetSigningProfileRevocationRecord build() {
            return new GetSigningProfileRevocationRecord(revocationEffectiveFrom, revokedAt, revokedBy);
        }
    }
}
