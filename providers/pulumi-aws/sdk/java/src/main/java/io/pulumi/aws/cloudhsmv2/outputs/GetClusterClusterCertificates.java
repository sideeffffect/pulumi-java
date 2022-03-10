// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudhsmv2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetClusterClusterCertificates {
    private final String awsHardwareCertificate;
    private final String clusterCertificate;
    private final String clusterCsr;
    private final String hsmCertificate;
    private final String manufacturerHardwareCertificate;

    @OutputCustomType.Constructor
    private GetClusterClusterCertificates(
        @OutputCustomType.Parameter("awsHardwareCertificate") String awsHardwareCertificate,
        @OutputCustomType.Parameter("clusterCertificate") String clusterCertificate,
        @OutputCustomType.Parameter("clusterCsr") String clusterCsr,
        @OutputCustomType.Parameter("hsmCertificate") String hsmCertificate,
        @OutputCustomType.Parameter("manufacturerHardwareCertificate") String manufacturerHardwareCertificate) {
        this.awsHardwareCertificate = awsHardwareCertificate;
        this.clusterCertificate = clusterCertificate;
        this.clusterCsr = clusterCsr;
        this.hsmCertificate = hsmCertificate;
        this.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
    }

    public String getAwsHardwareCertificate() {
        return this.awsHardwareCertificate;
    }
    public String getClusterCertificate() {
        return this.clusterCertificate;
    }
    public String getClusterCsr() {
        return this.clusterCsr;
    }
    public String getHsmCertificate() {
        return this.hsmCertificate;
    }
    public String getManufacturerHardwareCertificate() {
        return this.manufacturerHardwareCertificate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterClusterCertificates defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsHardwareCertificate;
        private String clusterCertificate;
        private String clusterCsr;
        private String hsmCertificate;
        private String manufacturerHardwareCertificate;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterClusterCertificates defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsHardwareCertificate = defaults.awsHardwareCertificate;
    	      this.clusterCertificate = defaults.clusterCertificate;
    	      this.clusterCsr = defaults.clusterCsr;
    	      this.hsmCertificate = defaults.hsmCertificate;
    	      this.manufacturerHardwareCertificate = defaults.manufacturerHardwareCertificate;
        }

        public Builder awsHardwareCertificate(String awsHardwareCertificate) {
            this.awsHardwareCertificate = Objects.requireNonNull(awsHardwareCertificate);
            return this;
        }

        public Builder clusterCertificate(String clusterCertificate) {
            this.clusterCertificate = Objects.requireNonNull(clusterCertificate);
            return this;
        }

        public Builder clusterCsr(String clusterCsr) {
            this.clusterCsr = Objects.requireNonNull(clusterCsr);
            return this;
        }

        public Builder hsmCertificate(String hsmCertificate) {
            this.hsmCertificate = Objects.requireNonNull(hsmCertificate);
            return this;
        }

        public Builder manufacturerHardwareCertificate(String manufacturerHardwareCertificate) {
            this.manufacturerHardwareCertificate = Objects.requireNonNull(manufacturerHardwareCertificate);
            return this;
        }
        public GetClusterClusterCertificates build() {
            return new GetClusterClusterCertificates(awsHardwareCertificate, clusterCertificate, clusterCsr, hsmCertificate, manufacturerHardwareCertificate);
        }
    }
}
