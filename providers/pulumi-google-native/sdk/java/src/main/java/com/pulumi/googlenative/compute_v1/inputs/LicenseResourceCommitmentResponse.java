// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Commitment for a particular license resource.
 * 
 */
public final class LicenseResourceCommitmentResponse extends com.pulumi.resources.InvokeArgs {

    public static final LicenseResourceCommitmentResponse Empty = new LicenseResourceCommitmentResponse();

    /**
     * The number of licenses purchased.
     * 
     */
    @Import(name="amount", required=true)
    private String amount;

    public String amount() {
        return this.amount;
    }

    /**
     * Specifies the core range of the instance for which this license applies.
     * 
     */
    @Import(name="coresPerLicense", required=true)
    private String coresPerLicense;

    public String coresPerLicense() {
        return this.coresPerLicense;
    }

    /**
     * Any applicable license URI.
     * 
     */
    @Import(name="license", required=true)
    private String license;

    public String license() {
        return this.license;
    }

    private LicenseResourceCommitmentResponse() {}

    private LicenseResourceCommitmentResponse(LicenseResourceCommitmentResponse $) {
        this.amount = $.amount;
        this.coresPerLicense = $.coresPerLicense;
        this.license = $.license;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicenseResourceCommitmentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicenseResourceCommitmentResponse $;

        public Builder() {
            $ = new LicenseResourceCommitmentResponse();
        }

        public Builder(LicenseResourceCommitmentResponse defaults) {
            $ = new LicenseResourceCommitmentResponse(Objects.requireNonNull(defaults));
        }

        public Builder amount(String amount) {
            $.amount = amount;
            return this;
        }

        public Builder coresPerLicense(String coresPerLicense) {
            $.coresPerLicense = coresPerLicense;
            return this;
        }

        public Builder license(String license) {
            $.license = license;
            return this;
        }

        public LicenseResourceCommitmentResponse build() {
            $.amount = Objects.requireNonNull($.amount, "expected parameter 'amount' to be non-null");
            $.coresPerLicense = Objects.requireNonNull($.coresPerLicense, "expected parameter 'coresPerLicense' to be non-null");
            $.license = Objects.requireNonNull($.license, "expected parameter 'license' to be non-null");
            return $;
        }
    }

}
