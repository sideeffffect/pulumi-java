// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.lightsail.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCertificatePlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetCertificatePlainArgs Empty = new GetCertificatePlainArgs();

    /**
     * The name for the certificate.
     * 
     */
    @Import(name="certificateName", required=true)
    private String certificateName;

    /**
     * @return The name for the certificate.
     * 
     */
    public String certificateName() {
        return this.certificateName;
    }

    private GetCertificatePlainArgs() {}

    private GetCertificatePlainArgs(GetCertificatePlainArgs $) {
        this.certificateName = $.certificateName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetCertificatePlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetCertificatePlainArgs $;

        public Builder() {
            $ = new GetCertificatePlainArgs();
        }

        public Builder(GetCertificatePlainArgs defaults) {
            $ = new GetCertificatePlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param certificateName The name for the certificate.
         * 
         * @return builder
         * 
         */
        public Builder certificateName(String certificateName) {
            $.certificateName = certificateName;
            return this;
        }

        public GetCertificatePlainArgs build() {
            $.certificateName = Objects.requireNonNull($.certificateName, "expected parameter 'certificateName' to be non-null");
            return $;
        }
    }

}
