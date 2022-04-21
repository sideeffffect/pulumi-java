// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.container_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration for issuance of mTLS keys and certificates to Kubernetes pods.
 * 
 */
public final class WorkloadCertificatesArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadCertificatesArgs Empty = new WorkloadCertificatesArgs();

    /**
     * enable_certificates controls issuance of workload mTLS certificates. If set, the GKE Workload Identity Certificates controller and node agent will be deployed in the cluster, which can then be configured by creating a WorkloadCertificateConfig Custom Resource. Requires Workload Identity (workload_pool must be non-empty).
     * 
     */
    @Import(name="enableCertificates")
    private @Nullable Output<Boolean> enableCertificates;

    public Optional<Output<Boolean>> enableCertificates() {
        return Optional.ofNullable(this.enableCertificates);
    }

    private WorkloadCertificatesArgs() {}

    private WorkloadCertificatesArgs(WorkloadCertificatesArgs $) {
        this.enableCertificates = $.enableCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadCertificatesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadCertificatesArgs $;

        public Builder() {
            $ = new WorkloadCertificatesArgs();
        }

        public Builder(WorkloadCertificatesArgs defaults) {
            $ = new WorkloadCertificatesArgs(Objects.requireNonNull(defaults));
        }

        public Builder enableCertificates(@Nullable Output<Boolean> enableCertificates) {
            $.enableCertificates = enableCertificates;
            return this;
        }

        public Builder enableCertificates(Boolean enableCertificates) {
            return enableCertificates(Output.of(enableCertificates));
        }

        public WorkloadCertificatesArgs build() {
            return $;
        }
    }

}
