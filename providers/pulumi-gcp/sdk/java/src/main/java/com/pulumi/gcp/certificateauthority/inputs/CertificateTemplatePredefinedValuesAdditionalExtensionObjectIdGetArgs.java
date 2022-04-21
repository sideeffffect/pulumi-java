// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.certificateauthority.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.List;
import java.util.Objects;


public final class CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs Empty = new CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs();

    /**
     * Required. The parts of an OID path. The most significant parts of the path come first.
     * 
     */
    @Import(name="objectIdPaths", required=true)
    private Output<List<Integer>> objectIdPaths;

    public Output<List<Integer>> objectIdPaths() {
        return this.objectIdPaths;
    }

    private CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs() {}

    private CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs(CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs $) {
        this.objectIdPaths = $.objectIdPaths;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs $;

        public Builder() {
            $ = new CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs();
        }

        public Builder(CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs defaults) {
            $ = new CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs(Objects.requireNonNull(defaults));
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

        public CertificateTemplatePredefinedValuesAdditionalExtensionObjectIdGetArgs build() {
            $.objectIdPaths = Objects.requireNonNull($.objectIdPaths, "expected parameter 'objectIdPaths' to be non-null");
            return $;
        }
    }

}
