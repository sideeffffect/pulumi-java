// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs Empty = new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs();

    @Import(name="obectIds")
      private final @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds;

    public Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds() {
        return this.obectIds == null ? Codegen.empty() : this.obectIds;
    }

    public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds) {
        this.obectIds = obectIds;
    }

    private CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs() {
        this.obectIds = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.obectIds = defaults.obectIds;
        }

        public Builder obectIds(@Nullable Output<List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs>> obectIds) {
            this.obectIds = obectIds;
            return this;
        }
        public Builder obectIds(@Nullable List<CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs> obectIds) {
            this.obectIds = Codegen.ofNullable(obectIds);
            return this;
        }
        public Builder obectIds(CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageObectIdArgs... obectIds) {
            return obectIds(List.of(obectIds));
        }        public CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs build() {
            return new CertificateCertificateDescriptionConfigValueKeyUsageUnknownExtendedKeyUsageArgs(obectIds);
        }
    }
}
