// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class MangedSslCertificateManaged {
    private final List<String> domains;

    @OutputCustomType.Constructor
    private MangedSslCertificateManaged(@OutputCustomType.Parameter("domains") List<String> domains) {
        this.domains = domains;
    }

    public List<String> getDomains() {
        return this.domains;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MangedSslCertificateManaged defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> domains;

        public Builder() {
    	      // Empty
        }

        public Builder(MangedSslCertificateManaged defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
        }

        public Builder domains(List<String> domains) {
            this.domains = Objects.requireNonNull(domains);
            return this;
        }
        public MangedSslCertificateManaged build() {
            return new MangedSslCertificateManaged(domains);
        }
    }
}
