// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudhsmv2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetClusterClusterCertificates {
    private final String awsHardwareCertificate;
    private final String clusterCertificate;
    private final String clusterCsr;
    private final String hsmCertificate;
    private final String manufacturerHardwareCertificate;

    @CustomType.Constructor
    private GetClusterClusterCertificates(
        @CustomType.Parameter("awsHardwareCertificate") String awsHardwareCertificate,
        @CustomType.Parameter("clusterCertificate") String clusterCertificate,
        @CustomType.Parameter("clusterCsr") String clusterCsr,
        @CustomType.Parameter("hsmCertificate") String hsmCertificate,
        @CustomType.Parameter("manufacturerHardwareCertificate") String manufacturerHardwareCertificate) {
        this.awsHardwareCertificate = awsHardwareCertificate;
        this.clusterCertificate = clusterCertificate;
        this.clusterCsr = clusterCsr;
        this.hsmCertificate = hsmCertificate;
        this.manufacturerHardwareCertificate = manufacturerHardwareCertificate;
    }

    public String awsHardwareCertificate() {
        return this.awsHardwareCertificate;
    }
    public String clusterCertificate() {
        return this.clusterCertificate;
    }
    public String clusterCsr() {
        return this.clusterCsr;
    }
    public String hsmCertificate() {
        return this.hsmCertificate;
    }
    public String manufacturerHardwareCertificate() {
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
        }        public GetClusterClusterCertificates build() {
            return new GetClusterClusterCertificates(awsHardwareCertificate, clusterCertificate, clusterCsr, hsmCertificate, manufacturerHardwareCertificate);
        }
    }
}
