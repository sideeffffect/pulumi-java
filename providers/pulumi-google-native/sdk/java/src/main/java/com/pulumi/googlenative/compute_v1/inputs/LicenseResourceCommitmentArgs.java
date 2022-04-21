// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Commitment for a particular license resource.
 * 
 */
public final class LicenseResourceCommitmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final LicenseResourceCommitmentArgs Empty = new LicenseResourceCommitmentArgs();

    /**
     * The number of licenses purchased.
     * 
     */
    @Import(name="amount")
    private @Nullable Output<String> amount;

    public Optional<Output<String>> amount() {
        return Optional.ofNullable(this.amount);
    }

    /**
     * Specifies the core range of the instance for which this license applies.
     * 
     */
    @Import(name="coresPerLicense")
    private @Nullable Output<String> coresPerLicense;

    public Optional<Output<String>> coresPerLicense() {
        return Optional.ofNullable(this.coresPerLicense);
    }

    /**
     * Any applicable license URI.
     * 
     */
    @Import(name="license")
    private @Nullable Output<String> license;

    public Optional<Output<String>> license() {
        return Optional.ofNullable(this.license);
    }

    private LicenseResourceCommitmentArgs() {}

    private LicenseResourceCommitmentArgs(LicenseResourceCommitmentArgs $) {
        this.amount = $.amount;
        this.coresPerLicense = $.coresPerLicense;
        this.license = $.license;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(LicenseResourceCommitmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private LicenseResourceCommitmentArgs $;

        public Builder() {
            $ = new LicenseResourceCommitmentArgs();
        }

        public Builder(LicenseResourceCommitmentArgs defaults) {
            $ = new LicenseResourceCommitmentArgs(Objects.requireNonNull(defaults));
        }

        public Builder amount(@Nullable Output<String> amount) {
            $.amount = amount;
            return this;
        }

        public Builder amount(String amount) {
            return amount(Output.of(amount));
        }

        public Builder coresPerLicense(@Nullable Output<String> coresPerLicense) {
            $.coresPerLicense = coresPerLicense;
            return this;
        }

        public Builder coresPerLicense(String coresPerLicense) {
            return coresPerLicense(Output.of(coresPerLicense));
        }

        public Builder license(@Nullable Output<String> license) {
            $.license = license;
            return this;
        }

        public Builder license(String license) {
            return license(Output.of(license));
        }

        public LicenseResourceCommitmentArgs build() {
            return $;
        }
    }

}
