// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs Empty = new CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs();

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    @Import(name="objectIdPaths", required=true)
    private Output<List<Integer>> objectIdPaths;

    public Output<List<Integer>> objectIdPaths() {
        return this.objectIdPaths;
    }

    private CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs() {}

    private CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs(CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs $) {
        this.objectIdPaths = $.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs $;

        public Builder() {
            $ = new CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs();
        }

        public Builder(CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs defaults) {
            $ = new CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs(Objects.requireNonNull(defaults));
        }

        public Builder objectIdPaths(Output<List<Integer>> objectIdPaths) {
            $.objectIdPaths = objectIdPaths;
            return this;
        }

        public Builder objectIdPaths(List<Integer> objectIdPaths) {
            return objectIdPaths(Output.of(objectIdPaths));
        }

        public Builder objectIdPaths(Integer... objectIdPaths) {
            return objectIdPaths(List.of(objectIdPaths));
        }

        public CertificateConfigX509ConfigKeyUsageUnknownExtendedKeyUsageArgs build() {
            $.objectIdPaths = Objects.requireNonNull($.objectIdPaths, "expected parameter 'objectIdPaths' to be non-null");
            return $;
        }
    }

}
