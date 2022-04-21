// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs Empty = new CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs();

    /**
     * An ObjectId specifies an object identifier (OID). These provide context and describe types in ASN.1 messages.
     * 
     */
    @Import(name="objectIdPaths", required=true)
    private Output<List<Integer>> objectIdPaths;

    public Output<List<Integer>> objectIdPaths() {
        return this.objectIdPaths;
    }

    private CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs() {}

    private CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs(CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs $) {
        this.objectIdPaths = $.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs $;

        public Builder() {
            $ = new CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs();
        }

        public Builder(CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs defaults) {
            $ = new CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs(Objects.requireNonNull(defaults));
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

        public CertificateConfigX509ConfigAdditionalExtensionObjectIdArgs build() {
            $.objectIdPaths = Objects.requireNonNull($.objectIdPaths, "expected parameter 'objectIdPaths' to be non-null");
            return $;
        }
    }

}
