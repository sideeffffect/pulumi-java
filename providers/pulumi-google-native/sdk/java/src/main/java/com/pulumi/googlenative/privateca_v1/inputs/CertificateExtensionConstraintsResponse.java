// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.privateca_v1.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.privateca_v1.inputs.ObjectIdResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes a set of X.509 extensions that may be part of some certificate issuance controls.
 * 
 */
public final class CertificateExtensionConstraintsResponse extends com.pulumi.resources.InvokeArgs {

    public static final CertificateExtensionConstraintsResponse Empty = new CertificateExtensionConstraintsResponse();

    /**
     * Optional. A set of ObjectIds identifying custom X.509 extensions. Will be combined with known_extensions to determine the full set of X.509 extensions.
     * 
     */
    @Import(name="additionalExtensions", required=true)
    private List<ObjectIdResponse> additionalExtensions;

    public List<ObjectIdResponse> additionalExtensions() {
        return this.additionalExtensions;
    }

    /**
     * Optional. A set of named X.509 extensions. Will be combined with additional_extensions to determine the full set of X.509 extensions.
     * 
     */
    @Import(name="knownExtensions", required=true)
    private List<String> knownExtensions;

    public List<String> knownExtensions() {
        return this.knownExtensions;
    }

    private CertificateExtensionConstraintsResponse() {}

    private CertificateExtensionConstraintsResponse(CertificateExtensionConstraintsResponse $) {
        this.additionalExtensions = $.additionalExtensions;
        this.knownExtensions = $.knownExtensions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertificateExtensionConstraintsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertificateExtensionConstraintsResponse $;

        public Builder() {
            $ = new CertificateExtensionConstraintsResponse();
        }

        public Builder(CertificateExtensionConstraintsResponse defaults) {
            $ = new CertificateExtensionConstraintsResponse(Objects.requireNonNull(defaults));
        }

        public Builder additionalExtensions(List<ObjectIdResponse> additionalExtensions) {
            $.additionalExtensions = additionalExtensions;
            return this;
        }

        public Builder additionalExtensions(ObjectIdResponse... additionalExtensions) {
            return additionalExtensions(List.of(additionalExtensions));
        }

        public Builder knownExtensions(List<String> knownExtensions) {
            $.knownExtensions = knownExtensions;
            return this;
        }

        public Builder knownExtensions(String... knownExtensions) {
            return knownExtensions(List.of(knownExtensions));
        }

        public CertificateExtensionConstraintsResponse build() {
            $.additionalExtensions = Objects.requireNonNull($.additionalExtensions, "expected parameter 'additionalExtensions' to be non-null");
            $.knownExtensions = Objects.requireNonNull($.knownExtensions, "expected parameter 'knownExtensions' to be non-null");
            return $;
        }
    }

}
