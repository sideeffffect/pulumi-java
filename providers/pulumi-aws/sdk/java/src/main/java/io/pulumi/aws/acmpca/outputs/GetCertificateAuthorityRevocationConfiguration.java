// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.outputs;

import io.pulumi.aws.acmpca.outputs.GetCertificateAuthorityRevocationConfigurationCrlConfiguration;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCertificateAuthorityRevocationConfiguration {
    private final List<GetCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfigurations;

    @OutputCustomType.Constructor
    private GetCertificateAuthorityRevocationConfiguration(@OutputCustomType.Parameter("crlConfigurations") List<GetCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfigurations) {
        this.crlConfigurations = crlConfigurations;
    }

    public List<GetCertificateAuthorityRevocationConfigurationCrlConfiguration> getCrlConfigurations() {
        return this.crlConfigurations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateAuthorityRevocationConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfigurations;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateAuthorityRevocationConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crlConfigurations = defaults.crlConfigurations;
        }

        public Builder crlConfigurations(List<GetCertificateAuthorityRevocationConfigurationCrlConfiguration> crlConfigurations) {
            this.crlConfigurations = Objects.requireNonNull(crlConfigurations);
            return this;
        }
        public GetCertificateAuthorityRevocationConfiguration build() {
            return new GetCertificateAuthorityRevocationConfiguration(crlConfigurations);
        }
    }
}
